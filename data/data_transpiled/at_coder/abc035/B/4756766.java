public static int input ( ) {
  int S = input ( ) ;
  int T = Integer . parseInt ( input ( ) ) ;
  int x = 0 , y = 0 , count = 0 ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    switch ( S . charAt ( i ) ) {
      case 'L' : x -- ;
      break ;
      case 'R' : x ++ ;
      break ;
      case 'U' : y ++ ;
      break ;
      case 'D' : y -- ;
      break ;
      default : count ++ ;
    }
  }
  int d = Math . abs ( x ) + Math . abs ( y ) ;
  int ans ;
  if ( T == 1 ) {
    d += count ;
    ans = d ;
  }
  else {
    int [ ] tmp = new int [ count / 2 + 1 ] ;
    int [ ] dtmp = new int [ count ] ;
    for ( int i = 0 ;
    i < tmp . length ;
    i ++ ) {
      tmp [ i ] = count - 2 * i ;
    }
    for ( int i = 0 ;
    i < tmp . length ;
    i ++ ) {
      dtmp [ i ] = Math . abs ( d - tmp [ i ] ) ;
    }
    ans = Math . min ( dtmp , 0 ) ;
  }
  return ans ;
}
