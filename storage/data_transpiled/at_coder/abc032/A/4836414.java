static int gcd ( int a , int b ) {
  final int n ;
  if ( a < b ) {
    a = b ;
    b = a ;
  }
  while ( ( b != 0 ) && ( a % b != 0 ) ) {
    a = b ;
    b = a % b ;
  }
  return a ;
}
