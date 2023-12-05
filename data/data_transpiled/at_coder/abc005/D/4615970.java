public static int getSumRect ( int xUL , int yUL , int xDR , int yDR ) {
  int s = d [ xDR ] [ yDR ] ;
  if ( xUL > 0 ) s -= d [ xUL - 1 ] [ yDR ] ;
  if ( yUL > 0 ) s -= d [ xDR ] [ yUL - 1 ] ;
  if ( xUL > 0 && yUL > 0 ) s += d [ xUL - 1 ] [ yUL - 1 ] ;
  return s ;
  /* Get max rect */
  int sMax = 0 ;
  for ( int i = 0 ;
  i < n - x + 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < n - y + 1 ;
    j ++ ) {
      int s = getSumRect ( i , j , i + x - 1 , j + y - 1 ) ;
      if ( s > sMax ) sMax = s ;
    }
  }
  /* Get max rect */
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  d = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) d [ i ] = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) d [ i ] [ 0 ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int q = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] p = new int [ q ] ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) p [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( i != 0 ) d [ i ] [ j ] += d [ i - 1 ] [ j ] ;
    }
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( j != 0 ) d [ i ] [ j ] += d [ i ] [ j - 1 ] ;
    }
  }
  int [ ] dMax = new int [ n * n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    dMax [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < n