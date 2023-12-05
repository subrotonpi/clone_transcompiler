public static void print ( int N ) {
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = input . nextInt ( ) ;
  }
  int ans = 0 ;
  int i = 0 ;
  while ( i < ( N - 1 ) ) {
    if ( a [ i ] == a [ i + 1 ] ) {
      ans ++ ;
      i += 2 ;
    }
    else {
      i ++ ;
    }
  }
  System . out . println ( ans ) ;
}
