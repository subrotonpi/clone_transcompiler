public static void input ( ) {
  String s = "abcdefghijklmnopqrstuvwxyz" ;
  @ SuppressWarnings ( "resource" ) Scanner in = new Scanner ( System . in ) ;
  if ( s . length ( ) < 26 ) {
    Map < Character , Integer > map = new HashMap < Character , Integer > ( ) ;
    for ( char c : s . toCharArray ( ) ) {
      map . put ( c , 1 ) ;
    }
    for ( char bb : b ) {
      if ( map . get ( bb ) == 0 ) {
        System . out . println ( s + bb ) ;
        exit ( ) ;
      }
    }
  }
  int N = in . nextInt ( ) ;
  List < String > list = new ArrayList < String > ( ) ;
  for ( int first = N - 1 ;
  first >= 0 ;
  first -- ) {
    String mn = in . next ( ) ;
    for ( int i = first ;
    i >= 0 ;
    i -- ) {
      if ( s . charAt ( i ) < mn ) {
        list . add ( s . substring ( 0 , i ) + mn ) ;
      }
    }
  }
  if ( list . size ( ) > 0 ) {
    System . out . println ( new ArrayList < String > ( list ) . get ( 0 ) ) ;
    exit ( ) ;
  }
  System . out . println ( - 1 ) ;
}
