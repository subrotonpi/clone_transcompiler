static final int [ ] getBinarySearch ( ) {
  final int n = Integer . parseInt ( input . nextLine ( ) ) ;
  n = n * 3 ;
  final int [ ] a = Lists . newArrayList ( ) . add ( Integer . parseInt ( input . nextLine ( ) ) ) . toArray ( ) ;
  final int [ ] left = Arrays . copyOfRange ( a , 0 , n / 3 ) ;
  final int [ ] right = Arrays . copyOfRange ( a , 2 * n / 3 , a . length ) ;
  final int [ ] leftsum = new int [ n / 3 + 1 ] ;
  final int [ ] rightsum = new int [ n / 3 + 1 ] ;
  for ( int i = 0 ;
  i < n / 3 ;
  i ++ ) {
    leftsum [ i ] = 0 ;
    rightsum [ i ] = 0 ;
  }
  HeapSort . sort ( left ) ;
  leftsum [ 0 ] = sum ( left ) ;
  for ( int i = 0 ;
  i < n / 3 ;
  i ++ ) {
    final int k = i + n / 3 ;
    HeapSort . sort ( left , a [ k ] ) ;
    final int temp = HeapSort . sort ( left ) ;
    leftsum [ i + 1 ] = leftsum [ i ] + a [ k ] - temp ;
  }
  HeapSort . sort ( right ) ;
  rightsum [ n - 1 ] = - sum ( right ) ;
  for ( int i = 0 ;
  i < n / 3 ;
  i ++ ) {
    final int k = i + n / 3 ;
    HeapSort . sort ( right , - a [ k ] ) ;
    final int temp = HeapSort . sort ( right ) ;
    rightsum [ i ] = rightsum [ i + 1 ] - temp + a [ k ] ;
  }
  int mxm = - sum ( a ) ;
  for ( int i = 0 ;
  i < n / 3 + 1 ;
  i ++ ) {
    if ( leftsum [ i ] - rightsum [ i ] > mxm ) {
      mxm = leftsum [ i ] - rightsum [ i ] ;
    }
  }
  System . out . println ( mxm ) ;
  return leftsum ;
}
