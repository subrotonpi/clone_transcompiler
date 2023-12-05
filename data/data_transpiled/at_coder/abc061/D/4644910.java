public static int [ ] parse ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  int big = 10 * 13 ;
  int [ ] data = new int [ N + 1 ] ;
  @ SuppressWarnings ( "unchecked" ) Set < Integer > branch = new HashSet < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    int c = Integer . parseInt ( input ) ;
    branch . add ( new Integer ( a ) ) ;
    branch . add ( new Integer ( b ) ) ;
  }
  @ SuppressWarnings ( "unchecked" ) Queue < Pair < Integer , Integer >> check = new LinkedList < > ( ) ;
  check . add ( new Pair < > ( 1 , 0 , new HashSet < > ( ) ) ) ;
  data [ 1 ] = 0 ;
  while ( check . size ( ) > 0 ) {
    Pair < Integer , Integer > now = check . poll ( ) ;
    for ( int b = 0 ;
    b < branch . size ( ) ;
    b ++ ) {
      if ( now . second ( ) + c > data [ b ] ) {
        if ( now . first ( ) > big ) continue ;
        if ( now . second ( ) > big ) continue ;
      }
      else {
        data [ b ] = now . second ( ) + c ;
        check . add ( now . second ( ) ) ;
      }
    }
  }
  if ( data [ N ] > big ) System . out . println ( "inf" ) ;
  else System . out . println ( data [ N ] ) ;
  return data ;
}
