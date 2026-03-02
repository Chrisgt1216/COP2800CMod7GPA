// PalmerPenguinsM7.java
// Christin George Thomas
// 03/01/2026
// Refactored Palmer Penguins analysis using object-oriented approach

public class PalmerPenguinsM7 {
    public static void main(String[] args) {
   // Create an instance of SpeciesCounter
     SpeciesCounter counter = new SpeciesCounter();

   // Read species data
     counter.readSpeciesData();

  // Initialize species count
     counter.initializeSpeciesCount();

  // Check if data is empty
 if (counter.isDataEmpty()) {
     System.out.println("No data found.");
     return;
}

  // Count species
 counter.countSpecies();

  // Print results
counter.printSpeciesCount();
    }
}
