public static int a , int b , int c ;
int x , y , z ;
if ( a % 2 == 1 || b % 2 == 1 || c % 2 == 1 ) {
  System . out . println ( 0 ) ;
  exit ( ) ;
}
if ( a == b == c ) {
  System . out . println ( - 1 ) ;
  exit ( ) ;
}
cnt = 0 ;
while ( true ) {
  x = ( b + c ) / 2 ;
  y = ( a + c ) / 2 ;
  z = ( a + b ) / 2 ;
  cnt ++ ;
  if ( x % 2 == 1 || y % 2 == 1 || z % 2 == 1 ) break ;
  a = x ;
  b = y ;
  c = z ;
}
System . out . println ( cnt ) ;
return 0 ;
}
