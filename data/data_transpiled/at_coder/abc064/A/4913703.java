public static int [ ] [ ] [ ] [ ] r = new int [ 3 ] [ 3 ] [ 3 ] [ 3 ] ;
int g = Integer . parseInt ( input [ 0 ] [ 0 ] ) ;
int b = Integer . parseInt ( input [ 1 ] [ 0 ] ) ;
int x = 10 * g + b ;
if ( ( x % 4 ) == 0 ) {
  System . out . println ( "YES" ) ;
}
else {
  System . out . println ( "NO" ) ;
}
return [ ] [ x ] ;
}
