static final Scanner inf = new Scanner ( System . in ) {
  final PrintWriter ouf = new PrintWriter ( System . out ) ;
  /* Close files */
  inf . close ( ) ;
  ouf . close ( ) ;
  /* Precount */
  int printcounter = 0 ;
  /* Print the String */
  printcounter ++ ;
  /* Case #*/
  ouf . println ( "Case #" + printcounter + ": " + a ) ;
  /* Solve the test */
  String [ ] in = inf . nextLine ( ) . split ( " " ) ;
  Arrays . sort ( in ) ;
  int [ ] a = new int [ n ] ;
  int f = 0 ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    a [ i ] = a [ i ] ;
  }
  return ouf ;
}
