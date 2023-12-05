@ MoreIO public static void main ( String [ ] args ) {
  final int N = ( Integer ) input . split ( " " ) . length ;
  final int M = ( Integer ) input . split ( " " ) . length ;
  final List < List < Integer >> A = new ArrayList < > ( ) ;
  final List < List < Integer >> B = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( Collections . singletonList ( input . nextInt ( ) ) ) ;
  }
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    B . add ( Collections . singletonList ( input . nextInt ( ) ) ) ;
  }
  for ( int i = 0 ;
  i < N - M + 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < N - M + 1 ;
    j ++ ) {
      boolean flag = true ;
      for ( int k = 0 ;
      k < M ;
      k ++ ) {
        for ( int l = 0 ;
        l < M ;
        l ++ ) {
          if ( A . get ( i + k ) . get ( j + l ) != B . get ( k ) . get ( l ) ) {
            flag = false ;
            break ;
          }
        }
      }
      if ( ( flag ) && ( i == N - M + 1 ) ) {
        final String ans = "Yes" ;
        System . out . println ( ans ) ;
        exit ( ) ;
      }
      else {
        final String ans = "No" ;
      }
    }
  }
  System . out . println ( ans ) ;
}
