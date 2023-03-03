public static String print ( String input ) {
  int h = Integer . parseInt ( input ) ;
  int w = Integer . parseInt ( input ) ;
  String [ ] A = new String [ h ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    A [ i ] = input . split ( " " ) ;
  }
  int flag = 0 ;
  for ( String a : A ) {
    String [ ] X = a . split ( "\\." ) ;
    int cnt = 0 ;
    for ( String s : X ) {
      if ( s . contains ( "#" ) ) {
        cnt ++ ;
      }
    }
    if ( cnt > 1 ) {
      flag = 1 ;
    }
  }
  String ans ;
  if ( flag > 0 ) {
    ans = "Impossible" ;
  }
  else {
    ans = "Possible" ;
    int posi = 0 ;
    for ( int i = 0 ;
    i < h ;
    i ++ ) {
      int [ ] B = new int [ w ] ;
      for ( int j = 0 ;
      j < w ;
      j ++ ) {
        if ( A [ i ] . charAt ( j ) == '#' ) {
          B [ j ] = j ;
        }
      }
      if ( B [ 0 ] > posi || B [ 0 ] < posi ) {
        ans = "Impossible" ;
        break ;
      }
      else {
        posi = B [ B . length - 1 ] ;
      }
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
