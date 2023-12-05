static final int solve ( int n , int m , int [ ] a , int [ ] b ) {
  int [ ] p = new int [ n + 1 ] ;
  int [ ] u = new int [ n + 1 ] ;
  {
    int find ( a ) {
      if ( p [ a ] == - 1 ) {
        return a [ a ] ;
      }
      else {
        return find ( p [ a ] ) ;
      }
    }
  }
  int total = n * ( n - 1 ) / 2 ;
  int [ ] res = new int [ m ] ;
  res [ 0 ] = total ;
  for ( int i = m - 1 ;
  i > 0 ;
  i -- ) {
    int x = a [ i ] , y = b [ i ] ;
  }
  return res [ 0 ] ;
}
