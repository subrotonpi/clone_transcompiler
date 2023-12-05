public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  long mod = 1000000007 ;
  final int xr = Math . ceil ( Math . sqrt ( K ) ) ;
  final int [ ] LIST = new int [ xr + 1 ] ;
  for ( int i = 1 ;
  i <= xr ;
  i ++ ) {
    if ( K % i == 0 ) {
      LIST [ 0 ] = i ;
      LIST [ 1 ] = K / i ;
    }
  }
  Arrays . sort ( LIST ) ;
  final int LEN = LIST . length ;
  final int [ ] [ ] LISTPRIME = new int [ LEN ] [ LEN ] ;
  for ( int i = 0 ;
  i < LEN ;
  i ++ ) {
    LISTPRIME [ i ] [ 1 ] = LIST [ i ] [ 0 ] ;
  }
  for ( int i = 1 ;
  i < LEN ;
  i ++ ) {
    if ( LISTPRIME [ i ] [ 1 ] == 1 ) {
      continue ;
    }
    final int x = LISTPRIME [ i ] [ 0 ] ;
    for ( int j = i + 1 ;
    j < LEN ;
    j ++ ) {
      if ( LISTPRIME [ j ] [ 1 ] == 1 ) {
        continue ;
      }
      else if ( LISTPRIME [ j ] [ 0 ] % x == 0 ) {
        LISTPRIME [ j ] [ 1 ] = 1 ;
      }
    }
  }
  final int [ ] LISTP = new int [ LEN ] ;
  for ( int i = 1 ;
  i < LEN ;
  i ++ ) {
    LISTP [ i ] = LISTPRIME [ i ] [ 0 ] ;
  }
  /* iep */
  final int [ ] XPR = new int [ LEN ] ;
  for ( int i = 0 ;
  i < LISTP . length ;
  i ++ ) {
    final int l = LISTP [ i ] ;
    if ( l <= N && K % l == 0 ) {
      XPR [ i ] = l ;
    }
  }
  final int lpr = XPR . length ;
  long ANS = 0 ;
  for ( int ite = 0 ;
  ite < 2 ;
  ite ++ ) {
    long c = 1 ;
    for ( int j = 0 ;
    j < lpr ;
    j ++ ) {
      c = c * ( XPR [ j ] * ite ) ;
    }
    final long SUM = ( c + c * ( N / c ) ) * ( N / c ) / 2 ;
    ANS = ANS + ( ( - 1 ) * ( sum ( ite ) % 2 )