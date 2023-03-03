public static boolean minPoint ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] h = new int [ n ] ;
  int [ ] s = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    h [ i ] = 0 ;
    s [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    h [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    s [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  /* min point */
  int [ ] array = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    array [ i ] = ( array [ i ] - h [ i ] ) / s [ i ] ;
  }
  Arrays . sort ( array ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( array [ i ] < n ) {
      if ( array [ i ] < n ) {
        return false ;
      }
    }
  }
  return true ;
}
