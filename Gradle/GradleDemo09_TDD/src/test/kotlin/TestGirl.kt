import org.junit.Assert
import org.junit.Test

class TestGirl{
    @Test
    fun testGreeting(){
        val girl =  Girl()
        val greeting = girl.greeting()
        Assert.assertEquals("hello",greeting)
    }
}