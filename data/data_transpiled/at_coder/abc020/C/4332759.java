static final int [ ] [ ] G ( ) {
  int h = Integer . parseInt ( input . readLine ( ) ) ;
  int w = Integer . parseInt ( input . readLine ( ) ) ;
  int t = Integer . parseInt ( input . readLine ( ) ) ;
  char [ ] [ ] array = new char [ h ] [ w ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    array [ i ] = new char [ w ] ;
  }
  for ( int i = 0 ;
  i < w ;
  i ++ ) {
    array [ i ] [ 0 ] = input . charAt ( i ) ;
  }
  int S = 0 ;
  int G = 0 ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    for ( int j = 0 ;
    j < w ;
    j ++ ) {
      if ( array [ i ] [ j ] == 'S' ) S = ( i , j ) ;
      if ( array [ i ] [ j ] == 'G' ) G = ( i , j ) ;
    }
  }
  return new int [ ] [ ] {
    {
      S }
    }
    ;
  }
  