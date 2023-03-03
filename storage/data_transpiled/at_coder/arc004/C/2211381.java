public static int gcd ( int x , int y ) {
  return y > 0 ? gcd ( y , x % y ) : x ;
}
int X = Integer . parseInt ( input . nextLine ( ) ) ;
int Y = Integer . parseInt ( input . nextLine ( ) ) ;
int g = gcd ( X , Y ) ;
X = X / g ;
Y = Y / g ;
int N = 0 ;
int M = 0 ;
boolean found = false ;
for ( int i = 1 ;
i <= 5 ;
i ++ ) {
  N = ( int ) ( ( int ) ( 2 * X / Y ) - 1 + i ) ;
  if ( N % Y > 0 ) continue ;
  int si = N * ( N + 1 ) / 2 ;
  int na = X * N / Y ;
  M = si - na ;
  if ( 1 <= M && M <= N ) {
    System . out . println ( N + " " + M ) ;
    found = true ;
  }
}
if ( found == false ) System . out . println ( "Impossible" ) ;
return 0 ;
}
