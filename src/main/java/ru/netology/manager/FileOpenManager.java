package ru.netology.manager;

import java.util.*;


public class FileOpenManager {
    private Map<String, String> manager = new HashMap<String, String>();

    public void addNew(String extension, String app) {
        manager.put(extension.toLowerCase(), app);
    }

    public Set<Map.Entry<String, String>> showAll() {
        return manager.entrySet();
    }

    public String getApp(String extension) {
        return manager.get(extension);
    }

    public void removeValue(String app) {
        manager.remove(app);
    }

    public Set<String> getExtensions() {
        Set<String> extensions = manager.keySet();
        Set<String> pairedExt = new HashSet<>();
        for (String extension : extensions) {
            if (manager.get(extension).length() != 0) {
                pairedExt.add(extension);
            }
        }
        return pairedExt;
    }

    public List<String> getApps() {
        Set<String> extensions = this.getExtensions();
        List<String> pairedApps = new ArrayList();
        for (String extension : extensions) {
            if (manager.get(extension).length() != 0) {
                pairedApps.addAll(Collections.singleton(manager.get(extension)));
                Collections.sort(pairedApps);
            }
        }
        return pairedApps;
    }
}
