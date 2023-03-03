public static int N = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  LinkedList < Integer > hList = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    hList . add ( i ) ;
  }
  int [ ] dp = new int [ N ] ;
  dp [ 0 ] = 0 ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    dp [ i ] = Math . min ( dp [ i ] , dp [ i - 1 ] + Math . abs ( hList . get ( i ) - hList . get ( i - 1 ) ) ) ;
    if ( i > 1 ) {
      dp [ i ] = Math . min ( dp [ i ] , dp [ i - 2 ] ) ;
    }
  }
  return dp [ N - 1 ] ;
}
