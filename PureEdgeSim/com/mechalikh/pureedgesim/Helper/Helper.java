package com.mechalikh.pureedgesim.Helper;

import java.util.ArrayList;
import java.util.List;

import com.mechalikh.pureedgesim.TasksGenerator.Task;

public class Helper {
    public static List<Task> GetFlattenedTasks(Task t)
    {
        List<Task> taskList= new ArrayList<Task>();
        while(t!= null)
        {
            taskList.add(t);
            t = t.getNextInLineTask();
        }
        return taskList;
    }

    public static Task GetLinkedTasks(List<Task> tasks)
    {
        Task head=null;
        Task current=null;
        for (Task task : tasks) {
            if(head == null)
            {
                head = task;                
            }
            else
            {
                current.setNextInLineTask(task);
            }
            current=task;
        }
        return head;
    }

    public static int GetTotalTasksCount(List<Task> tasks)
    {
        int result= 0;
        for (Task t : tasks) {
            while(t!= null)
            {
                t = t.getNextInLineTask();
                result++;
            }
        }
        return result;
    }
}
