/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 828200
 */
public class ShoppingListServlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         HttpSession session=request.getSession();
        String action=(String)request.getParameter("action");
        boolean registered=false,toAdd=false,toDelete=false,Deleted=false;
        String username=(String)session.getAttribute("username");
        String name=(String)request.getParameter("add");
        request.setAttribute("username",username);
        if(action==null)
      {
          action="";
      }
        if(action!=null&&username==null)
        {
            registered=false;
            toAdd=false;
            toDelete=false;
            Deleted=false;
            request.setAttribute("registered",registered);
            request.setAttribute("toAdd",toAdd);
            request.setAttribute("toDelete",toDelete);
            request.setAttribute("Deleted",Deleted);
            getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp")
              .forward(request,response);
            return;
        }
        if(action.equals("register"))
        {
            String slUsername=request.getParameter("username");
            try
            {
                if(!slUsername.equals(""))
                {
                    registered=true;
                    toAdd=true;
                    toDelete=false;
                    Deleted=false;
                    session.setAttribute("username",slUsername);
                }
                
            }
            catch(NullPointerException e){}
            
             
             
        } 
        else if(action.equals("add"))
                {
                    try
                    {
                        if(!name.equals(""))
                        {
                         registered=true;
                         toAdd=true;
                         toDelete=true;
                         Deleted=false;
                        }
                        else
                        {
                            registered=true;
                            toAdd=true;
                            toDelete=false;
                            Deleted=false; 
                        }
                    }
                    catch(NullPointerException e)
                    {
                       registered=true;
                        toAdd=true;
                        toDelete=false;
                        Deleted=false; 
                    }
                    
                }
                else if(action.equals("delete"))
                {
                    registered=true;
                     toAdd=true;
                     toDelete=true;
                     Deleted=true;
                }
                else if(action.equals("logout"))
                {
                     registered=false;
                     toAdd=false;
                     toDelete=false;
                     Deleted=false;
                     session.invalidate();
                }
                else
                {
                    registered=false;
                     toAdd=false;
                     toDelete=false;
                     Deleted=false;
                }
                request.setAttribute("registered",registered);
                     request.setAttribute("toAdd",toAdd);
                     request.setAttribute("toDelete",toDelete);
                     request.setAttribute("Deleted",Deleted);
            
        
      getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp")
              .forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session=request.getSession();
        String action=(String)request.getParameter("action");
        boolean registered=false,toAdd=false,toDelete=false,Deleted=false;
        String username=(String)session.getAttribute("username");
        String name=(String)request.getParameter("add");
        request.setAttribute("username",username);
        if(action==null)
      {
          action="";
      }
        if(action!=null&&username==null)
        {
            registered=false;
            toAdd=false;
            toDelete=false;
            Deleted=false;
        }
        if(action.equals("register"))
        {
            String slUsername=request.getParameter("username");
            try
            {
                if(!slUsername.equals(""))
                {
                    registered=true;
                    toAdd=true;
                    toDelete=false;
                    Deleted=false;
                    session.setAttribute("username",slUsername);
                }
                
            }
            catch(NullPointerException e){}
            
             
             
        } 
        else if(action.equals("add"))
                {
                    try
                    {
                        if(!name.equals(""))
                        {
                         registered=true;
                         toAdd=true;
                         toDelete=true;
                         Deleted=false;
                        }
                        else
                        {
                            registered=true;
                            toAdd=true;
                            toDelete=false;
                            Deleted=false; 
                        }
                    }
                    catch(NullPointerException e)
                    {
                       registered=true;
                        toAdd=true;
                        toDelete=false;
                        Deleted=false; 
                    }
                    
                }
                else if(action.equals("delete"))
                {
                    registered=true;
                     toAdd=true;
                     toDelete=true;
                     Deleted=true;
                }
                else if(action.equals("logout"))
                {
                     registered=false;
                     toAdd=false;
                     toDelete=false;
                     Deleted=false;
                     session.invalidate();
                }
                else
                {
                    registered=false;
                     toAdd=false;
                     toDelete=false;
                     Deleted=false;
                }
                request.setAttribute("registered",registered);
                     request.setAttribute("toAdd",toAdd);
                     request.setAttribute("toDelete",toDelete);
                     request.setAttribute("Deleted",Deleted);
            
        
      getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp")
              .forward(request,response);
    }
}
