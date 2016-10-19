package com.zheng.observer.pull;

import com.google.common.base.Joiner;
import com.google.common.base.Objects;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

/**
 * 监听者1
 * Created by zhenglian on 2016/10/19.
 */
public class PullObserverImpl1 implements PullObserver {
    private String name;
    private PullSubject subject;

    private String data = null;//这里用于缓存从消息中心获取的数据

    public PullObserverImpl1(String name, PullSubject subject) {
        this.name = name;
        this.subject = subject;
    }

    public void update() {
        if (subject instanceof PullSubjectCenter) {
            System.out.println("observer " + name + " load center data....");
            PullSubjectCenter center = (PullSubjectCenter) subject;

            List<String> msgs = center.getMsgs();
            String cache = getDataStr(msgs);
            if (Objects.equal(cache, data)) {
                System.out.println("observer " + name + " check center data not changed!!!");
            } else {
                data = cache;
                System.out.println("data is : " + data);
            }
        }
    }

    private String getDataStr(List<String> list) {
        return Joiner.on(",").skipNulls().join(list);
    }

    @Override
    public boolean equals(Object obj) {
        if(null == obj) {
            return false;
        }

        if(!(obj instanceof PullObserverImpl1)) {
            return false;
        }

        PullObserverImpl1 other = (PullObserverImpl1) obj;

        return new EqualsBuilder().append(this.name, other.name).build();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(this.name).build();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).build();
    }
}
