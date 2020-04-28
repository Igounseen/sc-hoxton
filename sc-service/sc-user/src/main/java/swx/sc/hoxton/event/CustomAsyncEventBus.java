package swx.sc.hoxton.event;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.DeadEvent;
import com.google.common.eventbus.Subscribe;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import swx.sc.hoxton.service.UserService;

/**
 * 异步消息通知
 *
 * @author shiwenxiang
 * @date 2020/4/28
 */
@Slf4j
@Component
public class CustomAsyncEventBus extends AsyncEventBus {


    @Autowired
    UserService userService;

    public CustomAsyncEventBus() {
        super(new ThreadPoolExecutor(2,
                10,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(10),
                (ThreadFactory) Thread::new
        ));
    }

    @Subscribe
    public void messaging() {

    }

    /**
     * 处理被 post 后没有找到相对应的 Subscribe 的消息
     *
     * @param deadEvent
     */
    @Subscribe
    public void deadEvent(DeadEvent deadEvent) {
        log.warn("dead event:{}", deadEvent.toString());
    }


}
