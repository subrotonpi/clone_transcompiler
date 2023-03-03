@ VisibleForTesting static String solve ( ) {
  int n = Integer . parseInt ( readLine ( ) ) ;
  int [ ] e = map . toArray ( new int [ n ] ) ;
  int [ ] f = map . toArray ( new int [ n ] ) ;
  int zeroes = ( int ) Math . log ( f [ 0 ] , 2 ) ;
  int [ ] res = new int [ zeroes ] ;
  Map < Integer , Integer > sums = new HashMap < > ( ) ;
  for ( int i : xrange ( 1 , n ) ) {
    int a = e [ i ] ;
    int freq = f [ i ] / ( 2 * zeroes ) ;
    for ( int j : xrange ( freq - sums . get ( a ) ) ) {
      res [ j ] = a ;
      Map < Integer , Integer > newSums = new HashMap < > ( ) ;
      newSums . put ( a , 1 ) ;
      for ( Map . Entry < Integer , Integer > e : sums . entrySet ( ) ) {
        newSums . put ( e . getKey ( ) , e . getValue ( ) ) ;
        newSums . put ( e . getKey ( ) + a , e . getValue ( ) ) ;
      }
      sums = newSums ;
    }
  }
  return String . join ( " " , res ) ;
}
