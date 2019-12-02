import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class QueueTest {
    Queue<Integer> qi = null;


    @Before
    public void setsUp () throws QueueFullException {
        qi = new QueueMetodosImplementados<Integer>(4);
        Assert.assertEquals("setUp1", 0, qi.size());
        qi.push(2222);
        Assert.assertEquals("setUp1", 1, qi.size());
        qi.push(3);
        Assert.assertEquals("setUp1", 2, qi.size());
        qi.push(4);
        Assert.assertEquals("setUp1", 3, qi.size());
    }

    @Test
    public void testPush() throws QueueFullException {
        qi.push(5);
        Assert.assertEquals("testPush", 4, qi.size());
    }


    @Test(expected = QueueFullException.class)
    public void testcolallena() throws QueueFullException {
        Assert.assertEquals("testPush", 3, qi.size());
        qi.push(5);
        Assert.assertEquals("testPush", 4, qi.size());

        qi.push(6);
    }

    @Test
    public void testPop() throws QueueEmptyException{
        Assert.assertEquals("testPop", 3, qi.size());

        int i1 = qi.pop();
        Assert.assertEquals("pop", 2222, i1);
        Assert.assertEquals("testPop", 2, qi.size());

        int i2 = qi.pop();
        Assert.assertEquals("pop", 3, i2);
        Assert.assertEquals("testPop", 1, qi.size());

        int i3 = qi.pop();
        Assert.assertEquals("pop", 4, i3);
        Assert.assertEquals("testPop", 0, qi.size());
    }

    @Test(expected = QueueEmptyException.class)
    public void testcolavacia() throws QueueEmptyException{
        Assert.assertEquals("testPop", 3, qi.size());

        int i1 = qi.pop();
        Assert.assertEquals("pop", 2222, i1);
        Assert.assertEquals("testPop", 2, qi.size());

        int i2 = qi.pop();
        Assert.assertEquals("pop", 3, i2);
        Assert.assertEquals("testPop", 1, qi.size());

        int i3 = qi.pop();
        Assert.assertEquals("pop", 4, i3);
        Assert.assertEquals("testPop", 0, qi.size());

        qi.pop();
    }

}
