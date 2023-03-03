public static void print ( ) {
  int n = input ( ) ;
  int a = n / 10 * 100 ;
  int b = ( n % 10 ) * 15 ;
  b = min ( b , 100 ) ;
  print ( a + b ) ;
}
