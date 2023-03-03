{
  int ops [ ] = {
    Integer . ADD , Integer . SUB }
    ;
    int uglyCount = 0 ;
    {
      boolean isUgly = num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0 ;
    }
    {
      int leftSliceNum = 0 ;
      String rightSlice = null ;
      Operator op = null ;
      if ( isUgly ) {
        op = Operator . PLUS ;
      }
      if ( isUgly ) {
        uglyCount ++ ;
      }
      if ( rightSlice . length ( ) > 1 ) {
        for ( int i : xrange ( - 1 , - rightSlice . length ( ) , - 1 ) ) {
          for ( Operator subOp : ops ) {
            countUgly ( op . apply ( leftSliceNum , Integer . parseInt ( rightSlice . substring ( 0 , i ) ) ) , rightSlice . substring ( i ) , subOp ) ;
          }
        }
      }
      if ( className . equals ( "java.util.Scanner" ) ) {
        int testsCount = Integer . parseInt ( readLine ( ) ) ;
        for ( int i : xrange ( testsCount ) ) {
          uglyCount = 0 ;
          countUgly ( 0 , readLine ( ) , Integer . parseInt ( "" ) ) ;
          System . out . println ( "Case #" + ( i + 1 ) + ": " + uglyCount ) ;
        }
      }
      return uglyCount ;
    }
    