package com.marlonluan.springbootrest.resource;

import com.marlonluan.springbootrest.model.Objeto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ObjetoResource {

    private Map<Integer, Objeto> objetoMap;

    public ObjetoResource() {
        objetoMap = new HashMap<>();

        Objeto o1 = new Objeto(1, "Item 1", "Descrição 1");
        Objeto o2 = new Objeto(2, "Item 2", "Descrição 2");
        Objeto o3 = new Objeto(3, "Item 3", "Descrição 3");

        objetoMap.put(1, o1);
        objetoMap.put(2, o2);
        objetoMap.put(3, o3);
    }

    @RequestMapping(value = "/objetos", method = RequestMethod.GET)
    public ResponseEntity<List<Objeto>> listar() {
        return new ResponseEntity<>(new ArrayList<>(objetoMap.values()), HttpStatus.OK);
    }

}
