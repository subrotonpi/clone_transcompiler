public static int cases = Integer . parseInt ( readLine ( ) ) {
  for ( int i = 0 ;
  i < xrange ( cases ) ;
  i ++ ) {
    int barber_count = Integer . parseInt ( readLine ( ) ) ;
    int place = Integer . parseInt ( readLine ( ) ) ;
    int [ ] barbers = Integer . parseInt ( readLine ( ) ) ;
    /* How many barbers are the same as the first number of barbers */
    int start = 0 ;
    int end = 1 ;
    while ( elapsed ( end ) <= place ) {
      end *= 2 ;
    }
    while ( start != end ) {
      int mid = ( start + end + 1 ) / 2 ;
      if ( elapsed ( mid ) > place - 1 ) {
        end = mid - 1 ;
      }
      else {
        start = mid ;
      }
    }
    int done = place - elapsed ( end ) ;
    int [ ] avail = Arrays . stream ( xrange ( barbers . length ) ) . filter ( b -> ( end + 1 ) % barbers [ b ] == 0 ) . limit ( barbers . length ) . mapToInt ( b -> b ) . toArray ( ) ;
    int ind = avail [ done - 1 ] + 1 ;
    System . out . println ( "Case #" + ( i + 1 ) + ": " + ind ) ;
  }
  return cases ;
}
