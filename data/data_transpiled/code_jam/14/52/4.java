public static void main ( String input ) {
  for ( int ti = 1 ;
  ti <= Integer . parseInt ( input ) ;
  ti ++ ) {
    int p = Integer . parseInt ( input ) ;
    int q = Integer . parseInt ( input ) ;
    int n = Integer . parseInt ( input ) ;
    ArrayList < Point > bests = new ArrayList < Point > ( ) ;
    bests . add ( new Point ( 0 , 1 ) ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int h = Integer . parseInt ( input ) ;
      int g = Integer . parseInt ( input ) ;
      int towershots = ( h + q - 1 ) / q ;
      int bestdiff = 100 ;
      for ( int j = 0 ;
      j < towershots ;
      j ++ ) {
        int k = ( h - q * j + p - 1 ) / p ;
        if ( k - j < bestdiff ) {
          bestdiff = k - j ;
        }
      }
      Point [ ] newbests = new Point [ bests . size ( ) ] ;
      for ( int j = 0 ;
      j < bests . size ( ) ;
      j ++ ) {
        Point best = bests . get ( j ) ;
        newbests [ j ] = new Point ( best . x , best . y + towershots ) ;
        if ( best . y >= bestdiff ) {
          newbests [ j ] = new Point ( best . x + g , best . y - bestdiff ) ;
        }
      }
      Arrays . sort ( newbests ) ;
      Point last = newbests . get ( newbests . size ( ) - 1 ) ;
      bests = new Point [ ] {
        last }
        ;
        for ( int i = 0 ;
        i <= bests . size ( ) - 1 ;
        i ++ ) {
          if ( newbests [ i ] . x > last . x || newbests [ i ] . y > last . y ) {
            bests [ i ] = newbests . get ( i ) ;
            last = newbests . get ( i ) ;
          }
        }
      }
      System . out . println ( "Case #" + ti + ":" + bests [ 0 ] . x ) ;
    }
  }
  