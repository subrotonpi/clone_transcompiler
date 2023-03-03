static final Scanner getScanner ( ) {
  final Scanner in = new Scanner ( System . in ) ;
  final int n = in . nextInt ( ) ;
  final String s = in . nextLine ( ) ;
  final Set < String > g = gb ( s ) ;
  final int l = in . nextInt ( ) ;
  int res = l * ( l - 1 ) / 2 + 1 ;
  for ( final String k : g ) {
    final int p = in . nextInt ( ) ;
    res -= p * ( p - 1 ) / 2 ;
  }
  System . out . println ( res ) ;
  return in ;
}
