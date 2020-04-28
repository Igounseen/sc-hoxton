package swx.sc.hoxton.service;

import swx.sc.hoxton.bean.BaseUser;

/**
 * @author shiwenxiang
 * @date 2020/4/28
 */
public interface UserService {

    BaseUser updateUser(BaseUser user);

    void dealEvent(Object event);

}
