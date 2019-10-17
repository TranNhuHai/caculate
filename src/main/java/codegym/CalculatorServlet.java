package codegym;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Hello");
        double firstOperand = Double.parseDouble(req.getParameter("firstOperand"));
        double secondOperand = Double.parseDouble(req.getParameter("secondOperand"));
        String operator = req.getParameter("operator");
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<h1>Result:</h1>");
        try{
            double result = Calculator.calculate(firstOperand, secondOperand, operator);
            writer.println(firstOperand + " " + Calculator.getOperator(operator) + " " + secondOperand + " = " + result);
        }catch (Exception ex){
            writer.println("Error: " + ex.getMessage());
        }
        writer.println("</html>");
    }

}
