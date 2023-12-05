public static void print ( int N ) {
  int D = Integer . parseInt ( input ( ) ) ;
  int X = Integer . parseInt ( input ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  int ans = X ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < 100 ;
    j ++ ) {
      if ( j * A [ i ] + 1 <= D ) {
        ans ++ ;
      }
    }
  }
  System . out . println ( ans ) ;
}
