package swx.sc.hoxton.adapter;

import lombok.extern.slf4j.Slf4j;
import swx.sc.hoxton.target.Animal;

/**
 * @author shiwenxiang
 * @date 2020/4/28
 */
@Slf4j
public class Cat implements Animal {

    public Cat() {
        log.info("--------- a new cat -------");
    }

    @Override
    public void move() {
        log.info(" 猫跳 ");
    }
}
