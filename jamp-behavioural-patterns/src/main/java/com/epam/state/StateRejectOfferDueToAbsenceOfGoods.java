package com.epam.state;

public class StateRejectOfferDueToAbsenceOfGoods implements VendingMachineState {
	@Override
	public boolean giveGoodsToCustomer(Goods goods, int money) {
		System.out.println(" goods " + goods.getName() + " was not given because there is no such goods");
		return false;
	}
}
