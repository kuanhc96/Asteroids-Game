package _04interfaces;

// Newer version of the Measurable interface now includes a static method
// and a default method - requires Java 8 or newer

/**
 *   Describes any class whose objects can be measured
 */
public interface Measurable
{
    /**
     * Computes the measure of the object.
     * @return the measure
     */
    double getMeasure();       // abstract method

    /**
     * Computes and returns the average measure for an array of Measurables
     * @param list an array of Measurables
     * @return the average measure for the objects in the array
     */
    static double getAverage(Measurable [] list)
    {
        // note to students: a static method, called just like static methods
        // in classes, using the interface name as the "handle"

        if (list.length == 0)            // if list is empty...
            return 0.0 ;                  // ...ain't no average

        // here if list is not empty

        double sum = 0.0 ;               // accumulates sum of measures

        for (Measurable object : list)   // for each Measurable object in list...
        {
            sum += object.getMeasure() ;  // ...get the measure and add to sum
        }
        return sum / list.length ;       // compute and return average
    }

    /**
     * Is the measure of this object greater than the measure of another?
     * @param other the Measurable to which this object is compared
     * @return true if the measure of this object > the measure of other; else
     * returns false
     */
    default boolean isGreaterThan(Measurable other)
    // Note to students: a default method.  If not overridden in an implementing
    // class, that class "inherits" this version
    {
        return this.getMeasure() > other.getMeasure() ;
    }
}