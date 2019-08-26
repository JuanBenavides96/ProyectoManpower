package edu.cecar.controladores;

import edu.cecar.componentes.baseDatos.ConectarMySQL;
import edu.cecar.modelos.Empleado;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * Clase que controla las operaciones CRUD de los empleados.
 */
public class ControladorEmpleado {
    private ConectarMySQL conectarMySQL;
    
    public ControladorEmpleado(){
        conectarMySQL = new ConectarMySQL("127.0.0.1", "manpower", "root", "");
    }
    
    
    
    public void guardar(Empleado empleado) throws SQLException{
        
        PreparedStatement preparedStatement = conectarMySQL.getConnection().prepareStatement("insert into empleado values(?,?,?,?)");
        preparedStatement.setString(1, empleado.getCodigo());
        preparedStatement.setString(2, empleado.getNombres());
        preparedStatement.setString(3, empleado.getApellidos());
        preparedStatement.setDate(4, (Date)empleado.getFechaNacimiento());
        preparedStatement.execute();
    
    }
    
    public Empleado consultar(String codigo){
        Empleado empleado = null;
       
        //PreparedStatement preparedStatement = ResultSet preparedStatement = s.executeQuery ("select * from persona");
        return empleado;
    }
    public void consultar(){}
    public void actualizar(){}
    public void eliminar(){}
}
