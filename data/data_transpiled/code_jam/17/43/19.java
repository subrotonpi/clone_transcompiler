@ Sys public static boolean isCompatible ( ZNode in , ZNode out ) {
  int tn = Integer . parseInt ( in . readLine ( ) ) ;
  for ( int ti : xrange ( tn ) ) {
    int r = Integer . parseInt ( in . readLine ( ) ) ;
    int c = Integer . parseInt ( in . readLine ( ) ) ;
    ZNode m [ ] = new ZNode [ r ] ;
    for ( int i = 0 ;
    i < r ;
    i ++ ) {
      m [ i ] = in . readLine ( ) . trim ( ) ;
    }
    Z [ ] [ ] b = new Z [ c ] [ ] ;
    for ( int i = 0 ;
    i < b . length ;
    i ++ ) {
      for ( int j = 0 ;
      j < c ;
      j ++ ) {
        if ( m [ i ] [ j ] == '-' || m [ i ] [ j ] == '|' ) {
          out . print ( mo [ b [ i ] [ j ] ] ? '-' : '|' ) ;
        }
        else {
          out . print ( m [ i ] [ j ] ) ;
        }
      }
    }
    out . println ( ) ;
  }
  return false ;
}
