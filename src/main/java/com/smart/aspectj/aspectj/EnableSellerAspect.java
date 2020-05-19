package com.smart.aspectj.aspectj;

import com.smart.Seller;
import com.smart.SmartSeller;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.core.Ordered;

@Aspect
public class EnableSellerAspect implements Ordered {
    @DeclareParents(value = "com.smart.NaiveWaiter",defaultImpl = SmartSeller.class)
    public Seller seller;

    public int getOrder() {
        return 0;
    }
}
