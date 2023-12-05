public static void print ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = ( a + 1 ) * ( a + 1 ) ;
  a = a * a ;
  int e = 1 ;
  int n = a ;
  while ( ( a + e - 1 ) / e * e < b ) {
    n = ( a + e - 1 ) / e ;
    e *= 100 ;
  }
  System . out . println ( n ) ;
}
