public static int [ ] inpl ( ) {
  return Arrays . stream ( input . readLine ( ) . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int N = inpl ( ) ;
  int A = inpl ( ) ;
  int B = inpl ( ) ;
  int C = A - B ;
  int [ ] h = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) h [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  int lo = - ( - Arrays . binarySearch ( h ) / ( ( N - 1 ) * B + A ) ) - 1 ;
  int hi = Integer . MAX_VALUE ;
  while ( hi - lo > 1 ) {
    int me = ( hi + lo ) / 2 ;
    int [ ] hprime = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) hprime [ i ] = h [ i ] - me * B ;
    int hans = 0 ;
    for ( int j = 0 ;
    j < hprime [ j ] ;
    j ++ ) hans += - ( - j / C ) ;
    if ( hans <= me ) hi = me ;
    else lo = me ;
  }
  System . out . println ( hi ) ;
  return h ;
}
