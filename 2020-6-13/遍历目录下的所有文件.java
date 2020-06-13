import java.io.File;
import java.util.LinkedList;
import java.util.Queue;

public class 遍历目录下的所有文件 {
    public static void main(String[] args) {
        String path = "D:\\Program Files";
        File root = new File(path);

        深度优先的遍历(root);

        广度优先的遍历(root);
    }

    private static void 深度优先的遍历(File root) {
        System.out.println(root.getAbsolutePath());
        //root如果不是文件夹 or  root空文件夹 ->  叶子
        if(root.isFile()){
            return;
        }
        if(!root.isDirectory()){
            return;
        }
        File[] files = root.listFiles();
        if(files == null){
            return;
        }
        if(files.length == 0){
            return;
        }
        for(File file : files){
            深度优先的遍历(file);
        }
    }


    private static void 广度优先的遍历(File root) {
        Queue<File> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            File file = queue.poll();
            System.out.println(file.getAbsolutePath());
            if(file.isDirectory()){
                File[] files = file.listFiles();
                if(files != null) {
                    for (File f : files) {
                        queue.offer(f);
                    }
                }
            }
        }
    }
}