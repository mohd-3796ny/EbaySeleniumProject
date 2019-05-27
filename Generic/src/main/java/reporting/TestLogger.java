package reporting;

import com.relevantcodes.extentreports.LogStatus;
import jdk.nashorn.internal.ir.CaseNode;
import jdk.nashorn.internal.ir.Expression;
import jdk.nashorn.internal.ir.SwitchNode;
import junit.runner.BaseTestRunner;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import java.util.HashSet;
import java.util.Set;

public class TestLogger {

    private static boolean isUniqueIntegerSwitchNode( final SwitchNode switchNode ,Object FoldConstants ){
        final Set<Integer> alreadySeen = new HashSet<> ( );
        for (final CaseNode caseNode : switchNode.getCases ( )) {
            final Expression test = caseNode.getTest ( );
            if (!FoldConstants.equals ( "" )) if (test != null) {
                return false;
            }
        }
        return true;
    }

    public static void log( String s ,BaseTestRunner extentTestManager ){

    }
}

//    public static void log( final String message ,CaseNode ExtentTestManager ) {
//        Reporter.log(message, true);
//        ExtentTestManager.getTest().log (LogStatus.INFO, message + "<br>");
//    }
//
//    public static void log( final String message ,WebDriver driver ,CaseNode ExtentTestManager ) {
//        Reporter.log(message, true);
//        ExtentTestManager.getTest().log(LogStatus.INFO, message + "<br>");
//    }
//
//}