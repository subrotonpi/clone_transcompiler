public static int kaidan ( int n ) {
  return ( n * ( n - 1 ) ) / 2 ;
  int hoge ;
  /* move */
  _l = Math . abs ( l ) ;
  _r = Math . abs ( r ) ;
  if ( r < 0 ) hoge = kaidan ( _l + 1 ) - kaidan ( _r ) ;
  else if ( 0 < l ) hoge = kaidan ( _r + 1 ) - kaidan ( _l ) ;
  else hoge = kaidan ( _r + 1 ) + kaidan ( _l + 1 ) ;
  /* lr move */
  if ( isOver ) l = half ;
  else l = wall ;
  r = l + num ;
  if ( l > r ) return move ( r , l ) ;
  else return move ( l , r ) ;
  /* print out */
  if ( getClass ( ) . equals ( "java.util.Scanner" ) ) {
    final int MAX_NUM = 500 ;
    int R = Integer . parseInt ( input ( ) ) ;
    int G = Integer . parseInt ( input ( ) ) ;
    int B = Integer . parseInt ( input ( ) ) ;
    int [ ] ans = new int [ MAX_NUM * 2 ] ;
    for ( int i = 0 ;
    i < ans . length ;
    i ++ ) ans [ i ] = 0 ;
    int B_half = ( ( B - 1 ) / 2 ) ;
    int R_half = ( ( R - 1 ) / 2 ) ;
    int _B = B - 1 ;
    int _R = R - 1 ;
    for ( int g = - MAX_NUM ;
    g <= MAX_NUM ;
    g ++ ) {
      int gl = g ;
      int gr = g + G - 1 ;
      ans [ g ] = Integer . parseInt ( input ( ) ) ;
    }
    ans [ i ] = Math . pow ( ( move ( gl , gr ) ) , ( lr ( _B , - B_half , gr - 99 , - B_half >= gr - 99 ) ) , ( lr ( - _R , R_half , gl + 99 , R_half <= gl + 99 ) ) ) ;
  }
  System . out . println ( min ( ans ) ) ;
  return 0 ;
}
