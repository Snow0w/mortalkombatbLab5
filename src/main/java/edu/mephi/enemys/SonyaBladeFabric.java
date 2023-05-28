/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license Click
 * nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this
 * template
 */
package edu.mephi.enemys;
import edu.mephi.EnemyFabricInterface;
import edu.mephi.Player;

/**
 *
 * @author Мария
 */
public class SonyaBladeFabric implements EnemyFabricInterface {

  @Override
  public Player create(int i) {
    Player enemy;
    enemy = new SonyaBlade(1, 80, 16, 1);
    return enemy;
  }
}
