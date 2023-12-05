static final int [ ] [ ] solve ( ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  Scanner input = new Scanner ( System . in ) ;
  int [ ] OK = {
    0 , 1 , 2 , 3 , 5 , 6 , 7 , 8 }
    ;
    /* cnt N */
    int L = input . nextInt ( ) ;
    int [ ] [ ] dp = new int [ L + 1 ] [ L + 1 ] ;
    String N = new String ( Integer . toString ( N ) ) ;
    dp [ 0 ] [ 1 ] = 1 ;
    for ( int dig = 0 ;
    dig < L ;
    ++ dig ) {
      for ( int less = 0 ;
      less < 2 ;
      ++ less ) {
        for ( int new : OK ) {
          int leq = new < Integer > ( N . charAt ( dig ) ) || ( less == 1 && Integer . parseInt ( N . charAt ( dig ) ) == new ) ;
          dp [ dig + 1 ] [ leq ] += dp [ dig ] [ less ] ;
        }
      }
    }
    /* solve */
  }
  