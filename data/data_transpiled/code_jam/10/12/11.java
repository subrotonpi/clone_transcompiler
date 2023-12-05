public static int read ( ) {
  int D = Integer . parseInt ( readLine ( ) ) ;
  int I = Integer . parseInt ( readLine ( ) ) ;
  int M = Integer . parseInt ( readLine ( ) ) ;
  int nVal = Integer . parseInt ( readLine ( ) ) ;
  int [ ] val = new int [ nVal ] ;
  for ( int i = 0 ;
  i < nVal ;
  i ++ ) {
    val [ i ] = Integer . parseInt ( readLine ( ) ) ;
  }
  /* rec last v */
  if ( idx == val . length ) return 0 ;
  int ret = 1 << 30 ;
  if ( lastV != 256 && Math . abs ( lastV - val [ idx ] ) > M && M != 0 ) {
    int absV = Math . abs ( lastV - val [ idx ] ) ;
    ret = Math . min ( ret , rec ( val [ idx ] , idx + 1 , D , I , M , val , dp ) + Math . max ( 0 , ( absV / M - ( absV % M == 0 ? 0 : 1 ) ) * I ) ) ;
  }
  ret = Math . min ( ret , rec ( lastV , idx + 1 , D , I , M , val , dp ) + D ) ;
  if ( lastV == 256 ) {
    for ( int i = 0 ;
    i <= 256 ;
    i ++ ) {
      ret = Math . min ( ret , rec ( i , idx + 1 , D , I , M , val , dp ) + Math . abs ( val [ idx ] - i ) ) ;
    }
  }
  else {
    for ( int i = 0 ;
    i <= 256 ;
    i ++ ) {
      if ( Math . abs ( lastV - i ) <= M ) {
        ret = Math . min ( ret , rec ( i , idx + 1 , D , I , M , val , dp ) + Math . abs ( val [ idx ] - i ) ) ;
      }
    }
  }
  dp [ lastV ] [ idx ] = ret ;
  return ret ;
}
