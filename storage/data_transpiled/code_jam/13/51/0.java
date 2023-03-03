@ InputFunction public static void input ( ) {
  int ocle = fac ( 37 ) ;
  for ( int cas : xrange ( 1 , z + 1 ) ) {
    int b = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
    int n = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
    int [ ] x = ArrayUtil . fromIntArray ( readLine ( ) . trim ( ) . split ( " " ) ) ;
    Arrays . fill ( x , 0 ) ;
    Arrays . sort ( x ) ;
    List < Integer > cx = new LinkedList < > ( ) ;
    int sx = Ints . sum ( x ) ;
    int mx = x [ x . length - 1 ] ;
    for ( int i : xrange ( 1 , 37 ) ) {
      int crem = x [ i - 1 ] * i - Ints . sum ( x , 0 , i ) ;
      if ( b >= crem ) cx . add ( x [ i - 1 ] + ( b - crem ) / i ) ;
    }
    cx = cx . stream ( ) . filter ( y -> y - 1 >= 0 ) . collect ( toList ( ) ) ;
    cx = cx . stream ( ) . filter ( y -> y + 1 >= 0 ) . collect ( toList ( ) ) ;
    Arrays . sort ( cx ) ;
    int best = 0 ;
    for ( int v : cx ) {
      int cle = Ints . sum ( 1 ) ;
      int req = cle * v - Ints . sum ( w ) ;
      if ( req <= b && cle > 0 ) {
        for ( int j : xrange ( cle ) ) {
          if ( req + j <= b ) {
            int bag = ( ( cle - j ) * v - Ints . sum ( x , 0 , cle - j ) ) * 36 * ocle / ( cle - j ) - ( req + j ) * ocle ;
            best = Math . max ( best , bag ) ;
          }
        }
      }
    }
    best = ( double ) best / ocle ;
    System . out . printf ( "Case #%d: %.15f%n" , cas , best ) ;
  }
}
