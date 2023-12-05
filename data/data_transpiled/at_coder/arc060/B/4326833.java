static final int n = Integer . parseInt ( input ) ;
int s = Integer . parseInt ( input ) ;
if ( n == s ) {
  System . out . println ( n + 1 ) ;
  quit ( ) ;
}
{
  int b = s ;
  int ret = 0 ;
  while ( n > 0 ) {
    ret += n % b ;
    n = n / b ;
  }
  return ret ;
}
for ( int i = 2 ;
i < ( int ) Math . sqrt ( n ) + 2 ;
i ++ ) {
  int t = s - i ;
  if ( s == t ) {
    System . out . println ( i ) ;
    quit ( ) ;
  }
}
int ans = 10 * 18 ;
for ( int x = 1 ;
x < ( int ) Math . sqrt ( n ) ;
x ++ ) {
  int y = s - x ;
  int b = ( n - s ) / x + 1 ;
  if ( x < b && y < b && f ( b , n ) == s ) ans = Math . min ( ans , b ) ;
}
if ( ans == 10 * 18 ) ans = - 1 ;
System . out . println ( ans ) ;
return ans ;
}
