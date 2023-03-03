public static int a , int b , int c , int d ;
int i ;
a = Integer . parseInt ( input . readLine ( ) ) ;
b = Integer . parseInt ( input . readLine ( ) ) ;
c = Integer . parseInt ( input . readLine ( ) ) ;
d = Integer . parseInt ( input . readLine ( ) ) ;
if ( a <= c && c <= b ) {
  if ( b < d ) {
    System . out . println ( b - c ) ;
  }
  else {
    System . out . println ( d - c ) ;
  }
}
else if ( c <= a && a <= d ) {
  if ( b < d ) {
    System . out . println ( b - a ) ;
  }
  else {
    System . out . println ( d - a ) ;
  }
}
else {
  System . out . println ( 0 ) ;
}
return i ;
}
