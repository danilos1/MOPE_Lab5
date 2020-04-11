import java.util.Arrays;

public class Lab5 {
    static int getAvg(int[] a) {
        return (int)Math.round(Arrays.stream(a).average().getAsDouble());
    }

    public static void main(String[] args) {
        int[] xMinMax = {-10, 1, -9, 7, -8, 3};
        System.out.println("x1min = " + xMinMax[0] + ", x1max = " + xMinMax[1] + ", x2min = " + xMinMax[2] +
                ", x2max = " + xMinMax[3] + ", x3min = " + xMinMax[4] + ", x3max = " + xMinMax[5]);
        int Ymin = 200 + getAvg(new int[]{xMinMax[0], xMinMax[2], xMinMax[4]});
        int Ymax = 200 + getAvg(new int[]{xMinMax[1], xMinMax[3], xMinMax[5]});

        System.out.println("from Ymin = "+Ymin+" to Ymax = "+Ymax);

        ThreeFactorsExperiment exp = new ThreeFactorsExperiment(xMinMax, Ymin, Ymax);
        exp.printMatrixOfPlanning();
        exp.findEquationOfRegression();

        exp.testByCriterionKohrena();
        exp.testByStudentCriterion();
        exp.testByFisheraCriterion();
    }
}
