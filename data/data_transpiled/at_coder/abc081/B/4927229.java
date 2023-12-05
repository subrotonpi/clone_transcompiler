public static int N ( ) {
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = 0 ;
  boolean k = true ;
  while ( k == true ) {
    for ( int i = 0 ;
    i < A . length ;
    i ++ ) {
      if ( A [ i ] % 2 == 1 ) {
        k = false ;
        break ;
      }
    }
    if ( k == true ) {
      ans ++ ;
      for ( int i = 0 ;
      i < A . length ;
      i ++ ) {
        A [ i ] = A [ i ] / 2 ;
      }
    }
  }
  return ans ;
}
