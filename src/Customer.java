
    public class Customer implements Comparable<Customer>{
        private String name;
        private Integer priority;

        public Customer(String name, Integer priority)
        {
            this.name = name;
            this.priority = priority;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getPriority() {
            return priority;
        }

        public void setPriority(Integer priority) {
            this.priority = priority;
        }

        public int compareTo(Customer other) {
            if (this.priority > other.priority) return 1;
            else if (this.priority < other.priority) return -1;
            else return 0;
        }
}
