public static void main ( String input ) {
  int a = Integer . parseInt ( input ) ;
  int b = a + 1 ;
  a = a * a ;
  b = b * b ;
  int k = 1 ;
  while ( ( ( a + k - 1 ) / k * k < b ) && ( ( a + k - 1 ) / k * k < b ) ) {
    int n = ( a + k - 1 ) / k ;
    k *= 100 ;
  }
  System . out . println ( n ) ;
}
