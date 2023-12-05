public static long digitSum ( long n , long b ) {
  if ( n < b ) {
    return n ;
  }
  else {
    return digitSum ( n / b , b ) + n % b ;
  }
}
n = Long . parseLong ( input . nextLine ( ) ) ;
s = Long . parseLong ( input . nextLine ( ) ) ;
final double inf = Double . POSITIVE_INFINITY ;
long ans = inf ;
for ( long i = 2 ;
i <= ( long ) ( n * ( 1 / 2 ) ) ;
i += 2 ) {
  if ( digitSum ( n , i ) == s ) {
    ans = i ;
    break ;
  }
}
if ( n == s ) {
  ans = n + 1 ;
}
else {
  for ( long i = 1 ;
  i <= ( long ) ( n * ( 1 / 2 ) ) ;
  i ++ ) {
    if ( i * i - i >= n - s ) break ;
    if ( ( n - s ) % i == 0 ) {
      if ( s - i >= ( n - s ) / i + 1 || i > s ) continue ;
      ans = Math . min ( ans , ( ( n - s ) / i ) + 1 ) ;
    }
  }
}
if ( ans == inf ) {
  System . out . println ( - 1 ) ;
}
else {
  System . out . println ( ( int ) ans ) ;
}
return ans ;
}
