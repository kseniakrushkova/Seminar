import org.junit.Assert;
import org.junit.Test;
import ru.omsu.imit.seminar4.reflection.Base;
import ru.omsu.imit.seminar4.reflection.Derived;
import ru.omsu.imit.seminar4.reflection.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static ru.omsu.imit.seminar4.reflection.Service.*;

public class TestService {
    @Test
    public void testGetInfo() {
        List<String> stringList = new ArrayList<>();
        List<Base> objects = new ArrayList<>();
        Base base = new Base("description");
        Base base1 = new Base("description1");
        Derived derived = new Derived("description", "additionalDescription");
        Collections.addAll(objects,base,base1,derived);
        Collections.addAll(stringList, "description", "description1", "description, additionalDescription");
        Assert.assertEquals(stringList,getInfo(objects));
        Assert.assertEquals(stringList.size(),getInfo(objects).size());
    }
    @Test
    public void testIsObjectFunctionalInterface(){
        Class<?> object = InterfaceTest.class;
        Class<?> object1 = Base.class;
        Assert.assertTrue(isObjectFunctionalInterface(object));
        Assert.assertFalse(isObjectFunctionalInterface(object1));
    }

    @Test
    public void testMetadataClassesListWithAtLeastOneStaticMethod(){
        List<String> stringList = new ArrayList<>();
        stringList.add("ru.omsu.imit.seminar4.reflection.Service");
        stringList.add("InterfaceTest");
        List<Class<?>> classList = new ArrayList<>();
        Collections.addAll(classList, Service.class, Base.class, InterfaceTest.class, Derived.class);
        Assert.assertEquals(stringList, metadataClassesListWithAtLeastOneStaticMethod(classList));
    }
    @Test
    public void testCheckImplementsMethodSerializable(){
        Class<?> object1 = Base.class;
        Class<?> object2 = Derived.class;
        Class<?> object3 = Service.class;
        Class<?> object4 = InterfaceTest.class;
//        Assert.assertTrue(checkImplementsMethodSerializable(object1));
//        Assert.assertFalse(checkImplementsMethodSerializable(object3));
//        Assert.assertTrue(checkImplementsMethodSerializable(object2));
        Assert.assertTrue(checkImplementsMethodSerializable(object4));

    }

    @Test
    public void testHasObjectImplementedSerializableInterface(){
        Derived derived = new Derived("description", "additionalDescription");
        Base base = new Base("description");
        Assert.assertTrue(hasObjectImplementedSerializableInterface(derived));
        Assert.assertFalse(hasObjectImplementedSerializableInterface(base));
    }
}
