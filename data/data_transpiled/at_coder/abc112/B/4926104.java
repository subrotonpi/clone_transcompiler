public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int t = Integer . parseInt ( input ) ;
  ArrayList < Integer > a = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int c = Integer . parseInt ( input ) ;
    int x = Integer . parseInt ( input ) ;
    if ( x <= t ) {
      a . add ( c ) ;
    }
  }
  if ( a . size ( ) > 0 ) {
    System . out . println ( Collections . min ( a ) ) ;
  }
  else {
    System . out . println ( "TLE" ) ;
  }
}
