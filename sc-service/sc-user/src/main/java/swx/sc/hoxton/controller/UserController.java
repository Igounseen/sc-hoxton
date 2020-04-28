package swx.sc.hoxton.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import swx.sc.hoxton.bean.BaseUser;
import swx.sc.hoxton.mapper.UserMapper;
import swx.sc.hoxton.target.Animal;


@Slf4j
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("")
    public Object listAll() {
        return userMapper.selectList(new QueryWrapper<>());
    }

    @GetMapping("/{id}")
    public Object findUserById(@PathVariable Long id) {
        return userMapper.selectOne(new UpdateWrapper<BaseUser>().lambda().eq(BaseUser::getId, id));
    }

}
