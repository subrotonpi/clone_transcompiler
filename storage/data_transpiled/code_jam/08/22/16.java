@ GwtIncompatible ( "java.util.BitSet" ) private static int [ ] [ ] sieve ( ) {
  int max = 1000 ;
  int maxpossible = ( int ) Math . sqrt ( max ) ;
  int [ ] nums = new int [ 2 ] ;
  for ( int i = 2 ;
  i < maxpossible ;
  i ++ ) {
    nums = Stream . of ( nums ) . map ( line -> line . trim ( ) ) . filter ( i -> i == i || i % i == 0 ) . toArray ( ) ;
  }
  return nums ;
}
