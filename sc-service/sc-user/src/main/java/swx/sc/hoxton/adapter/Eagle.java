package swx.sc.hoxton.adapter;

import lombok.extern.slf4j.Slf4j;
import swx.sc.hoxton.target.Animal;

/**
 * @author shiwenxiang
 * @date 2020/4/28
 */
@Slf4j
public class Eagle implements Animal {

    public Eagle() {
        log.info("--------- a new dog -------");
    }

    @Override
    public void move() {
        log.info(" 鹰飞 ");
    }

}
