public static int R = Integer . parseInt ( input ) {
  int X = Integer . parseInt ( input . readLine ( ) ) ;
  int Y = Integer . parseInt ( input . readLine ( ) ) ;
  int D = Integer . parseInt ( input . readLine ( ) ) ;
  int L = Integer . parseInt ( input . readLine ( ) ) ;
  /* comb n = r = n */
  int bunbo = 1 , bunsi = 1 ;
  for ( int i = n - r + 1 ;
  i <= n ;
  i ++ ) bunsi *= i ;
  for ( int i = 1 ;
  i <= r ;
  i ++ ) bunbo *= i ;
  /* table = [ 0 for j in range(Y+1) ] */
  for ( int i = 0 ;
  i < X + 1 ;
  i ++ ) {
    table [ i ] [ Y ] = 0 ;
  }
  /* calc the sum */
  if ( X * Y < D + L ) return 0 ;
  else if ( table [ X ] [ Y ] == 0 ) {
    if ( X > 0 ) calc ( X - 1 , Y ) ;
    if ( Y > 0 ) calc ( X , Y - 1 ) ;
    int sum = comb ( X * Y , D + L ) * comb ( D + L , L ) ;
    for ( int i = 0 ;
    i < X ;
    i ++ ) for ( int j = 0 ;
    j < Y ;
    j ++ ) sum -= ( X - i + 1 ) * ( Y - j + 1 ) * table [ i ] [ j ] ;
    table [ X ] [ Y ] = sum ;
    return sum ;
  }
  else return table [ X ] [ Y ] ;
}
