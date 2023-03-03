public static int getNumberOfDigits ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = n / 8 ;
  int b = ( n - a ) / 4 ;
  int c = ( n - a - b ) / 2 ;
  int d = ( n - a - b ) % 2 ;
  return d ;
}
