package com.example.model;
//你可以理解为这是一个商店，拥有你想要购买的商品编号

public class Catalog {
    public static CatalogItem[] items= {//对象数组，数组里面是商品对象
            new CatalogItem("machinery001", "逻辑学",
                    "这是一本足以彻底改变你思维世界的小书。美国著名逻辑学家、哲学教授D.Q.麦克伦尼，将一门宽广、深奥的逻辑科学以贴近生活、通俗易懂、妙趣横生的语言娓娓道来。", 23.9),
            new CatalogItem("zhurongji001", "朱镕基答记者问",
                    "《朱镕基答记者问》收录了朱镕基同志在担任国务院副总理、总理期间回答中外记者提问和在境外发表的部分演讲", 131.1),
            new CatalogItem("yupingbo", "唐诗鉴赏辞典",
                    "《唐诗鉴赏辞典》共收唐代190多位诗人诗作1100多篇，由萧涤非，程千帆，马茂元。周汝昌，周振甫，霍松林等古典文学专家撰写赏析文章", 77.4),
            new CatalogItem("nalanxingde", "纳兰词",
                    "《纳兰词》时我国清代著名词人纳兰性德所著的词作合集，主题涉及爱情、友情、亲情、杂感等方面，塞外江南、古今人物尽收其中，"+"词风清丽隽秀、幽婉顽艳，颇有南唐后主之风，在中国文学史上有着极其特殊的地位与影响力", 21.8)
    } ;

    public static CatalogItem getItem(String itemID){//通过编号得到商品对象
        CatalogItem item ;
        if (itemID == null){
            return null ;
        }

        for (int i = 0; i < items.length; i++){
            item = items[i] ;
            if (itemID.equals(item.getItemID())){//如果目标商品编号和item的编号一致，那么就返回item作为目标商品
                return item ;
            }
        }
        return null ;
    }
}
