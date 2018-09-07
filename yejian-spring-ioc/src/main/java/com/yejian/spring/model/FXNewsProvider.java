package com.yejian.spring.model;

import com.yejian.spring.service.IFXNewsListener;
import com.yejian.spring.service.IFXNewsPersister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author YeJian (jian.ye@downjoy.com)
 * @Description: 用于一般新闻处理
 * @date 2018/8/29 15:09
 */
//@Component("fXNewsProvider")
public class FXNewsProvider {

//    @Autowired
    private IFXNewsListener ifxNewsListener;

//    @Autowired
    private IFXNewsPersister ifxNewsPersister;

    public FXNewsProvider(){}

    public FXNewsProvider(IFXNewsListener ifxNewsListener, IFXNewsPersister ifxNewsPersister){
            this.ifxNewsListener=ifxNewsListener;
            this.ifxNewsPersister=ifxNewsPersister;
    }

    public void getAndPersisterNew(){
        ifxNewsListener.getNews();
        ifxNewsPersister.persister();
    }

    public IFXNewsListener getIfxNewsListener() {
        return ifxNewsListener;
    }

    public void setIfxNewsListener(IFXNewsListener ifxNewsListener) {
        this.ifxNewsListener = ifxNewsListener;
    }

    public IFXNewsPersister getIfxNewsPersister() {
        return ifxNewsPersister;
    }

    public void setIfxNewsPersister(IFXNewsPersister ifxNewsPersister) {
        this.ifxNewsPersister = ifxNewsPersister;
    }
}
