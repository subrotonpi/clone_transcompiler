@ Common public static void main ( final boolean [ ] args ) {
  int [ ] count1 = new int [ 150 ] ;
  int [ ] count3 = new int [ 150 ] ;
  int [ ] count4 = new int [ 150 ] ;
  int [ ] count6 = new int [ 150 ] ;
  int [ ] count12 = new int [ 150 ] ;
  count1 [ 0 ] = 1 ;
  count1 [ 2 ] = 1 ;
  int M = 1000000007 ;
  for ( int i = 0 ;
  i < 101 ;
  i ++ ) {
    count1 [ i + 3 ] = ( count1 [ i + 3 ] + count1 [ i ] ) % M ;
    count3 [ i + 3 ] = ( count3 [ i + 3 ] + count3 [ i ] ) % M ;
    count4 [ i + 3 ] = ( count4 [ i + 3 ] + count4 [ i ] ) % M ;
    count6 [ i + 3 ] = ( count6 [ i + 3 ] + count6 [ i ] ) % M ;
    count12 [ i + 3 ] = ( count12 [ i + 3 ] + count12 [ i ] ) % M ;
    count3 [ i + 4 ] = ( count3 [ i + 4 ] + 3 * count3 [ i ] + 3 * count1 [ i ] ) % M ;
    count6 [ i + 4 ] = ( count6 [ i + 4 ] + 3 * count6 [ i ] ) % M ;
    count12 [ i + 4 ] = ( count12 [ i + 4 ] + 3 * count4 [ i ] + 3 * count12 [ i ] ) % M ;
    count6 [ i + 4 ] = ( count6 [ i + 4 ] + 6 * count1 [ i ] + 6 * count3 [ i ] + 6 * count6 [ i ] ) % M ;
    count12 [ i + 4 ] = ( count12 [ i + 4 ] + 4 * count1 [ i ] + 4 * count4 [ i ] ) % M ;
    count12 [ i + 5 ] = ( count12 [ i + 5 ] + 4 * count3 [ i ] + 4 * count3 [ i ] + 4 * count6 [ i ] ) % M ;
  }
}
