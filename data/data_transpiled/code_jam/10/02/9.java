static int calcGCD ( int a , int b ) {
  while ( b > 0 ) {
    a = b ;
    b = a % b ;
  }
  return a ;
}