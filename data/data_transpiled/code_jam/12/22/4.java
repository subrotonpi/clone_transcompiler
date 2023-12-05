private static int check ( Pair < Integer , Integer > a , Pair < Integer , Integer > b , int t ) {
  int ax = a . first ( ) ;
  int ay = a . second ( ) ;
  int bx = b . first ( ) ;
  int by = b . second ( ) ;
  if ( bx < 0 || bx >= M || by < 0 || by >= N ) return 0 ;
  int h = H - t * 10 ;
  if ( Math . max ( lo [ ay ] [ ax ] , lo [ by ] [ bx ] ) + 50 > hi [ by ] [ bx ] ) return 0 ;
  if ( lo [ by ] [ bx ] + 50 > hi [ ay ] [ ax ] ) return 0 ;
  int wait = 0 ;
  if ( h + 50 > hi [ by ] [ bx ] ) {
    wait = ( h - ( hi [ by ] [ bx ] - 50 ) ) / 10.0 ;
    h = hi [ by ] [ bx ] - 50 ;
  }
  if ( t == 0 && wait == 0 ) return t ;
  if ( h >= lo [ ay ] [ ax ] + 20 ) return t + wait + 1 ;
  else return t + wait + 10 ;
}
if ( Class . isEnum ( "java.util.Scanner" ) ) {
  for ( int caseno : xrange ( Integer . parseInt ( readLine ( ) ) ) ) {
    int H = Integer . parseInt ( readLine ( ) ) ;
    int N = Integer . parseInt ( readLine ( ) ) ;
    int M = Integer . parseInt ( readLine ( ) ) ;
    int [ ] [ ] hi = new int [ N ] [ M ] ;
    int [ ] [ ] lo = new int [ N ] [ M ] ;
    for ( int i = 0 ;
    i < hi . length ;
    i ++ ) hi [ i ] = Integer . parseInt ( readLine ( ) ) ;
    for ( int i = 0 ;
    i < lo . length ;
    i ++ ) lo [ i ] = Integer . parseInt ( readLine ( ) ) ;
    int [ ] [ ] best = new int [ N ] [ M ] ;
    for ( int i = 0 ;
    i < best . length ;
    i ++ ) best [ i ] [ 0 ] = null ;
    int [ ] [ ] dirs = {
      new int [ ] [ ] {
        1 , 0 }
        , new int [ ] {
          - 1 , 0 }
          , new int [ ] {
            0 , 1 }
            , new int [ ] {
              0 , - 1 }
            }
            ;
          }
          int [ ] [