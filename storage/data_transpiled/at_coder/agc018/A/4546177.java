public static int gcd ( int x , int y ) {
  if ( y == 0 ) {
    return x ;
  }
  else {
    return gcd ( y , x % y ) ;
  }
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  return N ;
}
