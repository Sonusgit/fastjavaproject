package com.fastjavaproject.fastjavaproject.journalApp.Controller;

import com.fastjavaproject.fastjavaproject.journalApp.entity.JurnlEntery;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class journalEnteryController {
    private final Map<Long,JurnlEntery> jurnlEnteryMap = new HashedMap();
    @GetMapping()
   public List<JurnlEntery> GetAll(){
    return  new ArrayList<>(jurnlEnteryMap.values());

   }
   @PostMapping
   public  boolean createEntry(@RequestBody JurnlEntery myEntry){

        if (jurnlEnteryMap.containsKey(myEntry.getId())){
            throw  new RuntimeException("Id already Exists");

        }else {
            jurnlEnteryMap.put(myEntry.getId(),myEntry);
        }
    return  true;
   }
   @GetMapping("id/{id}")
   public  JurnlEntery getById(@PathVariable Long id){
        return  jurnlEnteryMap.get(id);
   }

   @DeleteMapping("id/{id}")
    public  JurnlEntery deletejournal(@PathVariable Long id){

        return   jurnlEnteryMap.remove(id);

   }

    @PutMapping("id/{id}")
     public  JurnlEntery updatejournal(@PathVariable Long id, @RequestBody JurnlEntery myEntry){
        return  jurnlEnteryMap.replace(id,myEntry);
    }

}
