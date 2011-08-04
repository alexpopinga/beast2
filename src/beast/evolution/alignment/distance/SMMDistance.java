package beast.evolution.alignment.distance;

import beast.core.Description;


/**
 * @author Chieh-Hsi Wu
 */
@Description("Calculate the distance between different microsatellite alleles")
public class SMMDistance extends Distance{

   /**
    * constructor taking a pattern source
    * 
    * @param patterns   a pattern of a microsatellite locus
    */
    public double calculatePairwiseDistance(int taxon1, int taxon2) {

        int[] pattern = patterns.getPattern(0);
        int state1 = pattern[taxon1];
        
        int state2 = pattern[taxon2];
        double distance = 0.0;

        if (!dataType.isAmbiguousState(state1) && !dataType.isAmbiguousState(state2))
            distance = Math.abs(state1 - state2);

        return distance;
    }
}
