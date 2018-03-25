package com.example.demo.service.file;

import com.example.demo.entity.Unit;
import com.example.demo.service.CRUDService;
import org.springframework.stereotype.Service;

@Service
public class FileCRUD implements CRUDService<Unit, Object> {
    @Override
    public Object create(Unit value) {
        return null;
    }

    @Override
    public Unit read() {
        return null;
    }

    @Override
    public Object update(Unit value) {
        return null;
    }

    @Override
    public Object delete(Unit value) {
        return null;
    }
}
