public static int N = Integer . parseInt ( input ) {
  int [ ] dp = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    dp [ Integer . parseInt ( input . nextLine ( ) ) - 1 ] = i ;
  }
  int ans = 0 ;
  int cc = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( dp [ i ] < dp [ i ] ) {
      cc ++ ;
    }
  }
  return cc ;
}
