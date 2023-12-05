public static int nwd ( int a , int b ) {
  if ( b == 0 ) {
    return a ;
  }
  return nwd ( b , a % b ) ;
}
int z = Integer . parseInt ( scanner . nextLine ( ) ) ;
for ( int q = 0 ;
q < z ;
q ++ ) {
  String [ ] s = scanner . nextLine ( ) . split ( " " ) ;
  int n = Integer . parseInt ( s [ 0 ] ) ;
  int [ ] tab = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    tab [ i ] = Integer . parseInt ( s [ i + 1 ] ) ;
  }
  Arrays . sort ( tab ) ;
  int d = tab [ 1 ] - tab [ 0 ] ;
  for ( int i = 0 ;
  i < n - 2 ;
  i ++ ) {
    d = nwd ( d , tab [ i + 2 ] - tab [ i + 1 ] ) ;
  }
  int res = ( d - tab [ 0 ] % d ) % d ;
  System . out . println ( "Case #" + ( q + 1 ) + ": " + res ) ;
}
