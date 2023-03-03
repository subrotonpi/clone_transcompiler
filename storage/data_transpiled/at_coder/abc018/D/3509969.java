static final int [ ] [ ] range ( int N , int M , int P , int Q , int R ) {
  int [ ] XYZ = new int [ R ] ;
  for ( int i = 0 ;
  i < R ;
  i ++ ) XYZ [ i ] = list ( input ( ) . split ( " " ) ) ;
  int [ ] [ ] LIST = new int [ N + 1 ] [ M + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) LIST [ i ] [ 0 ] = 0 ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) for ( int j = 0 ;
  j < M ;
  j ++ ) LIST [ i ] [ j ] = XYZ [ i ] [ j ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) for ( int j = 0 ;
  j < M ;
  j ++ ) for ( int k = 0 ;
  k < ITER [ i ] [ j ] ;
  k ++ ) SCORE [ i ] [ j ] += LIST [ i ] [ k ] ;
  Arrays . sort ( SCORE , Collections . reverseOrder ( ) ) ;
  if ( ANS < Arrays . binarySearch ( SCORE , 0 , Q ) ) ANS = Arrays . binarySearch ( SCORE , 0 , Q ) ;
  System . out . println ( ANS ) ;
  return LIST ;
}
