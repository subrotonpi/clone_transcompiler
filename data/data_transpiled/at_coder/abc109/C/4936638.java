public static int gcd ( int a , int b ) {
  if ( b == 0 ) return a ;
  return gcd ( b , a % b ) ;
}
int N = Integer . parseInt ( input . nextLine ( ) ) ;
int X = Integer . parseInt ( input . nextLine ( ) ) ;
int x = Integer . parseInt ( input . nextLine ( ) ) ;
x = x ;
int g = x > 0 ? x : 0 ;
for ( int xx = 1 ;
xx < x ;
xx ++ ) {
  g = gcd ( g , xx ) ;
}
