<%--
  Created by IntelliJ IDEA.
  User: quynh-dragon
  Date: 30/09/2019
  Time: 06:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Calculator</title>
</head>
<body>
<form action="calculate" method="post">
    <fieldset>
        <legend>Calculator</legend>
        <table>
            <tr>
                <td>First Operand: </td>
                <td><input type="text" name="firstOperand" value=""/></td>
            </tr>
            <tr>
                <td>Operator: </td>
                <td>
                    <select name="operator">
                        <option value="add">Addition</option>
                        <option value="mul">Multi</option>
                        <option value="sub">Subtraction</option>
                        <option value="div">Division</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Second Operand: </td>
                <td><input type="text" name="secondOperand" value=""/></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Calculate"/></td>
            </tr>
        </table>
    </fieldset>
</form>

</body>
</html>
