import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class MainTest{

    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @Test
    public static void testPointers(Property property1) {

        Property property2 = property1;
        Assert.assertSame(property1, property2);
        System.out.println("Test Pointers passed");
        System.out.println(property1.toString());
    }

    public static void main(String[] args){
        Property property1 = new Villa("beer sheva","yohanna jabutinsky",
                4,50,5);
        testPointers(property1);
    }


}
