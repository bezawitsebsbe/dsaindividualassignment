
public class Task {
	    private String title;
	    private String description;
	    private boolean completed;
    //Constructor to initialize a task with a title and description.
	     
	    public Task(String title, String description) {
	        this.title = title;
	        this.description = description;
	        this.completed = false;
	    }

	    // Returns the title of the task.
	    public String getTitle() {
	        return this.title;
	    }
	    //Returns the description of the task.
        public String getDescription() {
	        return this.description;
	    }
        //Returns the completed status of the task.
	    public boolean isCompleted() {
	        return this.completed;
	    }

	    // Method to mark the task as completed
	    public void markCompleted() {
	        this.completed = true;
	    }
	}


