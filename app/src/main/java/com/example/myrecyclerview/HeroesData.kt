package com.example.myrecyclerview

object HeroesData {
    private val heroNames = arrayOf(
        "Sukarno",
        "Kartini",
        "Sudirman",
        "Patimura",
        "Imam Bonjol"
    )

    private val heroDesc = arrayOf(
        "Presiden Indonesia",
        "Pahlawan Indonesia",
        "Pahlawan Indonesia",
        "Pahlawan Indonesia",
        "Pahlawan Indonesia",
    )

    private val heroImages = intArrayOf(
        R.drawable.sukarno,
        R.drawable.kartini,
        R.drawable.sudirman,
        R.drawable.patimura,
        R.drawable.imambonjol
    )

    val listData : ArrayList<Hero>
        get() {
            val list = arrayListOf<Hero>()
            for (position in heroNames.indices) {
                val hero = Hero()
                hero.name = heroNames[position]
                hero.desc = heroDesc[position]
                hero.photo = heroImages[position]
                list.add(hero)
            }
            return list
        }

}