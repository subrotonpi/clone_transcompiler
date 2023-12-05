@ VisibleForTesting static void reduce ( Operator . Reduce2 < Integer , Double , Double > reduce ) throws IOException {
  Scanner fi = new Scanner ( System . in ) ;
  for ( int run = 0 ;
  run < Integer . parseInt ( fi . nextLine ( ) ) ;
  run ++ ) {
    int X = Integer . parseInt ( fi . nextLine ( ) ) ;
    int S = Integer . parseInt ( fi . nextLine ( ) ) ;
    int R = Integer . parseInt ( fi . nextLine ( ) ) ;
    int t = Integer . parseInt ( fi . nextLine ( ) ) ;
    int N = Integer . parseInt ( fi . nextLine ( ) ) ;
    int [ ] [ ] ww = new int [ N ] [ ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      ww [ i ] = map . get ( fi . nextLine ( ) ) ;
    }
    Arrays . sort ( ww ) ;
    int last = X ;
    for ( int i = ww . length - 1 ;
    i >= 0 ;
    i -- ) {
      int b = ww [ i ] [ 0 ] ;
      int e = ww [ i ] [ 1 ] ;
      int v = ww [ i ] [ 2 ] ;
      ww [ i ] [ 0 ] += S ;
      if ( e != last ) {
        ww [ i ] [ 1 ] = e ;
      }
      last = b ;
    }
    if ( last > 0 ) {
      ww [ i ] [ 0 ] = 0 ;
    }
    R -= S ;
    Arrays . sort ( ww , new Comparator < Integer > ( ) {
      @ Override public int compare ( Integer b , Integer e ) {
        double time ;
        if ( e - b <= ( v + R ) * t ) {
          time = 1.0 * ( e - b ) / ( v + R ) ;
          res += time ;
          t -= time ;
        }
        else {
          time = 1.0 * ( e - b - t * ( v + R ) ) / v + t ;
          res += time ;
          t = 0 ;
        }
        return time ;
      }
    }
    ) ;
  }
  System . out . println ( "Case #" + ( run + 1 ) + ": " + reduce ) ;
}
