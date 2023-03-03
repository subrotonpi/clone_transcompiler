public static int a , int b , int c ;
int [ ] numberArray = {
  a , b , c }
  ;
  numberArray [ 0 ] = a ;
  numberArray [ 1 ] = b ;
  numberArray [ 2 ] = c ;
  Arrays . sort ( numberArray ) ;
  if ( ( numberArray [ 0 ] == 5 ) && ( numberArray [ 1 ] == 5 ) && ( numberArray [ 2 ] == 7 ) ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
  return numberArray [ 0 ] ;
}
