package leetcodeProblems;

public class CountNumberOfClassObjectsCreated {

    public static int numberOfObjects = 0;

    public CountNumberOfClassObjectsCreated() {
        numberOfObjects++;
    }

    public static void main(String[] args) {

        CountNumberOfClassObjectsCreated c1 = new CountNumberOfClassObjectsCreated();
        CountNumberOfClassObjectsCreated c2 = new CountNumberOfClassObjectsCreated();
        CountNumberOfClassObjectsCreated c3 = new CountNumberOfClassObjectsCreated();
        CountNumberOfClassObjectsCreated c4 = new CountNumberOfClassObjectsCreated();
        CountNumberOfClassObjectsCreated c5 = new CountNumberOfClassObjectsCreated();

        System.out.println("Number of objects created for this class : " + numberOfObjects);

    }

}
