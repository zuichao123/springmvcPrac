package com.sunjian.repository;

import com.sunjian.entity.Course;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author sunjian
 * @date 2020/3/20 14:29
 */
@Repository
public class CourseRepository {
    private static Map<Integer, Course> map;

    static {
        map = new HashMap<>();
        map.put(1, new Course(1, "java", 2000d));
        map.put(2, new Course(2, "python", 3000d));
        map.put(3, new Course(3, "c++", 4000d));
    }

    public void saveOrUpdate(Course course){
        map.put(course.getId(), course);
    }

    public Collection<Course> findAll(){
        return map.values();
    }

    public Course findId(Integer id){
        return map.get(id);
    }

    public void deleteById(Integer id){
        map.remove(id);
    }
}
