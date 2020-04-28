package swx.sc.hoxton.event;

import com.google.common.eventbus.AllowConcurrentEvents;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import swx.sc.hoxton.service.UserService;

/**
 * 同步消息通知
 *
 * @author shiwenxiang
 * @date 2020/4/28
 */
@Slf4j
@Component
public class CustomEventBus extends EventBus {

    @Autowired
    UserService userService;

    /**
     *
     */
    @Subscribe
    public void calling() {

    }

    /**
     * 线程安全
     */
    @Subscribe
    @AllowConcurrentEvents
    public void concurrent() {

    }

}
