public static int a , int b , int c ;
/* while (b != 0) {
a = b;
b = a % b;
}*/
while ( b > 0 ) {
  a = b ;
  b = a % b ;
}
if ( c == 0 ) {
  System . out . println ( "YES" ) ;
}
else if ( c % gcd ( a , b ) == 0 && c != 0 ) {
  System . out . println ( "YES" ) ;
}
else {
  System . out . println ( "NO" ) ;
}
return a ;
}
