public static void print ( int N ) {
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( A [ i ] < 80 ) {
      ans += ( 80 - A [ i ] ) ;
    }
  }
  System . out . println ( ans ) ;
}
