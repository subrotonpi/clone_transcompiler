static final int [ ] [ ] getSortedValues ( int N , int K , int [ ] [ ] TD ) {
  final int [ ] [ ] result = new int [ N ] [ K ] ;
  System . arraycopy ( TD , 0 , result [ 0 ] , 0 , K ) ;
  System . arraycopy ( TD , 0 , result [ 1 ] , 0 , K ) ;
  if ( getClass ( ) . getName ( ) . equals ( "java.util.concurrent.LinkedTransferQueue" ) ) {
    System . arraycopy ( readAll , 0 , result [ 2 ] , 0 , K ) ;
  }
  else {
    System . arraycopy ( readAll , 0 , result [ 3 ] , 0 , K ) ;
  }
  final int [ ] [ ] result = new int [ N ] [ K ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) result [ i ] = new int [ K ] ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) result [ i ] [ 0 ] = i ;
  System . arraycopy ( readAll , 0 , result [ 3 ] , 0 , K ) ;
  System . arraycopy ( readAll , 0 , result [ 3 ] , 0 , K ) ;
  final int [ ] [ ] result = new int [ K ] [ K ] ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) result [ i ] [ 0 ] = i ;
  System . arraycopy ( readAll , 0 , result [ 3 ] , 0 , K ) ;
  System . arraycopy ( readAll , 0 , result [ 3 ] , 0 , K ) ;
  final int [ ] [ ] result = new int [ K ] [ K ] ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) result [ i ] [ 0 ] = i ;
  for ( int i = 0 ;
  i < result [ 0 ] . length ;
  i ++ ) {
    result [ i ] [ 0 ] = i ;
    result [ i ] [ 1 ] = i ;
  }
  return result ;
}
