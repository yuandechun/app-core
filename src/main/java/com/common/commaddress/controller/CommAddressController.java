package com.common.commaddress.controller;

import com.common.commaddress.entity.CommAddress;
import com.common.commaddress.service.CommAddressService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (CommAddress)表控制层
 *
 * @author makejava
 * @since 2023-03-09 16:53:06
 */
@RestController
@RequestMapping("commAddress")
public class CommAddressController {
    /**
     * 服务对象
     */
    @Resource
    private CommAddressService commAddressService;

    /**
     * 分页查询
     *
     * @param commAddress 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<CommAddress>> queryByPage(CommAddress commAddress, PageRequest pageRequest) {
        return ResponseEntity.ok(this.commAddressService.queryByPage(commAddress, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<CommAddress> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.commAddressService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param commAddress 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<CommAddress> add(CommAddress commAddress) {
        return ResponseEntity.ok(this.commAddressService.insert(commAddress));
    }

    /**
     * 编辑数据
     *
     * @param commAddress 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<CommAddress> edit(CommAddress commAddress) {
        return ResponseEntity.ok(this.commAddressService.update(commAddress));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.commAddressService.deleteById(id));
    }

}

