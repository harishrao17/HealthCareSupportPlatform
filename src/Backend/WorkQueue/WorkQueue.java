/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author Arun Balasubramanian
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
}