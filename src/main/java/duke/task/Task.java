package duke.task;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getDescription() {
        return (isDone ? "[X] " : "[ ] ") + description;
    }

    public String getInitialDesc() {
        return description;
    }

    public boolean getStatus() {
        return isDone;
    }

    /**
     * Updates status of the task
     *
     * @param status Status if the task is done or not done.
     */
    public void mark(boolean status) {
        isDone = status;
    }

    /**
     * Converts date input into the right string format
     *
     * @param date LocalDateTime input.
     * @return Formatted date input in string form.
     */
    public String convertDate(LocalDateTime date) {
        return date.format(DateTimeFormatter.ofPattern("MMM dd yyyy, HH:mm"));
    }

}
