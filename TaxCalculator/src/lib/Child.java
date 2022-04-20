package lib;

public class Child extends Employee {
    private List<String> childNames;
	private List<String> childIdNumbers;

    public void addChild(String childName, String childIdNumber) {
		childNames.add(childName);
		childIdNumbers.add(childIdNumber);
	}
}
