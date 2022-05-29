package cat.institutmvm.application.utils;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
public class ControlDatos {
    private Connector conectar;
    private ModeloDatos modelo;
    private Connection con;
    public ControlDatos(){
        conectar = new Connector();
        modelo = new ModeloDatos();
    }
    public void insertar(String especie,String habitat,  int profundidad, int tiempo, String nubosidad, String direccion_viento,
     String fuerza_viento, String hora, String num_emb, String temp, String tipo_cebo, String sexo, String parasitos, String anzuelos,
     int num_anz, int abundancia){
        PreparedStatement ps;
        String sql;
        modelo.setEspecie(especie);
        modelo.setHabitat(habitat);
        modelo.setProfundidad(profundidad);
        modelo.setTiempo(tiempo);
        modelo.setNubosidad(nubosidad);
        modelo.setDireccion_viento(direccion_viento);
        modelo.setFuerza_viento(fuerza_viento);
        modelo.setHora(hora);
        modelo.setNum_emb(Integer.parseInt(num_emb));
        modelo.setTemp(Integer.parseInt(temp));
        modelo.setTipo_cebo(tipo_cebo);
        modelo.setSexo(sexo);
        modelo.setParasitos(parasitos);
        modelo.setAnzuelos(anzuelos);
        modelo.setNum_anz(num_anz);
        modelo.setAbundancia(abundancia);
        try{
            con = conectar.getConexion();
            sql = "insert into catsharks.prosharks values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, modelo.getEspecie());
            ps.setString(2, modelo.getHabitat());
            ps.setInt(3,modelo.getProfundidad());
            ps.setInt(4,modelo.getTiempo());
            ps.setString(5,modelo.getNubosidad());
            ps.setString(6, modelo.getDireccion_viento());
            ps.setString(7,modelo.getFuerza_viento());
            ps.setString(8,modelo.getHora());
            ps.setInt(9,modelo.getNum_emb());
            ps.setInt(10,modelo.getTemp());
            ps.setString(11,modelo.getTipo_cebo());
            ps.setString(12,modelo.getSexo());
            ps.setString(13,modelo.getParasitos());
            ps.setString(14,modelo.getAnzuelos());
            ps.setInt(15,modelo.getNum_anz());
            ps.setInt(16,modelo.getAbundancia());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se han insertado los datos correctamente");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
        }
    }
}
