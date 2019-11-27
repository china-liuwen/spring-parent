package param;

import org.aspectj.lang.ProceedingJoinPoint;


/**
 * 参数的
 */
public class ParamAspect {

    public void before(int m,int n){
        System.out.println("m = "+ m);
        System.out.println("n = "+ n);
    }

    public Object aroundParam(ProceedingJoinPoint joinPoint){
        Object result = null;
        try {
            result = joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        Object[] args = joinPoint.getArgs();
        for (int i = 0; i<args.length; i++){
            System.out.println(" args[i] = "+ args[i]);
        }
        return result;
    }
}
