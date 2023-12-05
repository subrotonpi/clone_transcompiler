static final private int [ ] getBinaryTree ( int [ ] a , int def , BinaryOp op ) {
  final int N = Integer . parseInt ( input ( ) . nextLine ( ) ) ;
  final int M = Integer . parseInt ( input ( ) . nextLine ( ) ) ;
  final int [ ] set = new int [ M ] ;
  int [ ] add = new int [ M ] ;
  int [ ] remove = new int [ M ] ;
  System . arraycopy ( a , 0 , set , 0 , M ) ;
  System . arraycopy ( tree , 0 , set , M , T ) ;
  for ( int i = elem_size - 1 ;
  i > 0 ;
  i -- ) {
    set [ i ] = op . op ( set [ i << 1 ] , set [ ( i << 1 ) + 1 ] ) ;
  }
  int [ ] result = new int [ M ] ;
  int i ;
  for ( i = elem_size - 1 ;
  i > 0 ;
  i -- ) {
    set [ i ] = op . op ( set [ i ] , set [ ( i << 1 ) + 1 ] ) ;
  }
  int [ ] result = new int [ M ] ;
  int [ ] set = new int [ M ] ;
  for ( i = 0 ;
  i < M ;
  i ++ ) {
    set [ i ] = op . op ( set [ i ] , set [ i ] ) ;
  }
  System . arraycopy ( set , 0 , result , M , T ) ;
  result [ M ] = op . op ( set [ i ] , set [ i ] ) ;
  int [ ] add = new int [ M ] ;
  for ( i = 0 ;
  i < M ;
  i ++ ) {
    int k = set [ i ] + i ;
    set [ i ] += add [ k ] ;
  }
  System . arraycopy ( add , 0 , set , M , T ) ;
  result [ M ] = op . op ( set [ i ] , set [ i ] ) ;
  System . arraycopy ( set , 0 , result , M , T ) ;
  result [ M ] = op . op ( set [ i ] , set [ i ] ) ;
  return result ;
}
