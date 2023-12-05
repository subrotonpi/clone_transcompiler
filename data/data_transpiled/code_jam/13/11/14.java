static Scanner scan ( String input ) throws FileNotFoundException {
  Scanner in = new Scanner ( new File ( input ) ) ;
  int t = Integer . parseInt ( in . nextLine ( ) ) ;
  for ( int i = 1 ;
  i <= t ;
  i ++ ) {
    String r = in . nextLine ( ) ;
    t = in . nextInt ( ) ;
    r = Integer . parseInt ( r ) ;
    t = in . nextInt ( ) ;
    t -= 2 * r + 1 ;
    int L = 0 ;
    int R = t ;
    while ( L < R ) {
      int m = ( L + R + 1 ) / 2 ;
      if ( t >= m * ( 2 * m + 2 * r + 3 ) ) L = m ;
      else R = m - 1 ;
    }
    System . out . printf ( "Case #%d: %d%n" , i , L + 1 ) ;
  }
  return new Scanner ( in ) ;
}
