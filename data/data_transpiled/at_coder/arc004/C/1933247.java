public static int gcd ( int x , int y ) {
  return y > 0 ? gcd ( y , x % y ) : x ;
}
int [ ] tmp = new int [ input . nextInt ( ) ] ;
for ( int i = 0 ;
i < tmp . length ;
i ++ ) tmp [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
x = tmp [ 0 ] ;
y = tmp [ 1 ] ;
int po = gcd ( x , y ) ;
x = x / po ;
y = y / po ;
int yo = 0 ;
for ( int i = 1 ;
i < 5 ;
i ++ ) {
  int n = ( int ) ( ( int ) ( 2 * x / y ) - 1 + i ) ;
  if ( n % y > 0 ) continue ;
  int si = n * ( n + 1 ) / 2 ;
  int na = x * n / y ;
  int m = si - na ;
  if ( 1 <= m && m <= n ) {
    System . out . println ( n + " " + m ) ;
    yo = 1 ;
  }
}
if ( yo == 0 ) System . out . println ( "Impossible" ) ;
return 0 ;
}
