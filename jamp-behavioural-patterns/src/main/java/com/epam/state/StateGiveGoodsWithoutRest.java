package com.epam.state;

public class StateGiveGoodsWithoutRest implements VendingMachineState {

	@Override
	public boolean giveGoodsToCustomer(Goods goods, int money) {
		System.out.println(" goods " + goods.getName() + " was given to customer and there is no rest ");
		return true;
	}

}
