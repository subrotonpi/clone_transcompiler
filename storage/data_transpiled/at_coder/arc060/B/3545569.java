static int f ( int b , int n ) {
  if ( n < b ) {
    return n ;
  }
  else {
    return f ( b , n / b ) + ( n % b ) ;
  }
}
