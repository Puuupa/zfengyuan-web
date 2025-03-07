package zfengyuan.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@Slf4j
public class NetController {

    @RequestMapping(value = "req-ip",method = RequestMethod.POST)
    String reqIp(@RequestBody HttpServletRequest reqRequest){
        String ip = reqRequest.getRemoteAddr();
        log.info("========>  获取用户ip: {}" ,ip );
        return ip;
    }
}
