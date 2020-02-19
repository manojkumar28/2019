package singleResponsibilityPrinciple;

import java.util.List;
/*
 * Single Responsibility Principle Example:
 * “One class should have one and only one responsibility”
 */
public class Person {
	private Long personId;
    private String firstName;
    private String lastName;
    private String age;
    private List<Account> accounts;
}
