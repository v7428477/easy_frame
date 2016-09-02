# easy_frame
集成框架
[√] 注解框架 butterknife

百度地图apk key ：lzk2Fz9Pds0ozu1mvA78VdXwi3sWlLGk
AndroidStudio 引入so 文件有点特殊我引用的方法：
    1.在“src/main”目录中新建名为“jniLibs”的目录；
    2.将so文件复制、粘贴到“jniLibs”目录内。
    注：如果没有引用so文件，可能会在程序执行的时候加载类库失败，有类似如下的DEBUG提示：
    java.lang.UnsatisfiedLinkError: Couldn't load library xxxx from loader dalvik.system.PathClassLoader



增加Base基类 BaseFragment 和 FragmentActivity
这是一个集成目前Android主流优秀第三方组件、优秀好用的自定义控件、实用工具类封装、以及一些APP共通模块（比如：版本更新、意见反馈、引导界面、基础的本地数据库操作、网络通信、图片加载等功能）的开发包，帮助程序员快速开发自己的APP