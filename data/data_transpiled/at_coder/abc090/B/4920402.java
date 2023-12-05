public static void print ( String input ) {
  int a = Integer . parseInt ( input . split ( " " ) [ 0 ] ) ;
  int b = Integer . parseInt ( input . split ( " " ) [ 1 ] ) ;
  int ans = 0 ;
  for ( int i = a ;
  i <= b ;
  i ++ ) {
    if ( String . valueOf ( i ) . equals ( String . valueOf ( i ) . substring ( 0 , i ) ) ) {
      ans ++ ;
    }
  }
  System . out . println ( ans ) ;
}
