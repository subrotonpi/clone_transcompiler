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
    memo [ j ] = null ;
  }
  /*judge*/
  if ( W >= H || S [ H ] . length ( ) >= H || S [ H ] [ W ] . length ( ) ) return "#" ;
  if ( memo [ H ] . length ( ) != 0 ) return "" ;
  boolean result = false ;
  if ( ! judge ( 0 , 0 ) ) result = true ;
  if ( ! judge ( 1 , 0 ) ) result = true ;
  memo [ H ] . set ( 0 , 0 ) ;
  return result ;
}
