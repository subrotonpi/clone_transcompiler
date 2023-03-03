public static int [ ] getN ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  /*while (b != 0) {
  a,b = b;
  }*/
  /*lcm */
  int [ ] T = new int [ 2 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    T [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  if ( N == 1 ) {
    System . out . println ( T [ 0 ] ) ;
  }
  else {
    int a = lcm ( T [ 0 ] , T [ 1 ] ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      a = lcm ( a , T [ i ] ) ;
    }
    System . out . println ( a ) ;
  }
  return T ;
}
