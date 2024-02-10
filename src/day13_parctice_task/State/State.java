package day13_parctice_task.State;

public class State {
 private  String name;
 private  String abbreviation;
 private String politicalParty;
 private String governor;
 private String senator;
 private int population;

    public State(String name, String abbreviation, String politicalParty, String governor, String senator, int population) {
        this.name = name;
        this.abbreviation = abbreviation;
        this.politicalParty = politicalParty;
        this.governor = governor;
        this.senator = senator;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("")|| name==null || name.isEmpty()){
            System.err.println("name must not be null, empty, or blank.");
            }
        this.name = name;
    }

    public String getAbbreviation() {

        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if (abbreviation.equals("")|| abbreviation==null||
               abbreviation.isEmpty()){
            System.err.println("name must not be null, empty, or blank.");
            System.exit(1);}
        this.abbreviation = abbreviation;
    }
    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if (politicalParty.equals("")|| politicalParty==null||
                politicalParty.isEmpty()){
            System.err.println(" PoliticalPArty must not be null, empty, or blank.");
            System.exit(1);}
        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        return governor;
    }

    public void setGovernor(String governor) {
        if (governor.equals("")|| governor==null||
                governor.isEmpty()){
            System.err.println("governor must not be null, empty, or blank.");
            System.exit(1);}
        this.governor = governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if (senator.equals("")|| senator==null||
                senator.isEmpty()){
            System.err.println("name must not be null, empty, or blank.");
            System.exit(1);}
        this.senator = senator;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if (population<=0){
            System.err.println("isnot possible ");
        }
        this.population = population;
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", governor='" + governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                '}';
    }
    }




/*
1. Create a class named 'State' with the following specifications:
   Attributes:
       - name: String
       - abbreviation: String
       - politicalParty: String
       - Governor: String
       - senator: String
       - population: int

   Encapsulation Requirements:
       - Ensure attributes are private with getters and setters.
       - Conditions for Encapsulation:
           - 'name', 'abbreviation', 'politicalParty', 'Governor', and 'senator' must not be null, empty, or blank.
           - 'population' must be greater than zero.

   Constructor:
       - Add a constructor to initialize all fields.

   Methods:
       - toString(): Prints the information of the State object.

2. Create the following subclasses of the State class:
      - Virginia
      - California
      - Texas
      - Florida
   - Add any additional fields and methods as necessary.

3. Create a class named 'StateClients':
   - Create multiple objects representing different states.
   - Test the methods and variables of each object. */