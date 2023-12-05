public static int gcd ( int a , int b ) {
  if ( b == 0 ) return a ;
  return gcd ( b , a % b ) ;
}
int N = Integer . parseInt ( input . nextLine ( ) ) ;
int K = Integer . parseInt ( input . nextLine ( ) ) ;
int max = Integer . parseInt ( input . nextLine ( ) ) ;
int g = a [ 0 ] ;
for ( int i = 1 ;
i < max ;
i ++ ) {
  int aa = a [ i ] ;
  g = gcd ( g , aa ) ;
}
int d = ( max - a ) - K ;
if ( d >= 0 ) {
  if ( d % g == 0 ) System . out . println ( "POSSIBLE" ) ;
  else System . out . println ( "IMPOSSIBLE" ) ;
}
else System . out . println ( "IMPOSSIBLE" ) ;
return 0 ;
}
