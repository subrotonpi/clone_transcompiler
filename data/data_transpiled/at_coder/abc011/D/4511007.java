@ VisibleForTesting static double comb ( int n , int k ) {
  if ( n < 0 || k < 0 || n < k ) return 0 ;
  if ( n == 0 || k == 0 ) return 1 ;
  double a = factorial ( n ) ;
  double b = factorial ( k ) ;
  double c = factorial ( n - k ) ;
  return ( a / ( b * c ) ) ;
}
final int n = Integer . parseInt ( input . nextLine ( ) ) ;
final int d = Integer . parseInt ( input . nextLine ( ) ) ;
int x = Integer . parseInt ( input . nextLine ( ) ) ;
int y = Integer . parseInt ( input . nextLine ( ) ) ;
x = Math . abs ( x ) ;
y = Math . abs ( y ) ;
double ansn = n ;
if ( x % d == 0 && y % d == 0 ) {
  final int ax = x / d ;
  final int ay = y / d ;
  double ansb = 0 ;
  int nb = n - ax - ay ;
  if ( nb % 2 == 0 ) {
    nb = nb / 2 ;
    for ( int i = 0 ;
    i < nb + 1 ;
    i ++ ) {
      final double ans = Math . exp ( Math . log ( comb ( n , i + ax ) ) + Math . log ( comb ( n - i - ax , i ) ) + Math . log ( comb ( n - 2 * i - ax , ay + nb - i ) ) - n * Math . log ( 4 ) ) ;
      ansb += ans ;
    }
    System . out . println ( ansb ) ;
  }
  else {
    System . out . println ( 0 ) ;
  }
}
