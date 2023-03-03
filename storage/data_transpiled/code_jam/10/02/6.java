public static int gcd ( int a , int b ) {
  return b > 0 ? gcd ( b , a % b ) : a ;
}
int tn = Integer . parseInt ( scanner . nextLine ( ) ) ;
for ( int loop = 0 ;
loop < xrange ( tn ) ;
loop ++ ) {
  String line = scanner . nextLine ( ) ;
  int [ ] d = new int [ line . trim ( ) . split ( " " ) . length ] ;
  for ( int i = 0 ;
  i < d . length ;
  i ++ ) d [ i ] = Integer . parseInt ( line . trim ( ) . split ( " " ) [ 1 ] ) ;
  int g = - 1 ;
  for ( int i : xrange ( d . length ) ) {
    for ( int j : xrange ( i + 1 , d . length ) ) {
      if ( g == - 1 ) g = Math . abs ( d [ i ] - d [ j ] ) ;
      else g = gcd ( g , Math . abs ( d [ i ] - d [ j ] ) ) ;
    }
  }
  int x = ( g - d [ 0 ] % g ) % g ;
  System . out . println ( "Case #" + ( loop + 1 ) + ": " + x ) ;
}
