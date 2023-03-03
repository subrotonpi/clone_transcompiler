public static long f ( long b , long n ) {
  if ( n < b ) return n ;
  return f ( b , n / b ) + n % b ;
}
n = Long . parseLong ( input . nextLine ( ) ) ;
s = Long . parseLong ( input . nextLine ( ) ) ;
if ( n == s ) {
  System . out . println ( n + 1 ) ;
  exit ( ) ;
}
for ( b = 2 ;
b <= ( int ) ( n * 0.5 ) ;
b ++ ) {
  if ( f ( b , n ) == s ) {
    System . out . println ( b ) ;
    break ;
  }
}
else {
  for ( int p = 1 ;
  p <= ( int ) ( n * 0.5 ) ;
  p -- ) {
    b = n - s + p ;
    long m = b * ( n - p ) ;
    if ( m == 0 && b >= 2 && f ( b , n ) == s ) {
      System . out . println ( b ) ;
      break ;
    }
  }
  else {
    System . out . println ( - 1 ) ;
  }
}
