public static void input ( Scanner S ) {
  int redcount = S . nextInt ( ) ;
  int bluecount = S . nextInt ( ) ;
  int mincount = Math . min ( redcount , bluecount ) ;
  int answer = mincount * 2 ;
  System . out . println ( answer ) ;
}
