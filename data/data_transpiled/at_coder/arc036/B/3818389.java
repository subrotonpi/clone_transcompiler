public static void print ( int N ) {
  int [ ] H = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    H [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  H = new int [ N - 1 ] ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    H [ i ] = H [ i + 1 ] - H [ i ] ;
  }
  H = new boolean [ N - 2 ] ;
  for ( int i = 0 ;
  i < N - 2 ;
  i ++ ) {
    H [ i ] = true ;
  }
  int before = 0 ;
  int maxSize = 1 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( H [ i ] == false ) {
      continue ;
    }
    if ( before != 0 ) {
      maxSize = Math . max ( maxSize , i - before + 1 ) ;
    }
    before = i ;
  }
  System . out . println ( maxSize ) ;
}
