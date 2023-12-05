static final String print ( ) {
  Scanner input = new Scanner ( System . in ) ;
  int n = input . nextInt ( ) ;
  int [ ] t = Arrays . stream ( input . nextLine ( ) . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int [ ] v = Arrays . stream ( input . nextLine ( ) . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int [ ] maxspeed = new int [ n + 1 ] ;
  for ( int i = n - 1 ;
  i > 0 ;
  i -- ) {
    maxspeed [ i ] = Math . min ( v [ i ] , v [ i - 1 ] , t [ i ] + maxspeed [ i + 1 ] ) ;
  }
  int [ ] c = new int [ n ] ;
  int [ ] lastspeed = new int [ n ] ;
  for ( int i = n - 1 ;
  i > 0 ;
  i -- ) {
    lastspeed [ i ] = Math . min ( v [ i ] , v [ i ] ) ;
  }
  /* Distance between first and last speed */
  int ti = t [ i ] ;
  int vi = v [ i ] ;
  int mi1 = maxspeed [ i + 1 ] ;
  int ta = vi - first ;
  int tb = vi - mi1 ;
  int [ ] lastspeed ;
  if ( ta + tb <= ti ) {
    c = ( first + vi ) * ta / 2 + vi * ( ti - ta - tb ) + ( mi1 + vi ) * tb / 2 ;
    lastspeed = mi1 ;
  }
  else if ( mi1 - first > ti ) {
    c = ( first + first + ti ) * ti / 2 ;
    lastspeed = first + ti ;
  }
  else {
    int a = ( mi1 + ti - first ) / 2 ;
    c = ( first + first + a ) * a / 2 + ( first + a + mi1 ) * ( ti - a ) / 2 ;
    lastspeed = mi1 ;
  }
  return c [ 0 ] + lastspeed [ 0 ] ;
}
