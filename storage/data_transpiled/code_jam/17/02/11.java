static final String solve ( ) throws IOException {
  System . setIn ( new FileInputStream ( "BL.in" ) ) ;
  System . setOut ( new FileOutputStream ( "BL.out" ) ) ;
  int t = input . nextInt ( ) ;
  {
    int l = input . nextInt ( ) ;
    int w = input . nextInt ( ) * l ;
    if ( w > input . nextInt ( ) ) {
      String ans = "" ;
      if ( input . next ( ) != '1' ) ans += ( char ) ( input . nextInt ( ) - 1 ) ;
      ans += "9" * ( l - 1 ) ;
      return ans ;
    }
    for ( int i = 0 ;
    i < l ;
    i ++ ) {
      w = input . nextInt ( ) + input . nextInt ( ) * ( l - i ) ;
      if ( w > input . nextInt ( ) ) return input . next ( ) + ( char ) ( input . nextInt ( ) - 1 ) + "9" * ( l - i - 1 ) ;
    }
    return input ;
  }
  for ( int tt = 1 ;
  tt <= t ;
  tt ++ ) {
    String s = input . next ( ) ;
    String ans = solve ( s ) ;
    System . out . println ( "Case #" + tt + ": " + ans ) ;
  }
  return ans ;
}
