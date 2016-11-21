package jeuj;

import base.TypeRessource;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by galax on 21/11/2016.
 */
public class TypeRessourceJTest {
    //Question 1.1
    @org.testng.annotations.DataProvider(name="TestEqualsEnum")
    public Object[][] CreateEnumEquals(){

        return new Object[][]{
                {TypeRessourceJ.ARGILE,TypeRessourceJ.ARGILE},
                {TypeRessourceJ.ARGILE,TypeRessourceJ.BOIS},
                {TypeRessourceJ.ARGILE,TypeRessourceJ.PIERRE}
        };
    }
    @org.testng.annotations.Test(dataProvider="TestEqualsEnum")
    public void testWinPlay(Object o1, Object o2){
        assertEquals(o1.equals(o2),true);
    }
    //Fin Question 1.1
}