public static void ARC082D ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] p = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    p [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int cnt = 0 ;
  if ( p [ N - 1 ] == N ) {
    p [ N - 2 ] = p [ N - 1 ] ;
    cnt ++ ;
  }
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    if ( p [ i ] == i + 1 ) {
      p [ i ] = p [ i + 1 ] ;
      cnt ++ ;
    }
  }
  System . out . println ( cnt ) ;
}
