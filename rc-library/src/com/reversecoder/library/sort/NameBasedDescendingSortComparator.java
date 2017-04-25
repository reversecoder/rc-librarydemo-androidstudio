package com.reversecoder.library.sort;

import com.reversecoder.library.model.BaseModelItem;

import java.util.Comparator;

/**
 * @author Md. Rashsadul Alam
 */
public class NameBasedDescendingSortComparator implements
        Comparator<BaseModelItem> {
    public int compare(BaseModelItem one, BaseModelItem another) {
        int returnVal = one.getItemTitle().compareToIgnoreCase(
                another.getItemTitle());

        if (returnVal < 0) {
            returnVal = 1;
        } else if (returnVal > 0) {
            returnVal = -1;
        }

        return returnVal;
    }
}
