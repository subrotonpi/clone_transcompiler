public static void input ( Scanner in ) {
  int N = in . nextInt ( ) ;
  int cnt = 1 ;
  for ( char c1 : in . next ( ) ) {
    for ( char c2 : in . next ( ) ) {
      if ( cnt == N ) {
        System . out . println ( c1 + c2 ) ;
      }
      cnt ++ ;
    }
  }
}
