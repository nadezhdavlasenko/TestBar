package finalproj.beautybar.dao;

import finalproj.beautybar.entity.Role;

import java.util.List;

public interface IRoleDAO {
    public abstract List<Role> findAll();
    public abstract Role findEntityById(Integer id);
    public abstract boolean delete(Integer id);
    public abstract boolean delete(Role entity);
    public abstract boolean create(Role entity);
    public abstract Role update(Role entity);
}
