public static int gcd ( int a , int b ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  while ( b > 0 ) {
    a = b ;
    b = a % b ;
  }
  return a ;
}
