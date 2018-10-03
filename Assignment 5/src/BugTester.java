/**
 * Testerclass for the Bug.javaClass
 * @JakeBaker
 * 10/04/2018
 */
public class BugTester {

    public static void main(String[] args)
    {
        Bug badBug = new Bug(10);
        badBug.breedBugs();
        badBug.sprayBugs();
        System.out.println("Total number of remaining bugs: " + badBug.getNumberOfBugs());

        badBug.breedBugs();
        badBug.sprayBugs();
        System.out.println("Total number of remaining bugs: " + badBug.getNumberOfBugs());

        badBug.breedBugs();
        badBug.sprayBugs();
        System.out.println("Total number of remaining bugs: " + badBug.getNumberOfBugs());
    }

}