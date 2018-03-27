public class Task {
    private String taskDesc;
    private boolean isDone = false;


    public Task() {
    }

    //Set the description of task
    public void setTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc;

    }

    //Get the description of the task
    public String getTaskDesc(){
        return this.taskDesc;
    }

    //Mark a task that is done
    public void  setIsDone(boolean isDone){
        this.isDone = true;
    }



    //Get the done status of a task
    public boolean getIsDone(){
        return this.isDone;
    }

    @Override
    public String toString() {
        return taskDesc;
    }


}





