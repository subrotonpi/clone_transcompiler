public static int func ( int r , int c , int k , String [ ] s ) {
  int [ ] [ ] table = new int [ c ] [ r ] ;
  int [ ] [ ] total = new int [ c ] [ r ] ;
  for ( int i = 0 ;
  i < r ;
  i ++ ) {
    for ( int j = 0 ;
    j < c ;
    j ++ ) {
      if ( s [ i ] . charAt ( j ) == 'o' ) {
        table [ i ] [ j ] [ 0 ] = 1 ;
        table [ i ] [ j ] [ 1 ] = 1 ;
      }
      if ( i > 0 && j > 0 ) {
        table [ i ] [ j ] [ 0 ] += table [ i - 1 ] [ j - 1 ] [ 0 ] ;
      }
      if ( i > 0 && j < s [ 0 ] . length ( ) - 1 ) {
        table [ i ] [ j ] [ 1 ] += table [ i - 1 ] [ j + 1 ] [ 1 ] ;
      }
    }
  }
  int _sum = 0 ;
  for ( int i = 0 ;
  i < r ;
  i ++ ) {
    for ( int j = 0 ;
    j < c ;
    j ++ ) {
      if ( Math . abs ( k - 1 - i ) + Math . abs ( k - 1 - j ) < k && s [ i ] . charAt ( j ) == 'o' ) {
        _sum ++ ;
      }
    }
  }
  total [ k - 1 ] [ k - 1 ] = _sum ;
  int count = 0 ;
  if ( _sum == 2 * ( k * k ) - 2 * k + 1 ) {
    count ++ ;
  }
  for ( int i = k - 1 ;
  i < r - ( k - 1 ) ;
  i ++ ) {
    if ( k - 1 < i ) {
      _sum = total [ i - 1 ] [ k - 1 ] ;
      _sum += table [ i + ( k - 1 ) ] [ k - 1 ] [ 0 ] - table [ i ] [ 0 ] [ 0 ] ;
      if ( s [ i ] . charAt ( 0 ) == 'o' ) {
        _sum ++ ;
      }
      _sum += table [ i + ( k - 1 ) ] [ k - 1 ] [ 1 ] - table [ i ] [ 2 * ( k - 1 ) ] [ 1 ] ;
      if ( s [ i ] . charAt ( 2 * ( k - 1 ) ) == 'o' ) {
        _sum ++ ;
      }
      