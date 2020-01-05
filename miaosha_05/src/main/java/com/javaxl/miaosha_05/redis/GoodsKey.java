package com.javaxl.miaosha_05.redis;

public class GoodsKey extends BasePrefix{

	private GoodsKey(int expireSeconds, String prefix) {
		super(expireSeconds, prefix);
	}
	//商品id
	public static GoodsKey getGoodsList = new GoodsKey(60, "gl");
	//描述
	public static GoodsKey getGoodsDetail = new GoodsKey(60, "gd");
	//库存
	public static GoodsKey getMiaoshaGoodsStock= new GoodsKey(0, "gs");
}
