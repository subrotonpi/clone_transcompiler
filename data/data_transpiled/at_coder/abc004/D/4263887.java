public static int [ ] [ ] count ( int r , int g , int b ) {
  int remaining = Integer . parseInt ( input . nextLine ( ) ) ;
  int place = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( remaining == 0 ) {
    return 0 ;
  }
  else if ( 0 < remaining && remaining <= b ) {
    return Math . abs ( place - 600 ) ;
  }
  else if ( b < remaining && remaining <= b + g ) {
    return Math . abs ( place - 500 ) ;
  }
  else if ( b + g < remaining && remaining <= b + g + r ) {
    return Math . abs ( place - 400 ) ;
  }
  int [ ] [ ] dp = new int [ r + g + b + 1 ] [ 1000 ] ;
  for ( int i = 0 ;
  i < 1000 ;
  i ++ ) {
    dp [ i ] [ 0 ] = dp [ i - 1 ] [ 0 ] ;
  }
  dp [ 0 ] [ r + g + b - 1 ] = count ( r + g + b , 0 ) ;
  for ( int i = 1 ;
  i < 1000 ;
  i ++ ) {
    if ( dp [ i - 1 ] [ 0 ] != 10 * 8 ) {
      dp [ i ] [ 0 ] = dp [ i ] [ 0 ] ;
    }
    for ( int j = 1 ;
    j <= r + g + b ;
    j ++ ) {
      dp [ i ] [ j ] = Math . min ( dp [ i - 1 ] [ j ] + count ( j , i ) , dp [ i ] [ j - 1 ] ) ;
    }
  }
  System . out . println ( dp [ 999 ] [ 0 ] ) ;
  return dp ;
}
