package com.epam.state;

public class StateGiveGoodsWithRest implements VendingMachineState {
	@Override
	public boolean giveGoodsToCustomer(Goods goods, int rest) {
		System.out.println(" goods " + goods.getName() + " was given to customer and there is rest " + rest);
		return true;
	}
}
