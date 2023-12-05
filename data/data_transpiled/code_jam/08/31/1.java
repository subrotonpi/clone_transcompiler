static long processOld ( List < Integer > list ) {
  long [ ] table = new long [ list . size ( ) ] ;
  for ( int i : xrange ( list . size ( ) ) ) {
    long num = 1 ;
    for ( int j : xrange ( i ) ) if ( list . get ( j ) < list . get ( i ) ) num += table [ j ] ;
    table [ i ] = num % B ;
  }
  return Long . sum ( table ) % B ;
}
