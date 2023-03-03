public static void print ( String w ) {
  int [ ] w = new int [ input . length ( ) ] ;
  int [ ] wDtos = new int [ w . length ] ;
  for ( int i = 0 ;
  i < w . length ;
  i ++ ) {
    if ( w [ i ] != 0 ) {
      wDtos [ w [ i ] ] ++ ;
    }
    else {
      wDtos [ w [ i ] ] = 1 ;
    }
  }
  boolean tag = true ;
  for ( int i = 0 ;
  i < wDtos . length ;
  i ++ ) {
    if ( wDtos [ i ] % 2 == 0 ) {
    }
    else {
      tag = false ;
    }
  }
  if ( tag ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
