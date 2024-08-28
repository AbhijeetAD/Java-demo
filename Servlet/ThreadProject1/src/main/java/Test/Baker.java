package Test;

	import java.util.ArrayDeque;

	public class Baker {

	    ArrayDeque<Cookie> cookies = ProducerConsumer.cookies;

	    public void produce(Cookie cookie) throws InterruptedException {

	        synchronized(cookies) {

	            // check if baker can produce
	            while (cookies.size() == ProducerConsumer.MAX_COOKIES) {
	                // if not, wait
	                System.out.println("Baker waits!");
	                cookies.wait();
	            }


	            // if there is space on shelf, produce
	            cookies.add(cookie);
	            System.out.println("Baker baked a cookie!\n" + 
	            "Cookies currently ready for sale: " + cookies.size());
	            cookies.notify();

	        }
	    }
	}


