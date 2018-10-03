/**
 * reports number of bugs
 * @jake baker
 * 09/04/2018
 */
public class Bug 
{

    private int numberOfBugs;

    public Bug(int numBugs)
    {
        numberOfBugs = numBugs;
    }

    public void breedBugs()
    {
        numberOfBugs = 2*numberOfBugs;
    }

    public void sprayBugs()
    {
        numberOfBugs = (int)(numberOfBugs * 0.75);
    }

    public int getNumberOfBugs()
    {
        return numberOfBugs;
    }

}