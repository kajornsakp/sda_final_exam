package com.company.flyweight

/**
 * Created by kajornsak on 4/30/2017 AD.
 */
enum class IconType(val key: String?) {

    FOLDER("dir"),
    JAVA("java"),
    PDF("pdf"),
    PICTURE("picture"),
    TEXT("txt"),
    UNKNOWN(null);

    companion object {
        fun from(value: String?): IconType = IconType.values().first{ it.key == value}
    }

}



