package ChasisApplication.examenfinal.Entidades;

import javax.persistence.*;

@Entity
@Table(name = "satatus")
public class ResourceStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private int cpus;
    private long maxMemory;
    private long totalMemory;
    private long freeMemory;
    private double elapsedTime;
    private double totalSpaceC;
    private double freeSpaceC;



    public int getCpus() {
        return cpus;
    }

    public void setCpus(int cpus) {
        this.cpus = cpus;
    }

    public long getMaxMemory() {
        return maxMemory;
    }

    public void setMaxMemory(long maxMemory) {
        this.maxMemory = maxMemory;
    }

    public long getTotalMemory() {
        return totalMemory;
    }

    public void setTotalMemory(long totalMemory) {
        this.totalMemory = totalMemory;
    }

    public long getFreeMemory() {
        return freeMemory;
    }

    public void setFreeMemory(long freeMemory) {
        this.freeMemory = freeMemory;
    }

    public double getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(double elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public double getTotalSpaceC() {
        return totalSpaceC;
    }

    public void setTotalSpaceC(double totalSpaceC) {
        this.totalSpaceC = totalSpaceC;
    }

    public double getFreeSpaceC() {
        return freeSpaceC;
    }

    public void setFreeSpaceC(double freeSpaceC) {
        this.freeSpaceC = freeSpaceC;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
