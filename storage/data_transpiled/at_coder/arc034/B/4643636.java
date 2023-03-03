public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  ArrayList < Integer > d = new ArrayList < > ( ) ;
  for ( int i = Math . max ( 0 , n - 153 ) ;
  i <= n ;
  i ++ ) {
    if ( n == i + Integer . parseInt ( String . valueOf ( i ) ) ) {
      d . add ( i ) ;
    }
  }
  System . out . println ( d . size ( ) ) ;
  for ( int i : d ) {
    System . out . println ( i ) ;
  }
}
