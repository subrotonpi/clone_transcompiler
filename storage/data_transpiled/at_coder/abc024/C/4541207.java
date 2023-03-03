public static int N = Integer . parseInt ( input ) {
  int D = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  LinkedList < LinkedList < Integer >> X = new LinkedList < LinkedList < Integer >> ( ) ;
  for ( int i = 0 ;
  i < D ;
  i ++ ) {
    X . add ( new LinkedList < Integer > ( ) ) ;
  }
  for ( int j = 0 ;
  j < K ;
  j ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( x < y ) {
      int k = 0 ;
      while ( true ) {
        if ( X . get ( k ) . x <= x && x <= X . get ( k ) . y ) {
          if ( y > X . get ( k ) . y ) {
            x = X . get ( k ) . y ;
          }
          else {
            System . out . println ( k + 1 ) ;
            break ;
          }
        }
        k ++ ;
      }
    }
    else {
      int k = 0 ;
      while ( true ) {
        if ( X . get ( k ) . x <= x && x <= X . get ( k ) . y ) {
          if ( y < X . get ( k ) . x ) {
            x = X . get ( k ) . x ;
          }
          else {
            System . out . println ( k + 1 ) ;
            break ;
          }
        }
        k ++ ;
      }
    }
  }
  return N ;
}
