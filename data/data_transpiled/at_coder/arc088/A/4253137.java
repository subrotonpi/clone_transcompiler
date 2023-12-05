public static void print ( String input ) {
  int a = Integer . parseInt ( input . split ( " " ) [ 0 ] ) ;
  int b = Integer . parseInt ( input . split ( " " ) [ 1 ] ) ;
  int c = 0 ;
  while ( a <= b ) {
    a *= 2 ;
    c ++ ;
  }
  System . out . println ( c ) ;
}
