package com.test.italika.base

import android.view.View


interface OnItemSelectListener<T> {

    fun onItemSelected(item: T, position: Int, view: View)
}