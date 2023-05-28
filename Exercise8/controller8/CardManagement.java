package controller8;

import java.util.ArrayList;
import java.util.List;

import model8.Card;

public class CardManagement {
	List<Card> cardList;
	
	public CardManagement() {
		this.cardList = new ArrayList<>();
	}
	
	//add card
	public void addCard(Card card) {
		this.cardList.add(card);
	}
	//delete card by idCard
	public void deleteCardByid(int id) {
		for(int i = 0 ; i < cardList.size() ; i++) {
			if(cardList.get(i).getIdCard() == id) {
				this.cardList.remove(i);
			}
		}
	}
	//show list of card
	public void showListCard() {
		for(Card card : cardList) {
			System.out.println(card.toString());
		}
	}
}






