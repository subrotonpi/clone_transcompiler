public static void mine ( String input ) {
  int H = Integer . parseInt ( input . split ( " " ) [ 0 ] ) ;
  int W = Integer . parseInt ( input . split ( " " ) [ 1 ] ) ;
  StringBuilder S = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    S . append ( '.' ) ;
  }
  S . insert ( 0 , '.' ) ;
  S . insert ( S . length ( ) , '.' ) ;
  /* mine */
  if ( input . equals ( "#" ) ) {
    count . add ( 1 ) ;
  }
  for ( int i = 1 ;
  i <= H ;
  i ++ ) {
    StringBuffer tmp = new StringBuffer ( ) ;
    for ( int j = 1 ;
    j <= W ;
    j ++ ) {
      if ( S . charAt ( i ) == '#' ) {
        tmp . append ( '#' ) ;
      }
      else {
        count . clear ( ) ;
        mine ( S . charAt ( i - 1 ) , j - 1 ) ;
        mine ( S . charAt ( i - 1 ) , j ) ;
        mine ( S . charAt ( i - 1 ) , j + 1 ) ;
        mine ( S . charAt ( j - 1 ) , j ) ;
        mine ( S . charAt ( i ) , j + 1 ) ;
        mine ( S . charAt ( j + 1 ) , j ) ;
        mine ( S . charAt ( j + 1 ) , j ) ;
      }
      tmp . append ( Integer . toString ( count . get ( 0 ) ) ) ;
    }
  }
  System . out . println ( tmp ) ;
}
