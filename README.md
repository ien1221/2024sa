1. 更改命名
    - `TaskList.java` -> `ToDoList.java`
2. 資料夾分層
    - 新增`command`資料夾，存有`command`與各種實作`ICommand`的class
    - 新增`taskList`資料夾，存有原`Task.java`與管理`Map<String, List<Task>>`的class - `TaskList.java`
3. 抽離IO
    - 新增IO資料夾，並存放兩個class - `Input`與`Output`，分別管理輸出和輸入