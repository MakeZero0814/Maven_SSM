package com.cslb.service;

import com.cslb.mapper.PersonMapper;
import com.cslb.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService
{
    @Autowired
    private PersonMapper personMapper;

    @Override
    public Person selectById(Integer id)
    {
        return personMapper.selectById(id);
    }
}
