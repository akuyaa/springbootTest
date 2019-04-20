package com.hzt.tuntun.controller;

import com.hzt.tuntun.beans.Account;
import com.hzt.tuntun.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/")
public class AccountController {

    @Resource
    private AccountDao accountDao;

    @RequestMapping("save")
    public void save(@RequestBody Account account){
        accountDao.insert(account);
        System.out.println("保存成功");
    }

    @RequestMapping("save/{id}/account")
    public void saveByRest(@PathVariable Integer id){

        System.out.println("保存成功");
    }

    @RequestMapping(value = "go",method = POST)
    public void save1(@RequestParam Integer id,@RequestParam String name){

        System.out.println("保存成功");
    }

    @PostMapping("upload")
    public void upload(@RequestParam("file") MultipartFile file){
        System.out.println(file.getOriginalFilename());
        System.out.println("保存成功");
    }

    @RequestMapping("findAll")
    public void findAll(){
        List<Account> all = accountDao.findAll();
        for (Account account : all) {
            System.out.println(account.getName()+account.getMoney());
        }
    }


}
