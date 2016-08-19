# IntervalClick
一个编译时注解的库，主要用于 设置view点击时 点击间隔时长
#使用方法
```java
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IntervalClick.inject(this);
    }

    @OnceClick(id=R.id.btn,time = 10000)
    public void once() {
        //点击事件
        Log.d("tag", "onceMe:" + System.currentTimeMillis());
    }
    
    @OnceClick(id = R.id.btn2,time = 5000)
    public void onceMe(View v) {
        ((Button) v).setText("click" + num++);
        Log.d("tag", "onceMe");
    }
```
#工程导入，下载编译成功后，直接导入onceclick-release.aar,即可。
