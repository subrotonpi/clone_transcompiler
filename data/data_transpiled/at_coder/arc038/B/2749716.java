static final String print ( ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  int H = Integer . parseInt ( input . readLine ( ) ) ;
  int W = Integer . parseInt ( input . readLine ( ) ) ;
  List < String > S = new ArrayList < String > ( ) ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) S . add ( Collections . singletonList ( input . readLine ( ) ) ) ;
  List < Integer > [ ] memo = new List [ W ] ;
  for ( int j = 0 ;
  j < W ;
  j ++ ) {
    memo [ j ] = new Integer [ j ] ;
  }
  /*judge*/
  if ( W >= H || H >= H || S [ H ] . indexOf ( "#" ) == - 1 ) return true ;
  if ( memo [ H ] . indexOf ( "#" ) != - 1 ) return memo [ H ] . indexOf ( "#" ) ;
  return false ;
}
