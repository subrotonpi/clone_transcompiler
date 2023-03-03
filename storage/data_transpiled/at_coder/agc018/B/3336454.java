@ VisibleForTesting static void main ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> A = new ArrayList < > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( Collections . singletonList ( input . nextLine ( ) ) ) ;
  }
  List < Integer > V = new ArrayList < > ( M + 1 ) ;
  int ans = N ;
  for ( int i = 0 ;
  i < M - 1 ;
  i ++ ) {
    List < Integer > W = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      do {
        if ( V . get ( A . get ( i ) . intValue ( ) ) == 1 ) {
          W . add ( A . get ( i ) . intValue ( ) ) ;
          break ;
        }
        else {
          A . get ( i ) . intValue ( ) ;
        }
      }
      while ( true ) ;
    }
    int a = W . get ( 0 ) ;
    int c = W . get ( 1 ) ;
    ans = Math . min ( ans , c ) ;
    V . set ( a , 0 ) ;
  }
  System . out . println ( ans ) ;
}
