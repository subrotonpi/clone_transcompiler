public static int cheat ( List < Double > naomi , List < Double > ken ) throws IOException {
  int nscore = 0 ;
  Collections . sort ( naomi ) ;
  Collections . sort ( ken ) ;
  while ( naomi . size ( ) > 0 ) {
    while ( ken . size ( ) > 0 && ( ken . get ( ken . size ( ) - 1 ) > naomi . get ( ken . size ( ) - 1 ) || naomi . get ( 0 ) < ken . get ( 0 ) ) ) {
      if ( ken . get ( ken . size ( ) - 1 ) > naomi . get ( ken . size ( ) - 1 ) ) {
        ken . remove ( ken . size ( ) - 1 ) ;
        naomi . remove ( 0 ) ;
      }
      if ( ken . size ( ) > 0 && naomi . get ( 0 ) < ken . get ( 0 ) ) {
        naomi . remove ( 0 ) ;
        ken . remove ( ken . size ( ) - 1 ) ;
        nscore ++ ;
      }
    }
    return nscore ;
  }
  /* fair */
  int nscore = 0 ;
  Collections . sort ( naomi ) ;
  Collections . sort ( ken ) ;
  while ( naomi . size ( ) > 0 ) {
    double nplay = naomi . get ( 0 ) ;
    for ( int x = 0 ;
    x < ken . size ( ) ;
    x ++ ) {
      if ( ken . get ( x ) > nplay ) {
        ken . remove ( x ) ;
        break ;
      }
    }
    if ( ken . size ( ) != naomi . size ( ) ) {
      ken . remove ( 0 ) ;
      nscore ++ ;
    }
  }
  BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  String [ ] data = br . readLine ( ) . split ( "\n" ) ;
  int length = Integer . parseInt ( data [ 0 ] ) ;
  for ( int x = 0 ;
  x < length ;
  x ++ ) {
    List < Double > naomi = CollectionUtils . asArrayList ( data [ 2 + 3 * x ] . split ( "\\s+" ) ) ;
    List < Double > ken = CollectionUtils . asArrayList ( data [ 3 + 3 * x ] . split ( "\\s+" ) ) ;
    List < Double > n = Lists . newArrayList ( naomi ) ;
    List < Double > k = Lists . newArrayList ( ken ) ;
    System . out . println (