public static void main ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  n %= 30 ;
  StringBuilder sb = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < 6 ;
  i ++ ) {
    sb . append ( String . valueOf ( i + 1 ) ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    sb . append ( s . charAt ( i ) ) ;
  }
  System . out . println ( sb ) ;
}
