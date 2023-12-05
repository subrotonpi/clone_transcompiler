public static void print ( String input ) {
  int a = Integer . parseInt ( input . split ( "\\s+" ) [ 0 ] ) ;
  int b = Integer . parseInt ( input . split ( "\\s+" ) [ 1 ] ) ;
  int count = 0 ;
  while ( a <= b ) {
    count ++ ;
    a *= 2 ;
  }
  System . out . println ( count ) ;
}
