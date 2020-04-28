package swx.sc.hoxton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author shiwenxiang
 * @date 2020/4/28
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NetworkApp {

    public static void main(String[] args) {
        SpringApplication.run(NetworkApp.class, args);
    }

}
