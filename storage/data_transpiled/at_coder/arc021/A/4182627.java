public static String [ ] [ ] grid ( ) {
  String ans = "GAMEOVER" ;
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    grid [ i ] [ 0 ] = input . nextLine ( ) . split ( " " ) ;
  }
  for ( int i = 0 ;
  i < grid . length ;
  i ++ ) {
    for ( int j = 0 ;
    j < 3 ;
    j ++ ) {
      if ( grid [ j ] [ j ] == grid [ j + 1 ] [ j ] ) {
        ans = "CONTINUE" ;
        break ;
      }
    }
  }
  return ans ;
}
