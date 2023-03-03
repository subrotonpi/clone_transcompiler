public static boolean dfs ( int H , int W ) {
  int [ ] Ss = new int [ H ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) Ss [ i ] = input . nextInt ( ) ;
  /* dfs */
  if ( iR < 0 ) {
    return check ( ) ;
  }
  int iF = flgs . indexOf ( false ) ;
  Rs [ iR ] = iF - offset ;
  flgs [ iF ] = true ;
  boolean ans = false ;
  for ( int iF2 = 0 ;
  iF2 < H ;
  iF2 ++ ) {
    boolean flg = flgs . indexOf ( false ) ;
    if ( ! flg ) {
      Rs [ H - 1 - iR ] = iF2 - offset ;
      flgs [ iF2 ] = true ;
      ans = ans || dfs ( iR - 1 ) ;
      flgs [ iF2 ] = false ;
    }
  }
  flgs [ iF ] = false ;
  return ans ;
  /* check */
  int [ ] Ts = new int [ Rs . length ] ;
  for ( int i = 0 ;
  i < Rs . length ;
  i ++ ) Ts [ i ] = Ss [ i ] ;
  int len = Ts . length ;
  boolean flgCenter ;
  if ( W % 2 ) flgCenter = true ;
  else flgCenter = false ;
  boolean [ ] Used = new boolean [ W ] ;
  for ( int j = 0 ;
  j < len ;
  j ++ ) {
    if ( Used [ j ] ) continue ;
    for ( int j2 = j + 1 ;
    j2 < len ;
    j2 ++ ) {
      if ( ! Used [ j2 ] && Ts [ j2 ] == T2 ) {
        Used [ j2 ] = true ;
        break ;
      }
    }
    else {
      if ( T . length ( ) == len && flgCenter == true ) flgCenter = false ;
      else return false ;
    }
  }
  /* check */
  if ( H % 2 != 0 ) {
    flgs = new boolean [ H + 1 ] ;
    offset = 1 ;
  }
  else {
    flgs = new boolean [ H ] ;
    offset = 0 ;
  }
  int [ ] Rs = new int [ H ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) Rs [ i ] = - 1 ;
  if ( dfs ( ( H - 1 ) / 2 ) ) System . out . println ( "YES" ) ;
  else System . out . println ( "NO" ) ;
  return true ;
}
