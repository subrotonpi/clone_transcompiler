@ functools . lru_cache ( ) public static int [ ] [ ] ints ( int h , int w ) {
  int [ ] [ ] s = new int [ h ] [ w ] ;
  int res = 0 ;
  {
    if ( h < 0 || w < 0 || h >= w ) {
      return false ;
    }
    if ( s [ h ] [ w ] == '#' ) {
      return false ;
    }
    return true ;
  }
  @ SuppressWarnings ( "unused" ) int dp = 0 ;
  if ( player == 0 ) {
    res = 0 ;
    if ( valid ( h + 1 , w ) ) {
      res = Math . max ( res , dp ( h + 1 , w , 1 - player ) ) ;
    }
    if ( valid ( h + 1 , w + 1 ) ) {
      res = Math . max ( res , dp ( h + 1 , w + 1 , 1 - player ) ) ;
    }
    if ( valid ( h + 1 , w + 1 ) ) {
      res = Math . max ( res , dp ( h + 1 , w + 1 , 1 - player ) ) ;
    }
    return res ;
  }
  else {
    res = 1 ;
    if ( valid ( h + 1 , w ) ) {
      res = Math . min ( res , dp ( h + 1 , w , 1 - player ) ) ;
    }
    if ( valid ( h + 1 , w + 1 ) ) {
      res = Math . min ( res , dp ( h + 1 , w + 1 , 1 - player ) ) ;
    }
    if ( valid ( h + 1 , w + 1 ) ) {
      res = Math . min ( res , dp ( h + 1 , w + 1 , 1 - player ) ) ;
    }
    return res ;
  }
}
