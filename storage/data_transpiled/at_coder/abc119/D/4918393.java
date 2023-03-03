static final int [ ] binarySearch ( int A , int B , int Q ) {
  int [ ] X = new int [ A ] ;
  int [ ] Y = new int [ B ] ;
  for ( int i = 0 ;
  i < A ;
  i ++ ) X [ i ] = - Integer . MAX_VALUE ;
  Arrays . sort ( X ) ;
  Arrays . sort ( Y ) ;
  int i = 1 ;
  int j = 1 ;
  int [ ] pos = new int [ B ] ;
  int [ ] near = new int [ B ] ;
  if ( X [ 1 ] > Y [ 1 ] ) {
    pos [ 0 ] = Y [ 1 ] ;
    near [ 0 ] = X [ 1 ] - Y [ 1 ] ;
    j = 2 ;
  }
  else {
    pos [ 0 ] = X [ 1 ] ;
    near [ 0 ] = Y [ 1 ] - X [ 1 ] ;
    i = 2 ;
  }
  do {
    if ( X [ i ] > Y [ j ] ) {
      pos [ 0 ] = Y [ j ] ;
      near [ 0 ] = Math . min ( X [ i ] - Y [ j ] , Y [ j ] - X [ i - 1 ] ) ;
      j ++ ;
    }
    else {
      pos [ 0 ] = X [ i ] ;
      near [ 0 ] = Math . min ( Y [ j ] - X [ i ] , X [ i ] - Y [ j - 1 ] ) ;
      i ++ ;
    }
    if ( i >= ( A + 1 ) && j >= ( B + 1 ) ) break ;
  }
  while ( true ) ;
  pos = Arrays . copyOf ( pos , pos . length + 1 ) ;
  near = Arrays . copyOf ( near , near . length + 1 ) ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int insertIndex = Arrays . binarySearch ( pos , x ) ;
    if ( pos [ insertIndex ] - x + near [ insertIndex ] > x - pos [ insertIndex - 1 ] + near [ insertIndex - 1 ] ) System . out . println ( x - pos [ insertIndex - 1 ] + near [ insertIndex - 1 ] ) ;
    else System . out . println ( pos [ insertIndex ] - x + near [ insertIndex ] ) ;
  }
}
