package chapter1;


public class BraveKnight implements Kinght{

	private Quest quest;
	
	public BraveKnight(Quest quest){
		this.quest=quest;
	}
	
	@Override
	public void embarckOnQuest(){
		quest.embark();
	}
}
