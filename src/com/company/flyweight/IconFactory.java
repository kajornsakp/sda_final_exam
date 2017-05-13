//
// $Header: /home/due1/cvsreps/due/java/pattern/flyweight/IconFactory.java.templ,v 1.1 2002-05-14 09:41:25 due Exp $
//
// Copyright (c) 2002 Eric Dubuis,
// Berner Fachhochschule, HTA Biel.
// All rights reserved.
//
// Based on: J.W. Cooper, Java Design Patterns, Addison-Wesley 2000.

package com.company.flyweight;


import javax.swing.*;
import java.util.*;

public class IconFactory {

    private Map iconmap = new HashMap();

    private static IconFactory instance;
    // Singleton.
    // COMPLETE.
    public static IconFactory getInstance(){
        if(instance == null){
            return new IconFactory();
        }
        return instance;
    }

    public synchronized AbstractIcon createIcon(String key) {
        // COMPLETE.
        IconType iconType = IconType.Companion.from(key);
        AbstractIcon icon = (AbstractIcon) iconmap.get(iconType);
        if (icon == null) {
            switch (iconType){
                case FOLDER:
                    icon = new FolderIcon();
                    break;
                case JAVA:
                    icon = new JavaIcon();
                    break;
                case PDF:
                    icon = new PdfIcon();
                    break;
                case PICTURE:
                    icon = new PictureIcon();
                    break;
                case TEXT:
                    icon = new TextIcon();
                    break;
                default:
                    icon = new UnknownIcon();
                    break;
            }
            iconmap.put(iconType,icon);
        }
        return icon;
    }
}
