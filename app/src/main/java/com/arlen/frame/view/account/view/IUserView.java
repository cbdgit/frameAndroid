package com.arlen.frame.view.account.view;

import com.arlen.frame.common.base.IBaseView;
import com.arlen.frame.view.account.model.Account;

/**
 * Created by Arlen on 2016/12/22 18:30.
 */
public interface IUserView extends IBaseView{
    void showContentView(Account account);
}
