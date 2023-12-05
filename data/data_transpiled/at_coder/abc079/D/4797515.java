@ VisibleForTesting static void floydWarshall ( ) {
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] C = new int [ 10 ] [ 10 ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    C [ i ] [ 0 ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] [ ] B = F . floydWarshall ( C ) ;
  long ans = 0 ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    for ( int j = 0 ;
    j < W ;
    j ++ ) {
      if ( A [ i ] [ j ] == - 1 ) continue ;
      ans += B [ A [ i ] [ j ] ] [ 1 ] ;
    }
  }
  System . out . println ( ( int ) ans ) ;
}
