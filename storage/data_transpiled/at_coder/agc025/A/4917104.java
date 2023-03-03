public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  List < Integer > li = new ArrayList < > ( ) ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    li . add ( Integer . valueOf ( Lists . newArrayList ( Integer . valueOf ( String . valueOf ( i ) ) ) ) + Integer . valueOf ( Lists . newArrayList ( Integer . valueOf ( String . valueOf ( n - i ) ) ) ) ) ;
  }
  System . out . println ( Collections . min ( li ) ) ;
}
