package com.example.liaoruochen.myeyes.net.bean

class Result {
    var itemList:List<ItemList>? = null
    var count:Int = 0
    var tottal:Int = 0
    var nextPageUrl:String? = null
    var adExist:Boolean =false
    var updateTime: Any? =null
    var refreshCount :Int? = 0
    var lastStartId : Int? = 0



    class ItemList{
        var type:String? = null
        var tag:String? = null
        var id :Int = 0
        var adIndex:Int = 0

        var data :Any? = null

        override fun toString(): String {
            return "ItemList(type=$type, tag=$tag, id=$id, adIndex=$adIndex, data=$data)"
        }
    }

}