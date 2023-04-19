package finalProject.LibrarySystem;

import java.time.LocalDate;

public class Lending {
    private LocalDate dueDate;
    private Lendable lendable;
    private User user;

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Lendable getLendable() {
        return lendable;
    }

    public void setLendable(Lendable lendable) {
        this.lendable = lendable;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Lending(Lendable lendable, User user) {
        this.lendable = lendable;
        this.user = user;
        this.dueDate = LocalDate.now().plusDays(30);
    }
}
