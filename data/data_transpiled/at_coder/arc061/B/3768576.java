static final boolean checkRange ( int y , int x , int H , int W ) {
  return 0 < x && x < W && 0 < y && y < H ;
  /* solve the solution */
  int H = Integer . parseInt ( input . readLine ( ) ) ;
  int W = Integer . parseInt ( input . readLine ( ) ) ;
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] L = new int [ 10 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L [ i ] = 0 ;
  }
  L [ 0 ] = ( H - 2 ) * ( W - 2 ) ;
  ArrayList < Integer > NL = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    y = i ;
    x = i ;
  }
  for ( int v : NL ) {
    L . add ( v ) ;
    L [ 0 ] -- ;
  }
  for ( int v : L ) {
    System . out . println ( v ) ;
  }
}
