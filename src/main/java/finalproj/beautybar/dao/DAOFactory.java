package finalproj.beautybar.dao;

public class DAOFactory {
    public IRoleDAO getRoleDAO(){
        return new RoleDAO();
    }
}
