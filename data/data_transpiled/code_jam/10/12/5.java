public static int T = Integer . parseInt ( input ) {
  for ( int C = 1 ;
  C <= T ;
  C ++ ) {
    String D = input . next ( ) ;
    String I = input . next ( ) ;
    String M = input . next ( ) ;
    String N = input . next ( ) ;
    int [ ] x = input . split ( "\\s+" ) ;
    int [ ] r = new int [ 256 ] ;
    for ( int i = 0 ;
    i < x . length ;
    i ++ ) {
      int [ ] nr = new int [ 256 ] ;
      for ( int q = 0 ;
      q < x . length ;
      q ++ ) {
        nr [ i ] = Integer . parseInt ( x [ i ] ) + D ;
        q = Integer . parseInt ( x [ q ] ) ;
        if ( M == 0 ) {
          for ( int i = 0 ;
          i < 256 ;
          i ++ ) {
            nr [ i ] = Math . min ( nr [ i ] , r [ i ] + Math . abs ( q - i ) ) ;
          }
        }
        else {
          for ( int i = 0 ;
          i < 256 ;
          i ++ ) {
            for ( int j = 0 ;
            j < 256 ;
            j ++ ) {
              nr [ j ] = Math . min ( nr [ j ] , r [ i ] + Math . abs ( q - j ) + ( Math . max ( 0 , Math . abs ( i - j ) - 1 ) / M ) * I ) ;
            }
          }
        }
      }
      r = nr ;
    }
    System . out . println ( String . format ( "Case #%d: %s" , C , min ( r ) ) ) ;
  }
  return T ;
}
