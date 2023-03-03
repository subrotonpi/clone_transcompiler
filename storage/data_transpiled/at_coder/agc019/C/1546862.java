public static int LIS ( int N , int a ) {
  int res = 0 ;
  int [ ] dp = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < i ;
    j ++ ) {
      if ( XY [ j ] [ 0 ] < XY [ i ] [ 0 ] && XY [ j ] [ 1 ] < XY [ i ] [ 1 ] ) {
        dp [ i ] = Math . max ( dp [ i ] , dp [ j ] + 1 ) ;
      }
    }
    res = Math . max ( res , dp [ i ] ) ;
  }
  final int x1 = Integer . parseInt ( input . nextLine ( ) ) ;
  final int y1 = Integer . parseInt ( input . nextLine ( ) ) ;
  final int x2 = Integer . parseInt ( input . nextLine ( ) ) ;
  final int y2 = Integer . parseInt ( input . nextLine ( ) ) ;
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int W = Math . abs ( x2 - x1 ) ;
  final int H = Math . abs ( y2 - y1 ) ;
  final int xsgn = 2 * ( x2 > x1 ? x1 : x2 ) - 1 ;
  final int ysgn = 2 * ( y2 > y1 ? y1 : y2 ) - 1 ;
  int [ ] [ ] XY = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( ( x - x1 ) * ( x - x2 ) <= 0 && ( y - y1 ) * ( y - y2 ) <= 0 ) {
      XY [ i ] [ 0 ] = xsgn * ( x - x1 ) ;
      XY [ i ] [ 1 ] = ysgn * ( y - y1 ) ;
    }
  }
  N = XY . length ;
  final int short = 20 - 5 * Math . PI ;
  final int long = 10 * Math . PI - 20 ;
  final int straight = 100 * ( W + H ) ;
  @ SuppressWarnings ( "unused" ) int [ ] array = XY ;
  Arrays . sort ( array ) ;
  Arrays . sort ( array ) ;
  int [ ] dp = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    dp [ Arrays . binarySearch ( dp , i ) ] = array