package swx.sc.hoxton.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import swx.sc.hoxton.bean.BaseUser;
import swx.sc.hoxton.event.CustomAsyncEventBus;

/**
 * @author shiwenxiang
 * @date 2020/4/28
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    CustomAsyncEventBus customAsyncEventBus;

    @Override
    public BaseUser updateUser(BaseUser user) {
        return new BaseUser();
    }

    @Override
    public void dealEvent(Object event) {
        log.info(" 处理消息 ");
    }

}
