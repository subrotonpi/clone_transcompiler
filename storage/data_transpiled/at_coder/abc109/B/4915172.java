static final int [ ] [ ] judge ( ) {
  final int N = Integer . parseInt ( input ( ) ) ;
  final int [ ] [ ] judge = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final int W = input ( ) ;
    if ( judge [ i ] [ W ] == 0 ) {
      System . out . println ( "No" ) ;
      System . exit ( 0 ) ;
    }
    else judge [ i ] [ W ] = W ;
  }
  return judge ;
}
