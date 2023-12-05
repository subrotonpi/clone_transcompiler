public static void main ( String [ ] args ) {
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] [ ] a = new String [ W ] [ H ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    a [ i ] [ 0 ] = "." ;
  }
  String [ ] ans = new String [ W ] ;
  boolean [ ] isColumnWhite = new boolean [ H ] ;
  boolean [ ] isRowWhite = new boolean [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    String row = input . nextLine ( ) ;
    for ( int j = 0 ;
    j < W ;
    j ++ ) {
      a [ i ] [ j ] = row . charAt ( j ) ;
      if ( row . charAt ( j ) == '#' ) {
        isColumnWhite [ i ] = false ;
        isRowWhite [ j ] = false ;
      }
    }
  }
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    if ( isColumnWhite [ i ] ) continue ;
    String anRow = "" ;
    for ( int j = 0 ;
    j < W ;
    j ++ ) {
      if ( isRowWhite [ j ] ) continue ;
      anRow += a [ i ] [ j ] ;
    }
    System . out . println ( anRow ) ;
  }
  if ( Class . forName ( "com.sun.star.util.Main" ) . newInstance ( ) ) {
  }
}
