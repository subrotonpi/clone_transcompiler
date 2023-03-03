public static int gcd ( int a , int b ) {
  return b == 0 ? a : gcd ( b , a % b ) ;
}
int x = Integer . parseInt ( input . nextLine ( ) ) , y = Integer . parseInt ( input . nextLine ( ) ) ;
int k = gcd ( x , y ) ;
x /= k ;
y /= k ;
boolean flag = false ;
for ( int i = ( 2 * x ) / ( y * y ) - 1 ;
i <= 10000000000000 ;
i ++ ) {
  int n = i * y ;
  int m = ( n * ( n + 1 ) ) / 2 - i * x ;
  if ( ( n <= 0 ) || ( m <= 0 ) ) continue ;
  if ( ( n < m ) ) break ;
  System . out . println ( n + " " + m ) ;
  flag = true ;
}
