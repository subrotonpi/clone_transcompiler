public static int H = Integer . parseInt ( input ) {
  int W = Integer . parseInt ( input . readLine ( ) ) ;
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] src = new int [ N ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    src [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  }
  int [ ] [ ] objs = new int [ H ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    objs [ i ] [ 0 ] = Integer . parseInt ( input . readLine ( ) ) ;
  }
  for ( int y = 0 ;
  y < H ;
  y ++ ) {
    objs [ y ] [ 0 ] = Integer . parseInt ( input . readLine ( ) ) ;
  }
  int maxx = 0 ;
  for ( int i = 1 ;
  i < H ;
  i ++ ) {
    objs [ y ] [ 0 ] = Integer . parseInt ( input . readLine ( ) ) ;
  }
  return maxx ;
}
