package Severlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.CustomerDAOImpl;
import entity.Customer;

/**
 * Servlet implementation class UpdateCustomer
 */
@WebServlet("/UpdateCustomer")
public class UpdateCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateCustomer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("cid");
		CustomerDAOImpl dao = new CustomerDAOImpl();
		Customer cus = dao.getCustomerById(id);
		request.setAttribute("c", cus);
		request.getRequestDispatcher("update.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String pid = request.getParameter("id");
		String pname = request.getParameter("name");
		String pgender = request.getParameter("gender");
		String pbirthday = request.getParameter("birthday");
		String paddress = request.getParameter("address");
		String pphone = request.getParameter("phone");
		String pemail = request.getParameter("email");
		
		CustomerDAOImpl dao = new CustomerDAOImpl();
		dao.updateCustomer(pname, pgender, pbirthday, paddress, pphone, pemail, pid);
		response.sendRedirect("ListCustomer");
	}

}
