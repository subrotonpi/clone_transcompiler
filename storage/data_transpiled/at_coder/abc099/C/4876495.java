public static double [ ] L ( ) {
  L = new double [ ] {
    1 , 6 , 36 , 216 , 1296 , 7776 , 46656 , 9 , 81 , 729 , 6561 , 59049 }
    ;
    N = Integer . parseInt ( input ( ) ) ;
    dp = new double [ 200000 ] ;
    dp [ 0 ] = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      dp [ i ] = 0 ;
    }
    return dp ;
  }
  