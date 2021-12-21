fun main(args: Array<String>) {

    val newsPaper = NewsPaper()
    val webSite = WebSite()
    val television = Television()

    val media = listOf<Media>(newsPaper, webSite, television)

    for (n in media) {
        n.printMediaType()
    }
}