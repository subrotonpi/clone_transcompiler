public static void input ( Scanner S ) {
  int redCount = S . nextInt ( ) ;
  int aoCount = S . nextInt ( ) ;
  if ( redCount > aoCount ) {
    System . out . println ( aoCount * 2 ) ;
  }
  else if ( redCount < aoCount ) {
    System . out . println ( redCount * 2 ) ;
  }
  else {
    System . out . println ( redCount + aoCount ) ;
  }
}
