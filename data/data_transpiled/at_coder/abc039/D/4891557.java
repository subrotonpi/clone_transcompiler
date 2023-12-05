public static List < String > imageProcessingTakaHashi ( int H , int W , String [ ] S ) {
  char [ ] [ ] ret = new char [ H ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    ret [ i ] = new char [ W ] ;
  }
  /* TODO: This is a hack to work with a hack that is not necessary to work with a hack */
  for ( int h = - 1 ;
  h <= 1 ;
  h ++ ) {
    for ( int dw = - 1 ;
    dw <= 1 ;
    dw ++ ) {
      if ( h + dh < 0 || H <= h + dh ) continue ;
      if ( w + dw < 0 || W <= w + dw ) continue ;
      if ( ret [ h + dh ] [ w + dw ] == '#' ) return true ;
    }
  }
  for ( int h = 0 ;
  h < H ;
  h ++ ) {
    for ( int w = 0 ;
    w < W ;
    w ++ ) {
      if ( S [ h ] . charAt ( w ) == '#' ) continue ;
      for ( int dh = - 1 ;
      dh <= 1 ;
      dh ++ ) {
        for ( int dw = - 1 ;
        dw <= 1 ;
        dw ++ ) {
          if ( h + dh < 0 || H <= h + dh ) continue ;
          if ( w + dw < 0 || W <= w + dw ) continue ;
          ret [ h + dh ] [ w + dw ] = '.' ;
        }
      }
    }
  }
  for ( int h = 0 ;
  h < H ;
  h ++ ) {
    for ( int w = 0 ;
    w < W ;
    w ++ ) {
      if ( S [ h ] . charAt ( w ) == '.' ) continue ;
      if ( ! isBlack ( h , w ) ) return new ArrayList < String > ( ) ;
    }
  }
  if ( getClass ( ) . equals ( String . class ) ) {
    H = 0 ;
    W = Integer . parseInt ( input ( ) ) ;
    S = new char [ H ] [ W ] ;
    for ( int i = 0 ;
    i < H ;
    i ++ ) {
      S [ i ] = input ( ) ;
    }
    String ans = imageProcessingTakaHashi ( H , W , S ) ;
    if ( ans . length ( ) > 0 ) {
      System . out . println ( "possible" ) ;
      System . out . println ( ans