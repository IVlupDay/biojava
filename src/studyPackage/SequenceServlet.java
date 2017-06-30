package studyPackage;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import org.biojava.bio.BioException;
import org.biojava.bio.symbol.*;
import org.biojava.bio.seq.*;
import org.biojava.bio.seq.io.*;
import org.biojava.bio.seq.db.*;
 
public class SequenceServlet extends HttpServlet {
    private SequenceDB indexedDB;      // Database to serve
    private SequenceFormat seqFormat;  // Used for writing
 
    public void init(ServletConfig config) 
        throws ServletException
    {
        super.init(config);
        String dbName = config.getInitParameter("sequence.db");
	if (dbName == null)
	    throw new ServletException("Database not specified");
	try {
            TabIndexStore index = TabIndexStore.open(dbName);
            indexedDB = new IndexedSequenceDB(index); 
        } catch (Exception ex) {
	    log("Can't open sequence database: " + dbName, ex);
	    throw new ServletException();
        }
 
	seqFormat = new FastaFormat();
    }
 
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException
    {
        String id = req.getParameter("id");
	if (id == null) {
	    resp.sendError(HttpServletResponse.SC_NOT_FOUND, "No id parameter in request");
            return;
	}
 
	try {
	    Sequence seq = indexedDB.getSequence(id);
	    resp.setContentType("text/plain");
	    PrintStream stream = new PrintStream(resp.getOutputStream());
	    seqFormat.writeSequence(seq, stream);
        } catch (BioException ex) {
	    log("Can't retrieve sequence", ex);
	    resp.sendError(HttpServletResponse.SC_NOT_FOUND, "Couldn't load sequence " + id);
        }
    }
}