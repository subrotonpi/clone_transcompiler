public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] xycs = new String [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    xycs [ i ] = input . nextLine ( ) ;
  }
  int [ ] [ ] tbl = new int [ k * 2 + 1 ] [ k + 1 ] ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    for ( int j = 0 ;
    j < k ;
    j ++ ) {
      tbl [ i ] [ j ] = 0 ;
    }
  }
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    String sx = xycs [ i ] ;
    String sy = xycs [ i ] ;
    String c = xycs [ i ] ;
    int rx = Integer . parseInt ( sx ) ;
    int ry = Integer . parseInt ( sy ) ;
    int mx = ( rx - 1 ) % ( 2 * k ) , my = ( ry - 1 ) % ( 2 * k ) ;
    int dx = ( mx + isBlack ( c ) * k + ( my < k ? 2 * k : 1 ) ) , dy = my % k ;
    if ( dx < k ) {
      tbl [ 0 ] [ 0 ] ++ ;
      tbl [ 0 ] [ dx + 1 ] -- ;
      tbl [ dy + 1 ] [ 0 ] -- ;
      tbl [ dy + 1 ] [ dx + 1 ] += 2 ;
      tbl [ 0 ] [ dx + 1 + k ] ++ ;
      tbl [ dy + 1 ] [ dx + 1 + k ] -= 2 ;
    }
    else {
      dx = dx % k ;
      tbl [ 0 ] [ dx + 1 ] ++ ;
      tbl [ dy + 1 ] [ 0 ] ++ ;
      tbl [ dy + 1 ] [ dx + 1 + k ] ++ ;
    }
  }
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    for ( int j = 1 ;
    j <= 2 * k ;
    j ++ ) tbl [ i ] [ j ] += tbl [ i - 1 ] [ j ] ;
  }
  System . out . println ( Math . max ( Math . max ( tbl [ 0 ] [ 0 ] , tbl [ 0 ] [ 1 ] ) , 2 * k ) ) ;
}
