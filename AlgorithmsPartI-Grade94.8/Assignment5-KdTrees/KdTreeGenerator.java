/******************************************************************************
 *  Compilation:  javac KdTreeGenerator.java
 *  Execution:    java KdTreeGenerator n
 *  Dependencies: 
 *
 *  Creates n random points in the unit square and print to standard output.
 *
 *  % java KdTreeGenerator 5
 *  0.195080 0.938777
 *  0.351415 0.017802
 *  0.556719 0.841373
 *  0.183384 0.636701
 *  0.649952 0.237188
 *
 ******************************************************************************/

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;

public class KdTreeGenerator {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        KdTree kdtree = new KdTree();
        Stopwatch timer1 = new Stopwatch();
        for (int i = 0; i < n; i++) {
            double x = StdRandom.uniform(0.0, 1.0);
            double y = StdRandom.uniform(0.0, 1.0);
            Point2D point = new Point2D(x,y);
           kdtree.insert(point);
        }
        double time1 = timer1.elapsedTime();
        StdOut.printf("(%.2f seconds)\n",time1);
        StdOut.print(kdtree.size());
    }
}
