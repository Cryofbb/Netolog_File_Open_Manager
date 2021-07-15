package ru.netology.manager;

import java.util.*;


public class FileOpenManager {
    private Map<String, String> manager = new HashMap<String, String>();

    public void addNew(String extension, String app) {
        manager.put(extension.toLowerCase(), app);
    }

    public String getApp(String extension) {
        return manager.get(extension.toLowerCase());
    }

    public void removeValue(String extension) {
        manager.remove(extension.toLowerCase());
    }

//    public Set<String> getExtensions() {
//        Set<String> extensions = manager.keySet();
//        Set<String> pairedExt = new HashSet<>();
//        for (String extension : extensions) {
//            if (manager.get(extension).length() != 0) {
//                pairedExt.add(extension);
//            }
//        }
//        return pairedExt;
//    }
    public Set<String> getExtensions() {
        return manager.keySet();
    }
    public Set<String> getApps() {
        return new HashSet<>(manager.values());
    }

//    public Set<String> getApps() {
//        Set<String> extensions = this.getExtensions();
//        List<String> pairedApps = new ArrayList();
//        for (String extension : extensions) {
//            if (manager.get(extension).length() != 0) {
//                pairedApps.addAll(Collections.singleton(manager.get(extension)));
//                Collections.sort(pairedApps);
//            }
//        }
//        Set<String> tmp = new HashSet<String>(pairedApps);
//        return tmp;
//    }
}
