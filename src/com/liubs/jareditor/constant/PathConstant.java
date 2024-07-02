package com.liubs.jareditor.constant;

/**
 * 路径常量
 * @author Liubsyy
 * @date 2024/6/22
 */
public interface PathConstant {

    //编译保存存放的根目录
    String JAR_EDIT_CLASS_PATH = "jar_edit_out";

    //从剪切版粘贴文件到临时目录
    String CLIPBOARD_TO_FILE = "clipboard_to_file";

    //文件拷贝到剪切板临时目录
    String FILE_TO_CLIPBOARD = "file_to_clipboard";

    //复杂jar依赖临时目录
    String DEPENDENCY_DIR = "dependency_temp";

    //windows命令参数临时文件(命令行最大上限问题)
    String JAR_EDITOR_COMPILE_PARAMS_TXT = "/JAR_EDITOR_COMPILE_PARAMS.txt";

}
