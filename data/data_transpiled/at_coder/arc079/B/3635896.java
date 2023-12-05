public static int K = Integer . parseInt ( input ) {
  int a = K / 50 ;
  int b = K % 50 ;
  int [ ] Ans = new int [ ] {
    100 + a - b }
    ;
    System . arraycopy ( b , 0 , Ans , 50 , 50 ) ;
    return ( int ) ( 50 * Ans ) ;
  }
  