public static int gcd ( int x , int y ) {
  int a , b , c , d ;
  int g ;
  int i ;
  a = input . nextInt ( ) ;
  b = input . nextInt ( ) ;
  c = input . nextInt ( ) ;
  d = input . nextInt ( ) ;
  g = input . nextInt ( ) ;
  if ( a < b || b > d || b - g + ( a % g ) > c ) System . out . println ( "No" ) ;
  else System . out . println ( "Yes" ) ;
}
