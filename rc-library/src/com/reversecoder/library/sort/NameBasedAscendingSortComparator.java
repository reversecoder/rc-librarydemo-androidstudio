package com.reversecoder.library.sort;

import com.reversecoder.library.model.BaseModelItem;

import java.util.Comparator;

/**
 * @author Md. Rashsadul Alam
 */
public class NameBasedAscendingSortComparator implements
        Comparator<BaseModelItem> {
    public int compare(BaseModelItem one, BaseModelItem another) {
        return one.getItemTitle().compareToIgnoreCase(another.getItemTitle());
        /*
		 * int returnVal = 0;
		 * 
		 * if(one.getItemTitle() < another.getItemTitle()){ returnVal = -1;
		 * }else if(one.getItemTitle() > another.getItemTitle()){ returnVal = 1;
		 * }else if(one.getItemTitle() == another.getItemTitle()){ returnVal =
		 * 0; } return returnVal;
		 */
    }
}
