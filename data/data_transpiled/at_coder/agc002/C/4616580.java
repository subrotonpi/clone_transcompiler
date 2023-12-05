public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int L = Integer . parseInt ( input ) ;
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  String judge = "Impossible" ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    int x = a [ i ] + a [ i + 1 ] ;
    if ( x >= L ) {
      judge = "Possible" ;
      c = i + 1 ;
      break ;
    }
  }
  if ( judge . equals ( "Impossible" ) ) {
    System . out . println ( judge ) ;
  }
  else {
    System . out . println ( judge ) ;
    for ( int i = 1 ;
    i < c ;
    i ++ ) {
      System . out . println ( i ) ;
    }
    for ( int i = 0 ;
    i < N - c - 1 ;
    i ++ ) {
      System . out . println ( N - 1 - i ) ;
    }
    System . out . println ( c ) ;
  }
}
