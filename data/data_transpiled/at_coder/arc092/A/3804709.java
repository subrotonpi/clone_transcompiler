@ Iipt public static int iipt ( ) {
  int i = Integer . parseInt ( input ( ) ) ;
  int miipt = Integer . parseInt ( input ( ) ) ;
  int n = iipt ( ) ;
  int [ ] r = new int [ n ] ;
  int [ ] b = new int [ n ] ;
  for ( i = 0 ;
  i < n ;
  i ++ ) {
    r [ i ] = miipt ( ) ;
  }
  for ( i = 0 ;
  i < n ;
  i ++ ) {
    b [ i ] = miipt ( ) ;
  }
  Arrays . sort ( r , new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer xb , Integer yb ) {
      return ( xb < yb ) ? - 1 : 1 ;
    }
  }
  ) ;
  int c = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int xb = ( i + 1 ) ;
    int yb = ( i + 1 ) ;
    if ( xr < xb && yr < yb ) {
      r [ i ] = ( 212 ) ;
      c ++ ;
      break ;
    }
  }
  System . out . println ( c ) ;
  return c ;
}
