public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int a = 2025 - n ;
  List < Integer > l = new ArrayList < Integer > ( ) ;
  for ( int i = 1 ;
  i <= 10 ;
  i ++ ) {
    if ( a % i == 0 ) {
      if ( a / i < 10 ) {
        l . add ( a / i ) ;
      }
    }
  }
  for ( int j : l ) {
    System . out . println ( String . valueOf ( Math . round ( a / j ) ) + " x " + String . valueOf ( Math . round ( j ) ) ) ;
  }
}
