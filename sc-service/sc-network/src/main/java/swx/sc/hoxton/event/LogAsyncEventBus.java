package swx.sc.hoxton.event;

import com.google.common.eventbus.AsyncEventBus;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author shiwenxiang
 * @date 2020/4/28
 */
public class LogAsyncEventBus extends AsyncEventBus {
    public LogAsyncEventBus(Executor executor) {
        super(new ThreadPoolExecutor(10,
                100,
                10,
                TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(100),
                Thread::new,
                new ThreadPoolExecutor.DiscardOldestPolicy()
        ));
    }
}
