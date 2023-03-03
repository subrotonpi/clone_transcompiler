public static void main ( String input ) {
  int N = Integer . parseInt ( input . split ( " " ) [ 0 ] ) ;
  int R = Integer . parseInt ( input . split ( " " ) [ 1 ] ) ;
  LinkedList < String > S = new LinkedList < String > ( ) ;
  int Last = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( S . get ( N - 1 - i ) . equals ( "." ) ) {
      Last = N - 1 - i ;
      break ;
    }
  }
  if ( S . size ( ) == 0 ) {
    System . out . println ( 0 ) ;
    exit ( ) ;
  }
  else if ( Last - ( R - 1 ) <= 0 ) {
    System . out . println ( 1 ) ;
    exit ( ) ;
  }
  else {
    int Shot = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( S . size ( ) == 0 ) {
        break ;
      }
      else if ( S . get ( i ) . equals ( "." ) ) {
        Shot ++ ;
        for ( int j = i ;
        j < i + R ;
        j ++ ) {
          if ( j > N - 1 ) {
          }
          else {
            S . set ( j , "o" ) ;
          }
        }
      }
    }
    System . out . println ( Shot + Last - ( R - 1 ) ) ;
  }
}
