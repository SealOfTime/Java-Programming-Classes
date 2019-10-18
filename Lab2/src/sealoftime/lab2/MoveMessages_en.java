package sealoftime.lab2;

public class MoveMessages_en extends MoveMessages{
	public MoveMessages_en(){
		
	}
	/* Suggestion:
		Make ru.ifmo.se.pokemon.Move::describe() accept Pokemon att and Pokemon def in order to be
		able to make more interesting messages.
		Otherwise it would be interesting if ::describe() worked with ResourceBundle, getting the 
		description via key equal to this.class.getSimpleName()
	*/
	protected Object[][] getContents() {
		return new Object[][]{
			{"fireBlast", "uses a fiery blast that scorches all. May cause a burn."},
			{"swordsDance", "uses a fighting dance that sharply raises ATTACK."},
			{"facade", "uses an attack that is boosted if user is burned, poisoned, or paralyzed."},
			{"doubleEdge", "uses a life-risking tackle that also hurts the user."},
			{"extremeSpeed", "charges itself at blinding speed. This move always goes first."},
			{"firePunch", "uses a fiery punch that may burn the foe."},
			{"focusBlast", "heightens its mental focus and unleashes its power. This may also lower the target’s Sp. Def stat."},
			{"psychic", "uses a powerful psychic attack that may lower SP. DEF."},
			{"screech", "emits a screech to sharply reduce the foe’s DEFENSE."},
			{"confide", "tells the target a secret, and the target loses its ability to concentrate. This lowers the target’s Sp. Atk stat."},
			{"flamethrower", "uses a powerful fire attack that may inflict a burn."},
		};
    }
}