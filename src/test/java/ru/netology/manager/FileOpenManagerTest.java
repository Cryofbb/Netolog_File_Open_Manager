package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

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
        manager.addNew(".txt", "Word" );
        manager.addNew(".txt", "Excel");
        manager.addNew(".iso", "ISO");
    }
    @Test
    void showAll(){
        System.out.println(manager.showAll());
    }

    @Test
    void getApp(){
        System.out.println(manager.getApp(".png"));
    }

    @Test
    void remove(){
        manager.removeValue(".jpg");
        System.out.println(manager.showAll());

    }
    @Test
    void getExtensions(){
        System.out.println(manager.getExtensions());
    }

    @Test
    void getApps(){
        System.out.println(manager.getApps());
    }

}