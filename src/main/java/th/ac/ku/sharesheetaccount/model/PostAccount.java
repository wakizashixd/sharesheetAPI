package th.ac.ku.sharesheetaccount.model;

import javax.persistence.*;
@Entity
@Table(name = "post_account", schema = "sharesheetaccount")
public class PostAccount {

        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        private int id;

        private String namepost;
        private String description;
        private String file;

    public PostAccount() {
    }

    public PostAccount(int id, String namepost, String description, String file) {
        this.id = id;
        this.namepost = namepost;
        this.description = description;
        this.file = file;
    }

    public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNamepost() {
            return namepost;
        }

        public void setNamepost(String namepost) {
            this.namepost = namepost;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getFile() {
            return file;
        }

        public void setFile(String file) {
            this.file = file;
        }

        @Override
        public String toString() {
            return "Post{" +
                    "post_id=" + id +
                    ", namePost='" + namepost + '\'' +
                    ", description='" + description + '\'' +
                    ", file='" + file + '\'' +
                    '}';
        }

}
