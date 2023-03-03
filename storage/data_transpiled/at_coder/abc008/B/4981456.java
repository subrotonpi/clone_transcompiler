public static void print ( int n ) {
  int max = Integer . parseInt ( input ( ) ) ;
  Map < String , Integer > map = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String s = String . valueOf ( input ( ) ) ;
    if ( ! s . equals ( "" ) ) {
      map . put ( s , 1 ) ;
    }
    else {
      map . put ( s , 1 ) ;
    }
  }
  System . out . println ( max ) ;
}
