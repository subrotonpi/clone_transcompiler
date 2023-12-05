@ Test public static void solve ( ) {
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> a = Arrays . asList ( Lists . newArrayList ( ) ) ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    a . add ( Lists . newArrayList ( ) ) ;
  }
  List < List < Integer >> cumsum = new ArrayList < > ( ) ;
  for ( int y = 0 ;
  y < a . size ( ) ;
  y += 1 ) {
    List < Integer > l = a . get ( y ) ;
    int cumB = 0 , cumW = 0 ;
    for ( int x = 0 ;
    x < l . size ( ) ;
    x ++ ) {
      final int v = l . get ( y - 1 ) ;
      final int upB = cumsum . get ( y - 1 ) . get ( 1 ) ;
      final int upW = cumsum . get ( y - 1 ) . get ( 1 ) ;
      if ( ( x + y % 2 ) % 2 == 0 ) {
        cumB += v ;
      }
      else {
        cumW += v ;
      }
      cumsum . set ( y , x , upB + cumB , upW + cumW ) ;
    }
  }
  int result = 0 ;
  for ( int width = 1 , height = 1 ;
  width < W ;
  width ++ ) {
    if ( result >= width * height ) {
      continue ;
    }
    for ( int _y = 0 , y = 1 ;
    _y < H ;
    _y ++ , y ++ ) {
      for ( int b1 = 0 , w1 = 0 ;
      b1 < cumsum . get ( _y ) . get ( width ) ;
      b1 ++ , w2 = cumsum . get ( _y ) . get ( width ) ;
      int b3 = cumsum . get ( y ) . get ( width ) ;
      int w4 = cumsum . get ( y ) . get ( height ) ;
      int b = b1 - b2 - b3 + b4 ;
      int w = w1 - w2 - w3 + w4 ;
      if ( b == w ) {
        result = width * height ;
      }
    }
  }
  System . out . println ( result ) ;
}
