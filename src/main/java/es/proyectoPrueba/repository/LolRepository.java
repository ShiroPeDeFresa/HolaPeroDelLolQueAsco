package es.proyectoPrueba.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import es.proyectoPrueba.connection.AbstractConnection;
import es.proyectoPrueba.connection.H2Connection;
import es.proyectoPrueba.model.Ability;
import es.proyectoPrueba.model.Champion;
import es.proyectoPrueba.model.Item;
import es.proyectoPrueba.model.Rune;
import es.proyectoPrueba.model.Stats;
import es.proyectoPrueba.model.Tips;
public class LolRepository {

	private static final String jdbcUrl = "jdbc:h2:file:./src/main/resources/test;";
	AbstractConnection manager = new H2Connection();


	public void insertChampion(Champion champion) {
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = conn
					.prepareStatement("INSERT INTO CHAMPIONS (ID,CHAMPION_NAME,TITLE,LORE,TAGS)" + "VALUES (?, ?, ?, ?, ?)");
			preparedStatement.setInt(1, champion.getId());
			preparedStatement.setString(2, champion.getName());
			preparedStatement.setString(3, champion.getTitle());
			preparedStatement.setString(4, champion.getLore());
			preparedStatement.setString(5, champion.getTags());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			manager.close(preparedStatement);
			manager.close(conn);
		}

	}
	
	public void insertItem(Item item) {
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = conn
					.prepareStatement("INSERT INTO ITEMS (ID,ITEM_NAME,EFFECT)" + "VALUES (?, ?, ?)");
			preparedStatement.setInt(1, item.getId());
			preparedStatement.setString(2, item.getName());
			preparedStatement.setString(3, item.getEffect());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			manager.close(preparedStatement);
			manager.close(conn);
		}

	}
	
	public void insertRunes(Rune rune) {
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = conn
					.prepareStatement("INSERT INTO RUNES (ID,TIER,RUNE_NAME,RUNE_DESCRIPTION)" + "VALUES (?, ?, ?, ?)");
			preparedStatement.setInt(1, rune.getId());
			preparedStatement.setInt(2, rune.getTier());
			preparedStatement.setString(3, rune.getName());
			preparedStatement.setString(4, rune.getDescription());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			manager.close(preparedStatement);
			manager.close(conn);
		}

	}
	
	public void insertAbilities(Ability ability) {
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = conn
					.prepareStatement("INSERT INTO ABILITIES (ID,CHAMPION,NAME,DESCRIPTION,EFFECT,COST,RANGO)" + "VALUES (?, ?, ?, ?, ?, ?, ?)");
			preparedStatement.setInt(1, ability.getId());
			preparedStatement.setInt(2, ability.getChampion());
			preparedStatement.setString(3, ability.getName());
			preparedStatement.setString(4, ability.getDescription());
			preparedStatement.setString(5, ability.getEffect());
			preparedStatement.setString(6, ability.getCost());
			preparedStatement.setInt(7, ability.getRange());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			manager.close(preparedStatement);
			manager.close(conn);
		}
	
	}
	
	public void insertStats(Stats stats) {
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = conn
					.prepareStatement("INSERT INTO ABILITIES (CHAMPION,NAME,VALUE,MODIFIER_PER_LEVEL)" + "VALUES (?, ?, ?, ?)");
			preparedStatement.setInt(1, stats.getChampion());
			preparedStatement.setString(2, stats.getName());
			preparedStatement.setDouble(3, stats.getValue());
			preparedStatement.setDouble(4, stats.getModifierPerLevel());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			manager.close(preparedStatement);
			manager.close(conn);
		}

	}
	
	public void insertTips(Tips tips) {
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = conn
					.prepareStatement("INSERT INTO CHAMPION_TIPS (ID,CHAMPION,TIP)" + "VALUES (?, ?, ?)");
			preparedStatement.setInt(1, tips.getId());
			preparedStatement.setInt(2, tips.getChampion());
			preparedStatement.setString(3, tips.getTip());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			manager.close(preparedStatement);
			manager.close(conn);
		}

	}
	
	public void modifyChampion(Champion champion) {
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = conn
					.prepareStatement("UPDATE CHAMPIONS SET NAME  = '" + champion.getName() + "'" +
													", TITLE = '" + champion.getTitle() + "'" +
													", LORE = '" + champion.getLore() + "'" +
													", TAGS = '" + champion.getTags() + "'" +
									  "WHERE ID = " + champion.getId());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			manager.close(preparedStatement);
			manager.close(conn);
		}

	}
	
	public void modifyRune(Rune rune) {
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = conn
					.prepareStatement("UPDATE RUNES SET TIER  = " + rune.getTier() +
													", NAME = '" + rune.getName() + "'" +
													", DESCRIPTION = '" + rune.getDescription() + "'" +
									  "WHERE ID = " + rune.getId());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			manager.close(preparedStatement);
			manager.close(conn);
		}

	}
	
	public void modifyItem(Item item) {
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = conn
					.prepareStatement("UPDATE ITEMS SET NAME  = '" + item.getName() + "'" +
													", EFFECT = '" + item.getEffect() + "'" +
									  "WHERE ID = " + item.getId());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			manager.close(preparedStatement);
			manager.close(conn);
		}

	}

	public List<Champion> listChamps() {
		List<Champion> lista = new ArrayList<>();
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = conn
					.prepareStatement("SELECT c.ID, c.CHAMPION_NAME, c.TITLE, c.LORE, c.TAGS FROM CHAMPIONS c");

			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("champion_name");
				String title = resultSet.getString("title");
				String lore = resultSet.getString("lore");
				String tags = resultSet.getString("tags");
				Champion champion = new Champion(id, name, title, lore, tags);
				lista.add(champion);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			manager.close(preparedStatement);
			manager.close(conn);
		}
		return lista;
	}
	
	public List<Ability> listAbilities() {
		List<Ability> lista = new ArrayList<>();
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = conn
					.prepareStatement("SELECT ca.ID, CHAMPION, ca.CHAMPION_NAME, ca.CHAMPION_DESCRIPTION, ca.EFFECT, ca.COST, ca.RANGO FROM CHAMPION_ABILITIES ca");

			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				int champion = resultSet.getInt("champion");
				String name = resultSet.getString("champion_name");
				String description = resultSet.getString("champion_description");
				String effect = resultSet.getString("effect");
				String cost = resultSet.getString("cost");
				int range = resultSet.getInt("rango");
				Ability ability = new Ability(id, champion, name, description, effect, cost, range);
				lista.add(ability);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			manager.close(preparedStatement);
			manager.close(conn);
		}
		return lista;
	}
	
	public List<Item> listItems() {
		List<Item> lista = new ArrayList<>();
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = conn
					.prepareStatement("SELECT i.ID, i.ITEM_NAME, i.EFFECT FROM ITEMS i");

			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
                String name = resultSet.getString("item_name");
                String effect = resultSet.getString("effect");
                Item item = new Item(id, name, effect);
				lista.add(item);
			
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			manager.close(preparedStatement);
			manager.close(conn);
		}
		return lista;
	}
	
	public List<Rune> listRunes() {
		List<Rune> lista = new ArrayList<>();
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = conn
					.prepareStatement("SELECT r.ID, r.TIER, r.RUNE_NAME, r.RUNE_DESCRIPTION FROM RUNES r");

			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
                int tier = resultSet.getInt("tier");
                String name = resultSet.getString("rune_name");
                String description = resultSet.getString("rune_description");
                Rune rune = new Rune(id, tier, name, description);
				lista.add(rune);
			
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			manager.close(preparedStatement);
			manager.close(conn);
		}
		return lista;
	}

	public List<Tips> listTips() {
		List<Tips> lista = new ArrayList<>();
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = conn
					.prepareStatement("SELECT t.ID, t.CHAMPION, t.TIP FROM CHAMPION_TIPS t");

			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
                int champion = resultSet.getInt("champion");
                String tip = resultSet.getString("tip");
                Tips tips = new Tips(id, champion, tip);
				lista.add(tips);
			
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			manager.close(preparedStatement);
			manager.close(conn);
		}
		return lista;
	}
	
	public List<Stats> listStats() {
		List<Stats> lista = new ArrayList<>();
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = conn
					.prepareStatement("SELECT s.CHAMPION, s.STAT_NAME, s.STAT_VALUE, s.MODIFIER_PER_LEVEL FROM CHAMPION_STATS s");

			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int champion = resultSet.getInt("champion");
                String name = resultSet.getString("stat_name");
                Double value = resultSet.getDouble("stat_value");
                Double mpl = resultSet.getDouble("modifier_per_level");
                Stats stat = new Stats(champion, name, value, mpl);
				lista.add(stat);
			
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			manager.close(preparedStatement);
			manager.close(conn);
		}
		return lista;
	}
	
	public String getNombreById(int id) {
		String nombre="";
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = conn
					.prepareStatement("SELECT s.CHAMPION_NAME FROM CHAMPIONS s WHERE s.ID = " + id );

			ResultSet resultSet = preparedStatement.executeQuery();
			nombre = resultSet.getString("champion_name");
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			manager.close(preparedStatement);
			manager.close(conn);
		}
		return nombre;
	}
	
	public void deleteWhereName(String id, String table) {
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = conn
					.prepareStatement("DELETE FROM " + table +" WHERE ID = " + id);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {	
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			manager.close(preparedStatement);
			manager.close(conn);
		}
	}
	public void deleteWhereChampion(Stats stat, String table) {
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = conn
					.prepareStatement("DELETE FROM " + table +" WHERE CHAMPION = " + stat.getChampion() +
										"AND STAT_NAME = '" + stat.getName() + "'" +
										"AND STAT_VALUE = " + stat.getValue() +
										"AND MODIFIER_PER_LEVEL = " + stat.getModifierPerLevel());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {	
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			manager.close(preparedStatement);
			manager.close(conn);
		}
	}


	
}
