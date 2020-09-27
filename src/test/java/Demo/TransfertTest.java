package Demo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TransfertTest {

    @Test
    public void testCreateTransfert(){

        Transfert trans1 = new Transfert(10000, "Maman", "Mohamed", 230);
        Transfert transEx = new Transfert(10000, "Maman", "Mohamed", 230);

        assertEquals(transEx, trans1.conf(230));


    }
}
