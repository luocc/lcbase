package com.lc.base.dialog;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.lc.base.R;


/**
 * Created by vondear on 2016/7/19.
 * Mainly used for confirmation and cancel.
 */
public class RxEditDialog extends RxBaseDialog {

    private ImageView mIvLogo;
    private TextView mTvSure;
    private TextView mTvCancel;
    private EditText editText;
    private TextView mTvTitle;

    public RxEditDialog(Context context, int themeResId) {
        super(context, themeResId);
        initView();
    }

    public RxEditDialog(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
        initView();
    }

    public RxEditDialog(Context context) {
        super(context);
        initView();
    }

    public RxEditDialog(Activity context) {
        super(context);
        initView();
    }

    public RxEditDialog(Context context, float alpha, int gravity) {
        super(context, alpha, gravity);
        initView();
    }

    public ImageView getLogoView() {
        return mIvLogo;
    }

    public void setTitle(String title) {
        mTvTitle.setText(title);
    }

    public TextView getTitleView() {
        return mTvTitle;
    }

    public EditText getEditText() {
        return editText;
    }

    public TextView getSureView() {
        return mTvSure;
    }

    public void setSure(String strSure) {
        this.mTvSure.setText(strSure);
    }

    public TextView getCancelView() {
        return mTvCancel;
    }

    public void setCancel(String strCancel) {
        this.mTvCancel.setText(strCancel);
    }

    private void initView() {
        View dialogView = LayoutInflater.from(getContext()).inflate(R.layout.dialog_rxedit, null);
        mIvLogo = (ImageView) dialogView.findViewById(R.id.iv_logo);
        mTvTitle = (TextView) dialogView.findViewById(R.id.tv_title);
        mTvSure = (TextView) dialogView.findViewById(R.id.tv_sure);
        mTvCancel = (TextView) dialogView.findViewById(R.id.tv_cancle);
        editText = (EditText) dialogView.findViewById(R.id.editText);
        setContentView(dialogView);
    }
}