package cinema.service.impl;

import cinema.dao.RoleDao;
import cinema.exception.DataProcessingException;
import cinema.model.Role;
import cinema.service.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public void add(Role role) {
        roleDao.add(role);
    }

    @Override
    public Role getByName(String roleName) {
        return roleDao.getByName(Role.RoleName.valueOf(roleName)).orElseThrow(() ->
                new DataProcessingException("Cant found role with role name : " + roleName));
    }
}
