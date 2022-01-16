public class EnemyTest {
    public static void main(String[] args) {
        System.out.println("===================\nTestare Enemy\n===================");
        System.out.println("Instantiem un inamic nou:");
        Enemy enemy = new Enemy();
        System.out.println("Acesta are abilitatile:");
        for (int i = 0; i < enemy.spells.size(); i++) {
            if(enemy.spells.get(i).damage == 4)
                System.out.println("Fire, damage " + enemy.spells.get(i).damage + ", mana " + enemy.spells.get(i).mana);
            if(enemy.spells.get(i).damage == 10)
                System.out.println("Earth, damage " + enemy.spells.get(i).damage + ", mana " + enemy.spells.get(i).mana);
            if(enemy.spells.get(i).damage == 18)
                System.out.println("Ice, damage " + enemy.spells.get(i).damage + ", mana " + enemy.spells.get(i).mana);
        }
        System.out.println("Are health " + enemy.health + " si mana " + enemy.mana);
        System.out.println("Este imun la fire: " + enemy.fire + ", ice: " + enemy.ice + " si earth: " + enemy.earth);
        System.out.println("El este reprezentat pe grid cu " + enemy.toCharacter());
        enemy.receiveDamage(10);
        System.out.println("Daca ii dam damage cu un spell de pamant (10) inamicului nostru, atunci va avea viata: " + enemy.health + " (in cazul in care era imun la pamant, a primit damage doar 5, si are 50% sanse sa nu primeasca damage deloc)");
        System.out.println("Ii creem un caracter ca sa il atace inamicul nostru");
        Character warrior = CharacterFactory.makeCharacter(CharacterType.WARRIOR);
        System.out.println("Caracterul " + warrior.name + " este de tip warrior si are health " + warrior.health);
        System.out.println("Dintre abilitati, enemy-ul cauta abilitatea cu cel mai mare damage pentru care are mana necesar");
        enemy.useSpell(enemy.getBestSpell(), warrior);
        System.out.println("Daca enemy-ul il loveste pe caracter cu acesta, atunci caracterul va avea health " + warrior.health);

    }
}
