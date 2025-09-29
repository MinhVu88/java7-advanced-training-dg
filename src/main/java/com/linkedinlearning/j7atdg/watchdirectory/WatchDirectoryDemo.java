package main.java.com.linkedinlearning.j7atdg.watchdirectory;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.HashMap;
import java.util.Map;

public class WatchDirectoryDemo {
	public static void main(String[] args) throws InterruptedException {
		try(WatchService service = FileSystems.getDefault().newWatchService()) {
			Map<WatchKey, Path> keyMap = new HashMap<>();
			Path p = Paths.get("src\\main\\java\\com\\linkedinlearning\\j7atdg\\watchdirectory\\files");
			
			// populate keyMap
			keyMap.put(
				p.register(
					service, 
					StandardWatchEventKinds.ENTRY_CREATE, 
					StandardWatchEventKinds.ENTRY_DELETE, 
					StandardWatchEventKinds.ENTRY_MODIFY
				), 
				p
			);
			
			// declare a WatchKey instance
			WatchKey wk;
			
			do {
				wk = service.take();
				Path eventDir = keyMap.get(wk);
				
				for(WatchEvent<?> event : wk.pollEvents()) {
					WatchEvent.Kind<?> kind = event.kind();
					Path eventPath = (Path) event.context();
					System.out.println("\n" + eventDir + ": " + kind + ": " + eventPath);
				}
			} while(wk.reset());
		} catch(IOException e) {
			System.out.println("\n" + e.getMessage());
		}
	}
}