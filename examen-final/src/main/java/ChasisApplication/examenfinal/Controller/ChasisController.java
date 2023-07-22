package ChasisApplication.examenfinal.Controller;

import ChasisApplication.examenfinal.Entidades.ResourceStatus;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.File;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

public class ChasisController {
    @GetMapping("/resource-status")
    public ResourceStatus getResourceStatus() {
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        long start = System.nanoTime();
        Runtime runtime = Runtime.getRuntime();
        int cpus = runtime.availableProcessors();
        long mmax = runtime.maxMemory() / 1024 / 1024;
        long mtotal = runtime.totalMemory() / 1024 / 1024;
        long mfree = runtime.freeMemory() / 1024 / 1024;
        File cDrive = new File("C:");

        double elapseTime = (System.nanoTime() - start) / 1_000_000_000.0;

        ResourceStatus status = new ResourceStatus();
        status.setCpus(cpus);
        status.setMaxMemory(mmax);
        status.setTotalMemory(mtotal);
        status.setFreeMemory(mfree);
        status.setElapsedTime(elapseTime);
        status.setTotalSpaceC(cDrive.getTotalSpace() / 1073741824.0);
        status.setFreeSpaceC(cDrive.getFreeSpace() / 1073741824.0);

        return status;
    }
}
