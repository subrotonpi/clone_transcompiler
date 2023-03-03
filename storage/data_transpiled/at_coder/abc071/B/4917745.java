static final Scanner getScanner ( ) {
  final Scanner ns = new Scanner ( System . in ) ;
  final NumberReader ni = new NumberReader ( ns ) ;
  final NumberReader nm = new NumberReader ( ni ) ;
  final NumberReader nl = new NumberReader ( nm ) ;
  final String s = ns . next ( ) ;
  for ( int i = 0 ;
  i < 26 ;
  i ++ ) {
    if ( ! s . contains ( ( char ) ( i + 'a' ) ) ) {
      System . out . println ( ( char ) ( i + 'a' ) ) ;
      exit ( ) ;
    }
  }
  System . out . println ( "None" ) ;
  return null ;
}
