public class Reformatory {
    
    private int weightMeasure;
    
    public Reformatory() {
        this.weightMeasure = 0;
    }

    public int weight(Person person) {
        // return the weight of the person
        this.weightMeasure++;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }
    
    public int totalWeightsMeasured() {
        
            return weightMeasure;
        
    }
}
