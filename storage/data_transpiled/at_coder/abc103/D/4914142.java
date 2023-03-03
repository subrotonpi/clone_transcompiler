@ Function public static void from ( ) {
  int N = ( Integer ) input . nextInt ( ) ;
  int M = ( Integer ) input . nextInt ( ) ;
  int [ ] mostNeightborOpponent = new int [ N ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = ( Integer ) input . nextInt ( ) ;
    int b = ( Integer ) input . nextInt ( ) ;
    if ( mostNeightborOpponent [ a - 1 ] > b ) {
      mostNeightborOpponent [ a - 1 ] = ( b ) ;
    }
  }
  int island = 1 ;
  bridgeWillBreak = 0 ;
  List < Integer > sortedOpponent = new ArrayList < Integer > ( mostNeightborOpponent ) ;
  for ( int b = 0 ;
  b < sortedOpponent . size ( ) ;
  b ++ ) {
    int a = sortedOpponent . get ( b ) ;
    if ( a < island ) {
      continue ;
    }
    island = b ;
    if ( island > N ) {
      break ;
    }
    bridgeWillBreak ++ ;
  }
  System . out . println ( bridgeWillBreak ) ;
}
