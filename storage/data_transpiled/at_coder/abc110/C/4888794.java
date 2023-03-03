public static void input ( Scanner s ) {
  Scanner t = new Scanner ( System . in ) ;
  int [ ] s_c = new int [ s . nextInt ( ) ] ;
  int [ ] t_c = new int [ t . nextInt ( ) ] ;
  for ( char c : "abcdefghijklmnopqrstuvwxyz" . toCharArray ( ) ) {
    s_c [ 0 ] = s . nextInt ( ) ;
    t_c [ 0 ] = t . nextInt ( ) ;
  }
  Arrays . sort ( s_c ) ;
  Arrays . sort ( t_c ) ;
  if ( s_c == t_c ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
