package test;

import main.BalancedBrackets;
import main.BonusBinarySearch;
import org.junit.Test;

import static org.junit.Assert.*;

public class BonusBinarySearchTest {
    @Test
    public void leftGreaterThanReturnFalse(){
        int[] numArray = {1,2,4,5,6,7,8,8,8};
        assertEquals(5, BonusBinarySearch.binarySearch(numArray,5));
    }
}
