package com.example.test.company.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.test.company.model.Role;
import com.example.test.company.repository.RoleRepo;

@Service
public class RoleService {

	@Autowired
   private RoleRepo roleRepo;

    public Role createRole(Role role) {
        return roleRepo.save(role);
    }

    public Role updateRole(int id, Role updatedRole) {
        if (roleRepo.existsById(id)) {
            updatedRole.setRoleId(id);
            return roleRepo.save(updatedRole);
        }
        return null;
    }

    public void deleteRole(int id) {
        roleRepo.deleteById(id);
    }

	public List<Role> getAllRoles() {
		return roleRepo.findAll();
	}
}
