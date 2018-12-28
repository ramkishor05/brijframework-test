package org.brijframework.test.expression;

import java.util.ArrayList;
import java.util.List;

import org.brijframework.beans.Employee;
import org.brijframework.expression.core.Expressions;

public class ExpressionTest {

	public static void main(String[] args) {
		List<Employee> list=new ArrayList<>();
		Employee employee1=new Employee();
		employee1.id="ram";
		list.add(employee1);
		Employee employee2=new Employee();
		employee2.id="ajay";
		list.add(employee2);
		String query="id==ram";
		System.out.println(Expressions.propertyWithExpression(list, query));;
	}
}
