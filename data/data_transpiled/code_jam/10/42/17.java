private static int calc ( String M , String [ ] [ ] cost ) {
  if ( cost . length == 1 ) {
    if ( min ( M ) > 0 ) {
      return 0 ;
    }
    else {
      return cost [ 0 ] [ 0 ] ;
    }
  }
  String LM = M . substring ( 0 , M . length ( ) / 2 ) , RM = M . substring ( M . length ( ) / 2 ) ;
  String [ ] Lcost = new String [ cost . length ] , Rcost = new String [ cost . length ] ;
  for ( int i = cost . length - 1 ;
  i >= 0 ;
  i -- ) {
    String cst = cost [ i ] [ 0 ] ;
    Lcost [ i ] = cst . substring ( 0 , cst . length ( ) / 2 ) ;
    Rcost [ i ] = cst . substring ( cst . length ( ) / 2 ) ;
  }
  int val2 = cost [ cost . length - 1 ] [ 0 ] + calc ( LM , Lcost ) + calc ( RM , Rcost ) ;
  int val1 = 9999999999 ;
  if ( min ( M ) > 0 ) {
    M = CollectionUtils . toArray ( ( String [ ] ) new String [ 0 ] ) ;
    LM = M . substring ( 0 , M . length ( ) / 2 ) ;
    RM = M . substring ( M . length ( ) / 2 ) ;
    val1 = calc ( LM , Lcost ) + calc ( RM , Rcost ) ;
  }
  return Math . min ( val1 , val2 ) ;
}
int T = Integer . parseInt ( scanner . nextLine ( ) ) ;
for ( int c = 0 ;
c < T ;
c ++ ) {
  int P = Integer . parseInt ( scanner . nextLine ( ) ) ;
  M = CollectionUtils . toArray ( M , new String [ 0 ] ) ;
  cost = new int [ P ] ;
  for ( int p = 0 ;
  p < P ;
  p ++ ) {
    int v = Integer . parseInt ( scanner . nextLine ( ) ) ;
    cost [ p ] = v ;
  }
  System . out . println ( "Case #" + ( c + 1 ) + ": " + calc ( M , cost ) ) ;
}
