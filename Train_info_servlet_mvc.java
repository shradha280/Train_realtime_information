package Current_train_information;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Train_info_servlet_mvc")
public class Train_info_servlet_mvc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Train_info_servlet_mvc() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// step 1: get the student data from helper class (model)
		List<Train_class> train = train_datautil.gettrain();
		
		// step 2: add students to request object
		request.setAttribute("train_list", train);
		
		// step 3: get request dispatcher
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("view_train.jsp");		
		
		// step 4: now forward to JSP
		dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
