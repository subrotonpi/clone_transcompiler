public static void main ( String input ) {
  int a = Integer . parseInt ( input . split ( " " ) [ 0 ] ) ;
  int b = Integer . parseInt ( input . split ( " " ) [ 1 ] ) ;
  int count = 0 ;
  for ( int i = a ;
  i <= b ;
  i ++ ) {
    if ( String . valueOf ( i ) . equals ( String . valueOf ( i ) . substring ( 0 , i ) ) ) {
      count ++ ;
    }
  }
  System . out . println ( count ) ;
}
