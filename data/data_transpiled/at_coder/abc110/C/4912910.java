public static void main ( String [ ] S ) {
  int [ ] T = new int [ S . length ] ;
  for ( int i = 0 ;
  i < T . length ;
  i ++ ) {
    T [ i ] = i ;
  }
  HashMap < Integer , Integer > judgeS = new HashMap < Integer , Integer > ( ) , judgeT = new HashMap < Integer , Integer > ( ) ;
  int idx = 0 ;
  int ct = 0 ;
  for ( int i = 0 ;
  i < S . length ;
  i ++ ) {
    if ( judgeS . get ( S [ i ] ) != null ) S [ idx ] = judgeS . get ( S [ i ] ) ;
    else {
      S [ idx ] = ct ;
      judgeS . put ( T [ i ] , ct ) ;
      ct ++ ;
    }
    idx ++ ;
  }
  idx = 0 ;
  ct = 0 ;
  for ( int i = 0 ;
  i < T . length ;
  i ++ ) {
    if ( judgeT . get ( T [ i ] ) != null ) T [ idx ] = judgeT . get ( T [ i ] ) ;
    else {
      T [ idx ] = ct ;
      judgeT . put ( T [ i ] , ct ) ;
      ct ++ ;
    }
    idx ++ ;
  }
  if ( S == T ) System . out . println ( "Yes" ) ;
  else System . out . println ( "No" ) ;
}
