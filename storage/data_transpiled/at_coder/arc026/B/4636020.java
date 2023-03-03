public static int n ( ) {
  int a = - n ;
  for ( int i = 1 ;
  i <= ( int ) ( n * 0.5 ) ;
  i ++ ) {
    if ( n % i == 0 ) a += i + ( n / i ) ;
  }
  if ( n == a ) return a ;
  return a ;
}
