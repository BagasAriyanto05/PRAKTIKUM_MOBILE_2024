package com.bagasariyanto.bagasafzajokoariyanto32601900008.data.response

import com.google.gson.annotations.SerializedName

data class Menus(

	@field:SerializedName("foods")
	val foods: List<FoodsItem>,

	@field:SerializedName("drinks")
	val drinks: List<DrinksItem>
)