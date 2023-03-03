static final String [ ] [ ] zipcodes = new String [ zipcodes . length ] [ ] ;
final Map < String , List < Integer >> flights = new HashMap < String , List < Integer >> ( ) ;
{
  int i ;
  int t = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( i = 0 ;
  i < t ;
  i ++ ) {
    if ( avail [ i ] != null ) {
      for ( int flight : flights . get ( i ) ) {
        if ( ! path [ i ] [ j ] && ! reachable [ flight ] . contains ( flight ) ) {
          reachable [ i ] = new ArrayList < Integer > ( zipcodes [ flight - 1 ] ) ;
        }
      }
    }
  }
  Collections . sort ( reachable ) ;
  for ( i = 0 ;
  i < reachable . length ;
  i ++ ) {
    String zip = reachable [ i ] [ 0 ] ;
    String city = reachable [ i ] [ 1 ] ;
    boolean [ ] navail = avail . clone ( ) ;
    for ( int j = xrange ( path . length - 1 , - 1 , - 1 ) ;
    j >= 0 ;
    j -- ) {
      if ( navail [ j ] ) {
        if ( flights . get ( path [ j ] ) . contains ( city ) ) {
          break ;
        }
        else {
          navail [ j ] = false ;
        }
      }
    }
    navail [ j ] = true ;
    String [ ] [ ] x = solve ( path . toArray ( new String [ 0 ] ) , navail ) ;
    if ( x != null ) {
      return x ;
    }
  }
  return null ;
}
