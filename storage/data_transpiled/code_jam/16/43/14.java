public static void main ( String [ ] args ) {
  int T = input . nextInt ( ) ;
  for ( int t = 1 ;
  t <= T ;
  t ++ ) {
    System . out . println ( "Case #" + t + ":" ) ;
    int R = Integer . parseInt ( input . nextLine ( ) ) ;
    int C = Integer . parseInt ( input . nextLine ( ) ) ;
    int [ ] lovers = Integer . parseInt ( input . nextLine ( ) ) ;
    char [ ] [ ] v = new char [ R + 1 ] [ C + 1 ] ;
    for ( int i = 0 ;
    i < R ;
    i ++ ) v [ i ] [ 0 ] = '/' ;
    for ( int i = 1 ;
    i < C + 1 ;
    i ++ ) {
      if ( ( cs & n ) > 0 ) v [ i ] [ 1 ] = '\\' ;
      else v [ i ] [ 2 ] = '\\' ;
      n <<= 1 ;
    }
    if ( check ( cs ) ) {
      for ( int i = 1 ;
      i < R + 1 ;
      i ++ ) {
        System . out . println ( "" . join ( v [ i ] ) ) ;
      }
      break ;
    }
    else {
      System . out . println ( "IMPOSSIBLE" ) ;
    }
  }
  main ( ) ;
}
