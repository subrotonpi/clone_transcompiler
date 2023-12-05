public static int Z = Integer . parseInt ( scanner . nextLine ( ) ) {
  for ( int z = 0 ;
  z < Z ;
  z ++ ) {
    int n = Integer . parseInt ( scanner . nextLine ( ) ) ;
    int X = Integer . parseInt ( scanner . nextLine ( ) ) ;
    int [ ] S = Integer . parseInt ( scanner . nextLine ( ) ) ;
    Arrays . sort ( S ) ;
    int count = 0 ;
    int i = 0 ;
    int j = S . length - 1 ;
    while ( i <= j ) {
      count ++ ;
      if ( i == j ) {
        break ;
      }
      else {
        if ( S [ i ] + S [ j ] <= X ) {
          i ++ ;
          j -- ;
        }
        else {
          j -- ;
        }
      }
    }
    System . out . println ( "Case #" + ( z + 1 ) + ": " + count ) ;
  }
  return Z ;
}
