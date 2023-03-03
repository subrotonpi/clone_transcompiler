public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  float inf = Float . POSITIVE_INFINITY ;
  List < List < Integer >> A = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . set ( i , inf ) ;
  }
  int result = 0 ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      float dist = A . get ( i ) . get ( j ) ;
      for ( List < Integer > _A : A ) {
        if ( dist >= _A . get ( i ) . get ( j ) ) {
          if ( dist > _A . get ( i ) . get ( j ) ) {
            System . out . println ( - 1 ) ;
            exit ( ) ;
          }
          break ;
        }
      }
    }
    else {
      result += dist ;
    }
  }
  System . out . println ( result ) ;
}
