static final Scanner input = new Scanner ( System . in ) {
  @ Override public void next ( ) {
    int H = Integer . parseInt ( input . nextLine ( ) ) ;
    int W = Integer . parseInt ( input . nextLine ( ) ) ;
    char [ ] [ ] maps = new char [ W + 2 ] [ W + 2 ] ;
    for ( int i = 0 ;
    i < H ;
    i ++ ) maps [ i ] [ 0 ] = '.' ;
    for ( int i = 0 ;
    i < W ;
    i ++ ) maps [ i ] [ 1 ] = '.' ;
    dxy [ 0 ] [ 1 ] = '.' ;
    for ( int i = 1 , j = 1 ;
    j < H ;
    j ++ ) {
      if ( maps [ i ] [ j ] == '#' ) {
        for ( int k = 0 ;
        k < dxy . length ;
        k ++ ) {
          if ( maps [ i + k ] [ j + l ] == '#' ) {
            break ;
          }
        }
      }
      else {
        System . out . println ( "No" ) ;
        exit ( ) ;
      }
    }
  }
}
