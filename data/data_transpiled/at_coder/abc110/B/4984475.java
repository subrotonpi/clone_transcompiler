static final int [ ] [ ] resize ( int n , int m , int x , int y ) {
  int [ ] xl = new int [ n ] [ m ] ;
  int [ ] yl = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    xl [ i ] = i ;
    yl [ i ] = i ;
  }
  return xl ;
}
