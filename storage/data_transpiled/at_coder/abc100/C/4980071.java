public static void main ( ) {
  N = Integer . parseInt ( input ( ) ) ;
  a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    while ( a [ i ] % 2 == 0 ) {
      ans ++ ;
      a [ i ] = Integer . parseInt ( input ( ) ) ;
    }
  }
  System . out . println ( ans ) ;
}
