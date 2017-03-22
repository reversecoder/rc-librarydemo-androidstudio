package com.reversecoder.library.customlistview;

import com.reversecoder.library.utils.CustomEffect;
import com.reversecoder.library.utils.CustomHelper;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

public class CustomListView extends ListView {

	private final CustomHelper mHelper;

	public CustomListView(Context context) {
		super(context);
		mHelper = init(context, null);
	}

	public CustomListView(Context context, AttributeSet attrs) {
		super(context, attrs);
		mHelper = init(context, attrs);
	}

	public CustomListView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		mHelper = init(context, attrs);
	}

	private CustomHelper init(Context context, AttributeSet attrs) {
		CustomHelper helper = new CustomHelper(context, attrs);
		super.setOnScrollListener(helper);
		return helper;
	}

	@Override
	public final void setOnScrollListener(OnScrollListener l) {
		mHelper.setOnScrollListener(l);
	}

	/**
	 * Sets the desired transition effect.
	 * 
	 * @param transitionEffect
	 *            Numeric constant representing a bundled transition effect.
	 */
	public void setTransitionEffect(int transitionEffect) {
		mHelper.setTransitionEffect(transitionEffect);
	}

	/**
	 * Sets the desired transition effect.
	 * 
	 * @param transitionEffect
	 *            The non-bundled transition provided by the client.
	 */
	public void setTransitionEffect(CustomEffect transitionEffect) {
		mHelper.setTransitionEffect(transitionEffect);
	}

	/**
	 * Sets whether new items or all items should be animated when they become
	 * visible.
	 * 
	 * @param onlyAnimateNew
	 *            True if only new items should be animated; false otherwise.
	 */
	public void setShouldOnlyAnimateNewItems(boolean onlyAnimateNew) {
		mHelper.setShouldOnlyAnimateNewItems(onlyAnimateNew);
	}

	/**
	 * If true animation will only occur when scrolling without the users finger
	 * on the screen.
	 * 
	 * @param onlyFlingEvents
	 */
	public void setShouldOnlyAnimateFling(boolean onlyFling) {
		mHelper.setShouldOnlyAnimateFling(onlyFling);
	}

	/**
	 * Stop animations after the list has reached a certain velocity. When the
	 * list slows down it will start animating again. This gives a performance
	 * boost as well as preventing the list from animating under the users
	 * finger if they suddenly stop it.
	 * 
	 * @param itemsPerSecond
	 *            , set to JazzyHelper.MAX_VELOCITY_OFF to turn off max
	 *            velocity. While 13 is a good default, it is dependent on the
	 *            size of your items.
	 */
	public void setMaxAnimationVelocity(int itemsPerSecond) {
		mHelper.setMaxAnimationVelocity(itemsPerSecond);
	}

	/**
	 * Enable this if you are using a list with items that should act like grid
	 * items.
	 * 
	 * @param simulateGridWithList
	 */
	public void setSimulateGridWithList(boolean simulateGridWithList) {
		mHelper.setSimulateGridWithList(simulateGridWithList);
		setClipChildren(!simulateGridWithList);
	}

}
