package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class FileOpenManagerTest {
    private FileOpenManager manager = new FileOpenManager();

    @BeforeEach
    void setup(){
        manager.addNew(".jpg","IMG Viewer");
        manager.addNew(".JPG", "IMG Viewer");
        manager.addNew(".pNg", "IMG Viewer");
        manager.addNew(".jar", "Winrar");
        manager.addNew(".psd","");
        manager.addNew(".txt", "Excel");
        manager.addNew(".iso", "ISO");
    }

    @Test
    void getApp(){
        assertEquals("IMG Viewer", manager.getApp(".png"));
        System.out.println(manager.getApp(".png"));
    }
    @Test
    void addNewApp(){
        manager.addNew(".PSD", "Word" );
        assertEquals("Word", manager.getApp(".PSD"));
    }
    @Test
    void remove(){
        manager.removeValue(".jpg");
        System.out.println(manager.getApp(".jpg"));
        assertEquals(null, manager.getApp(".jpg"));
    }
    @Test
    void getExtensions(){
        assertEquals(new HashSet<String>(Arrays.asList(".iso", ".txt", ".jpg", ".jar", ".png")), manager.getExtensions());
    }

    @Test
    void getApps(){
        assertEquals(new HashSet<String>(Arrays.asList("Excel", "IMG Viewer", "ISO", "Winrar")), manager.getApps());
    }

}