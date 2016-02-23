/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buldingmaintance;

/**
 *
 * @author prime
 */
public class Feedback {
    private int workerId;
        private String feedback;
        private int rating;
        private String workDone;
        private float priceTaken;

        public Feedback(){};
        
        public Feedback(int workerId, String feedback, int rating, String workDone, float priceTaken) {
            this.workerId = workerId;
            this.feedback = feedback;
            this.rating = rating;
            this.workDone = workDone;
            this.priceTaken = priceTaken;
        }

        public int getWorkerId() {
            return workerId;
        }

        public void setWorkerId(int workerId) {
            this.workerId = workerId;
        }

        public String getFeedback() {
            return feedback;
        }

        public void setFeedback(String feedback) {
            this.feedback = feedback;
        }

        public int getRating() {
            return rating;
        }

        public boolean setRating(int rating) {
            if(rating<0||rating>10)
                return false;
            this.rating = rating;
            return true;
        }

        public String getWorkDone() {
            return workDone;
        }

        public void setWorkDone(String workDone) {
            this.workDone = workDone;
        }

        public float getPriceTaken() {
            return priceTaken;
        }

        public boolean setPriceTaken(float priceTaken) {
           if(priceTaken<0)
               return false;
           
            this.priceTaken = priceTaken;
            return true;
        }

    @Override
    public String toString() {
        return  "workerId:" + workerId + "  feedback" + feedback + "\n"
                + " rating" + rating + "  workDone=" + workDone + "  priceTaken=" + priceTaken + "\n";
    }

        
}
