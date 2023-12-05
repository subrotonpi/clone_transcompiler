public static String seekInks ( int x , int y ) {
  for ( int i = - 1 ;
  i < 2 ;
  i ++ ) {
    for ( int j = - 1 ;
    j < 2 ;
    j ++ ) {
      if ( ( currentMap [ Math . max ( Math . min ( H - 1 , y + i ) , 0 ) ] [ Math . max ( Math . min ( W - 1 , x + j ) , 0 ) ] == "." ) ) {
        return "." ;
      }
    }
  }
  /* drop the past */
  for ( int i = - 1 ;
  i < 2 ;
  i ++ ) {
    for ( int j = - 1 ;
    j < 2 ;
    j ++ ) {
      if ( ( currentMap [ Math . max ( Math . min ( H - 1 , y + i ) , 0 ) ] [ Math . max ( Math . min ( W - 1 , x + j ) , 0 ) ] == "#" ) ) {
        return "#" ;
      }
    }
  }
  /* go back */
  Map < Integer , Map < Integer , String >> past_map = Maps . newHashMap ( ) ;
  for ( int h = 0 ;
  h < H ;
  h ++ ) {
    past_map . put ( h , Maps . newHashMap ( ) ) ;
    for ( int w = 0 ;
    w < W ;
    w ++ ) {
      past_map . put ( h , Maps . newHashMap ( ) ) ;
    }
  }
  /* re drop the past */
  Map < Integer , Map < Integer , String >> new_map = Maps . newHashMap ( ) ;
  for ( int h = 0 ;
  h < H ;
  h ++ ) {
    new_map . put ( h , Maps . newHashMap ( ) ) ;
    for ( int w = 0 ;
    w < W ;
    w ++ ) {
      new_map . put ( h , Maps . newHashMap ( ) ) ;
    }
  }
  Map < Integer , Map < Integer , String >> past_map = go_back ( ) ;
  Map < Integer , String > new_map = re_drop ( ) ;
  if ( ( new_map . equals ( current_map ) ) ) {
    System . out . println ( "possible" ) ;
    for ( int h = 0 ;
    h < H ;
    h ++ ) {
      String line = "" ;
      for ( int w = 0 ;
      w < W ;
      w ++ ) {
        line += past_map . get ( h ) . get ( w ) ;
      }
      System . out . println (