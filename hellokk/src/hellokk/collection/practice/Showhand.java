package hellokk.collection.practice;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Showhand {
	private final int PLAY_NUM=5;
	private String[]types = {"方片","梅花","红心","黑桃"};
	private String[] values={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
	private List<String>cards = new LinkedList<String>();
	private String [] players = new String [PLAY_NUM];
	private List<String>[] playersCards = new List[PLAY_NUM];
	public void initCards(){
		for(int i=0;i<types.length;i++){
			for(int j=0;j<values.length;j++){
				cards.add(types[i]+values[j]);
			}
		}
		Collections.shuffle(cards);
	}
	
	public void initPlayers(String ...name){
		if(name.length>PLAY_NUM || name.length<2){
			System.out.println("玩家的数量不对");
			return;
		}else{
			for(int i=0;i<name.length;i++){
				players[i]=name[i];
			}
		}
	}
	public void initPlayersCards(){
		for(int i=0;i<players.length;i++){
			if(players[i] !=null && !players[i].equals("")){
				playersCards[i] = new LinkedList<String>();
			}
		}
	}
	public void showAllcards(){
		for(int i=0;i<cards.size();i++){
			System.out.println(cards.get(i));
		}
	}
	public void deliverCard(String first){
		
	}
	public void showPlayerCards(){
		
	}
}
