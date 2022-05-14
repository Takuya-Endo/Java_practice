package security;

import java.io.FilePermission;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.Permissions;
import java.security.Policy;
import java.util.stream.Stream;

public class Process {
	
	public void doSomething01() {
		
		SecurityManager securityManager = new SecurityManager();
		System.setSecurityManager(securityManager);
		// ↓
		// java.security.AccessControlException
		// ↓
		Path path = Paths.get("src");
		try (Stream<Path> pathStream = Files.walk(path)) {
			
			pathStream.forEach(System.out::println);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void doSomething02() {
		
		Permissions permissions = new Permissions();
		FilePermission filePermission = new FilePermission("src", "read");
		permissions.add(filePermission);
		SamplePolicy samplePolicy = new SamplePolicy(permissions);
		Policy.setPolicy(samplePolicy);
		
		SecurityManager securityManager = new SecurityManager();
		System.setSecurityManager(securityManager);
		// ↓
		// java.security.AccessControlException
		// ↓
		Path path = Paths.get("src");
		try (Stream<Path> pathStream = Files.walk(path)) {
			
			pathStream.forEach(System.out::println);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
