public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    A . add ( i , i ) ;
  }
  A . add ( 0 , 0 ) ;
  A . add ( 0 , 0 ) ;
  int cost = 0 ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    cost += Math . abs ( A . get ( i + 1 ) - A . get ( i ) ) ;
  }
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    int sub ;
    if ( A . get ( i - 1 ) <= A . get ( i ) && A . get ( i ) <= A . get ( i + 1 ) || A . get ( i + 1 ) <= A . get ( i ) && A . get ( i ) <= A . get ( i - 1 ) ) {
      sub = 0 ;
    }
    else if ( A . get ( i - 1 ) <= A . get ( i + 1 ) && A . get ( i ) <= A . get ( i ) ) {
      sub = 2 * ( A . get ( i ) - A . get ( i + 1 ) ) ;
    }
    else if ( A . get ( i ) <= A . get ( i - 1 ) && A . get ( i + 1 ) <= A . get ( i ) ) {
      sub = 2 * ( A . get ( i - 1 ) - A . get ( i ) ) ;
    }
    else if ( A . get ( i ) <= A . get ( i + 1 ) && A . get ( i ) <= A . get ( i ) ) {
      sub = 2 * ( A . get ( i ) - A . get ( i ) ) ;
    }
    else if ( A . get ( i ) <= A . get ( i + 1 ) && A . get ( i ) <= A . get ( i ) ) {
      sub = 2 * ( A . get ( i + 1 ) - A . get ( i ) ) ;
    }
  }
  System . out . println ( cost - sub ) ;
}
