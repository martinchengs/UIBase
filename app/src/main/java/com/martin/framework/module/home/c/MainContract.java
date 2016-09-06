package com.martin.framework.module.home.c;

import com.martin.framework.base.BaseDataProvider;
import com.martin.framework.base.BasePresenter;
import com.martin.framework.base.BaseView;

/**
 * Desc:
 * Author:Martin
 * Date:2016/8/15
 */
public interface MainContract {

    interface View extends BaseView<Presenter> {

    }

    interface Presenter extends BasePresenter {

    }

    interface DataProvider extends BaseDataProvider {

    }
}
