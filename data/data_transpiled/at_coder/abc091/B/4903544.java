public static void print ( int N = Integer . parseInt ( input ) ) {
  Map < String , Integer > blue = new HashMap < String , Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    String s = input . nextLine ( ) ;
    if ( blue . get ( s ) == null ) {
      blue . put ( s , 1 ) ;
    }
    else {
      blue . get ( s ) ++ ;
    }
  }
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  Map < String , Integer > red = new HashMap < String , Integer > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    String t = input . nextLine ( ) ;
    if ( red . get ( t ) == null ) {
      red . put ( t , 1 ) ;
    }
    else {
      red . get ( t ) ++ ;
    }
  }
  int answer = 0 ;
  for ( Map . Entry < String , Integer > i : blue . entrySet ( ) ) {
    int blueElem = i . getValue ( ) ;
    int redElem = red . get ( i . getKey ( ) ) != null ? red . get ( i . getKey ( ) ) : 0 ;
    answer = answer < blueElem - redElem ? blueElem - redElem : answer ;
  }
  System . out . println ( answer ) ;
}
