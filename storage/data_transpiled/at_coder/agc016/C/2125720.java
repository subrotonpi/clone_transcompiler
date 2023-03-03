public static int H = Integer . parseInt ( input ) {
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  int h = Integer . parseInt ( input . nextLine ( ) ) ;
  int w = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( H % h == 0 && W % w == 0 ) {
    System . out . println ( "No" ) ;
    exit ( ) ;
  }
  System . out . println ( "Yes" ) ;
  int n = 1000 ;
  int m ;
  int n = 1 ;
  if ( W % w > 0 ) {
    m = - ( ( w - 1 ) * n + 1 ) ;
    int [ ] row = new int [ W ] ;
    for ( int i = 0 ;
    i < W ;
    i ++ ) row [ i ] = i % w == w - 1 ? m : n ;
    for ( int i = 0 ;
    i < H ;
    i ++ ) System . out . println ( ( int ) row [ i ] ) ;
  }
  else {
    m = - ( ( h - 1 ) * n + 1 ) ;
    for ( int i = 0 ;
    i < H ;
    i ++ ) {
      if ( i % h == h - 1 ) System . out . println ( ( int ) ( m * W ) ) ;
      else System . out . println ( ( int ) ( n * W ) ) ;
    }
  }
  return m ;
}
