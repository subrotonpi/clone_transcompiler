public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input ) ;
  }
  int ans = 0 ;
  String flag = "go" ;
  while ( flag . equals ( "go" ) ) {
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( A [ i ] % 2 != 0 ) {
        flag = "stop" ;
        break ;
      }
    }
    if ( flag . equals ( "go" ) ) {
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        A [ i ] = A [ i ] / 2 ;
      }
      ans = ans + 1 ;
    }
  }
  System . out . println ( ans ) ;
}
