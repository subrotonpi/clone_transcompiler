public static void input ( Scanner in ) {
  double takahashi = in . nextDouble ( ) ;
  double aoki = in . nextDouble ( ) ;
  if ( takahashi == aoki ) {
    System . out . println ( "DRAW" ) ;
  }
  else if ( takahashi > aoki ) {
    System . out . println ( "TAKAHASHI" ) ;
  }
  else {
    System . out . println ( "AOKI" ) ;
  }
}
