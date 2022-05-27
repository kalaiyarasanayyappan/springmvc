package com.chainsys.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class GlobalState
 */
public class GlobalState extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GlobalState() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("html><head><title><SessionState</title></head><body>");
   /*     Enumeration<String> names = request.getParameterNames();
        while(names.hasMoreElements()) {
            String parameterName = names.nextElement();
            System.out.println(parameterName);
           String [] values = request.getParameterValues(parameterName);
           int length = values.length;
           for(int i=0;i<length;i++) {
               System.out.println("Values: "+values[i]);
           }
        }     */
        String submitValue = request.getParameter("submit");
        HttpSession session =request.getSession(true); // creates session ID (token)
        System.out.println(session.getId());
        if (submitValue.equals("set")) {
            String salaryInput = request.getParameter("salary");
              this.getServletContext().setAttribute("globalSalary", salaryInput);                  
       //      session.setAttribute("salary", salaryInput);// store data in session for each user
             // session .setAttribute stores the data in a collection using key and value.
             //   salary= key,salaryInput=value
            out.println("<h1>Value Set</h1>" +salaryInput);

        } else if (submitValue.equals("fetch")) {
            //  String sessionSalary =session.getAttribute("salary").toString(); 
                      // or
            String applicationSalary =(String)this.getServletContext().getAttribute("salary");
            if(applicationSalary == null)
            {
                out.println("<h1>SALARY NOT YET SET !!!</h1>");
            }
            else
            {
            out.println("<h1>Value Fetch</h1>" + applicationSalary); //returning values from sessionAttributes.
            }
        }   
        out.println("    <input type=\"hidden\" value=\"50000\" name=\"bonus\" id=\"bonus\"/>");  
        out.println("</body></html");  
    }
}