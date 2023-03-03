@ SuppressWarnings ( "unchecked" ) public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input ( ) ) ;
  long r = 0 ;
  long b = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    Counter < String > counts = new Counter < String > ( input ) ;
    r += counts . getCount ( "R" ) ;
    b += counts . getCount ( "B" ) ;
  }
  if ( r > b ) {
    System . out . println ( "TAKAHASHI" ) ;
  }
  else if ( r < b ) {
    System . out . println ( "AOKI" ) ;
  }
  else {
    System . out . println ( "DRAW" ) ;
  }
}
