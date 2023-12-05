public static void main ( String input ) {
  for ( int ti = 1 ;
  ti <= Integer . parseInt ( input ) ;
  ti ++ ) {
    int n = Integer . parseInt ( input . substring ( 0 , ti ) ) ;
    int p = Integer . parseInt ( input . substring ( ti , ti + 1 ) ) ;
    int q = Integer . parseInt ( input . substring ( ti + 1 , ti + 1 ) ) ;
    int r = Integer . parseInt ( input . substring ( ti + 1 , ti + 1 ) ) ;
    int s = Integer . parseInt ( input . substring ( ti + 1 , ti + 1 ) ) ;
    int [ ] dev = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) dev [ i ] = ( i * p + q ) % r + s ;
    int tot = Arrays . stream ( dev ) . mapToInt ( i -> i * p + q ) . sum ( ) ;
    int i = 0 ;
    int j = n - 1 ;
    int ltot = 0 ;
    int mtot = tot ;
    int rtot = 0 ;
    int best = 0 ;
    while ( ltot < mtot > rtot ) {
      if ( ltot + dev [ i ] < rtot + dev [ j ] ) {
        ltot += dev [ i ] ;
        mtot -= dev [ i ] ;
        i ++ ;
        best = Math . max ( best , tot - Math . max ( ltot , mtot , rtot ) ) ;
      }
      else {
        rtot += dev [ j ] ;
        mtot -= dev [ j ] ;
        j -- ;
        best = Math . max ( best , tot - Math . max ( ltot , mtot , rtot ) ) ;
      }
    }
    System . out . println ( "Case #" + ti + ":" + ( best / tot ) ) ;
  }
}
