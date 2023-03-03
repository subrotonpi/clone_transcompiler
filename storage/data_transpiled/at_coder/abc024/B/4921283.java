public static int N ( ) {
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int total = 0 ;
  int pre = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    total += T ;
    if ( pre > A [ i ] ) {
      total -= pre - A [ i ] ;
    }
    pre = A [ i ] + T ;
  }
  System . out . println ( total ) ;
  return total ;
}
