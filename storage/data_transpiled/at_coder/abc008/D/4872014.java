public static int calc ( int i , int j , int k , int l ) {
  if ( ( i < 0 ) && ( j < 0 ) && ( k < 0 ) && ( l < 0 ) ) {
    return memo . get ( new Integer ( i ) ) ;
  }
  int res = 0 ;
  for ( int i = 0 ;
  i < M . length ;
  i ++ ) {
    int X = M [ i ] ;
    int Y = M [ i ] ;
    if ( i < X && k <= Y && j < Y && l <= 0 ) {
      int tmp = ( k - i ) + ( l - j ) - 1 ;
      tmp += calc ( i , j , X - 1 , Y - 1 ) ;
      tmp += calc ( i , Y , X - 1 , l ) ;
      res = Math . max ( res , tmp ) ;
    }
  }
  memo . put ( new Integer ( i ) , res ) ;
  return res ;
}
