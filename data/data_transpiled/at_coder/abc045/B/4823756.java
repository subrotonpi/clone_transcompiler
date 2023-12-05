public static void selection ( String X , String A , String B , String C ) {
  String Y ;
  if ( X . equals ( "a" ) ) {
    if ( A . length ( ) == 0 ) {
      System . out . println ( "A" ) ;
      return ;
    }
    else Y = A . substring ( 0 , A . length ( ) ) ;
  }
  if ( X . equals ( "b" ) ) {
    if ( B . length ( ) == 0 ) {
      System . out . println ( "B" ) ;
      return ;
    }
    else Y = B . substring ( 0 , B . length ( ) ) ;
  }
}
