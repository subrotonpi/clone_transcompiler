public static final int [ ] getDoubleArray ( ) {
  final int N , K ;
  int [ ] arr ;
  int maxNum ;
  int minNum ;
  int ans ;
  int [ ] arr = new int [ ] {
    N , K }
    ;
    maxNum = ( int ) ( ( arr [ 0 ] + arr [ 1 ] - 1 ) / arr [ 1 ] ) ;
    minNum = ( int ) ( arr [ 0 ] / arr [ 1 ] ) ;
    ans = maxNum - minNum ;
    /* main program */
    N = Integer . parseInt ( input ( ) ) ;
    K = Integer . parseInt ( input ( ) ) ;
    Calculator c = new Calculator ( N , K ) ;
    ans = c . getDoubleArray ( ) ;
    System . out . println ( ans ) ;
    if ( getClass ( ) . isClassPresent ( Calculator . class ) ) {
      System . out . println ( "Calculator is not available" ) ;
    }
  }
  