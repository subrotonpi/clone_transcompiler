public static int gcd ( int a , int b ) {
  if ( b == 0 ) return a ;
  return gcd ( b , a % b ) ;
}
int N = Integer . parseInt ( input . nextLine ( ) ) ;
int X = Integer . parseInt ( input . nextLine ( ) ) ;
List < Integer > x = new ArrayList < Integer > ( ) ;
x . add ( N ) ;
x . add ( X ) ;
int g = x . get ( 0 ) ;
for ( int xx : x ) {
  g = gcd ( g , xx ) ;
}
