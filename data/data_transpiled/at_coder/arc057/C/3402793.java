public static void print ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = a + 1 ;
  a = a * a ;
  b = b * b - 1 ;
  while ( ( a + 99 ) / 100 <= b / 100 ) {
    a = ( a + 99 ) / 100 ;
    b /= 100 ;
  }
  System . out . println ( a ) ;
}
