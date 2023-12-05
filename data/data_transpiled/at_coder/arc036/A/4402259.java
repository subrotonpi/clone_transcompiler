public static int N ( ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] L = new int [ N ] ;
  for ( int i = 0 ;
  i < L . length ;
  i ++ ) {
    L [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int res = - 1 ;
  for ( int i = 2 ;
  i < N ;
  i ++ ) {
    if ( L [ i - 2 ] + L [ i - 1 ] + L [ i ] < K ) {
      res = i + 1 ;
      break ;
    }
  }
  System . out . println ( res ) ;
  return res ;
}
