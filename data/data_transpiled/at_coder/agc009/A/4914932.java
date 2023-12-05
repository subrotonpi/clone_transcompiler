public static void print ( int n ) {
  int cnt = 0 ;
  List < Integer > a = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  Collections . reverse ( a ) ;
  cnt = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ( ( a . get ( i ) . intValue ( ) + cnt ) % a . get ( i ) . intValue ( ) != 0 ) ) {
      cnt += a . get ( i ) . intValue ( ) - ( ( a . get ( i ) . intValue ( ) + cnt ) % a . get ( i ) . intValue ( ) ) ;
    }
  }
  System . out . println ( cnt ) ;
}
