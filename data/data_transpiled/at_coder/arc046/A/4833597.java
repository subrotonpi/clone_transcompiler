public static void main ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  List < Integer > num = new ArrayList < > ( ) ;
  for ( int i = 1 ;
  i <= 555556 ;
  i ++ ) {
    if ( new HashSet < > ( String . valueOf ( i ) ) . size ( ) == 1 ) {
      num . add ( i ) ;
    }
  }
  System . out . println ( num . get ( n - 1 ) ) ;
}
