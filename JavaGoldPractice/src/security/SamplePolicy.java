package security;

import java.security.Permission;
import java.security.PermissionCollection;
import java.security.Policy;
import java.security.ProtectionDomain;

public class SamplePolicy extends Policy {
	
	private final PermissionCollection permissionCollection;

	public SamplePolicy(PermissionCollection permissionCollection) {
		super();
		this.permissionCollection = permissionCollection;
	}
	
	@Override
	public boolean implies(ProtectionDomain domain, Permission permission) {
		return this.permissionCollection.implies(permission);
	}

}
