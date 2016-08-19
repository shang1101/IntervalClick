package com.shang.onceclick;

public interface AbstractInjector<T> {
    //注射代码
    void inject(Finder finder, T target, Object source);
}
