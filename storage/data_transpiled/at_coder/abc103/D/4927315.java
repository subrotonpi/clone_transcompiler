public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int [ ] [ ] ab = new int [ m ] [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    ab [ i ] [ 1 ] = Integer . parseInt ( input ) ;
  }
  Arrays . sort ( ab ) ;
  int cnt = 0 ;
  int before = 0 ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    if ( cnt >= 1 && ab [ i ] [ 1 ] < before ) {
    }
    else {
      before = ab [ i ] [ 0 ] ;
      cnt ++ ;
    }
  }
  System . out . println ( cnt ) ;
}
