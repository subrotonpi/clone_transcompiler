public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > A = new ArrayList < > ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  List < Integer > B = new ArrayList < > ( ) ;
  int mod = 10 * 9 + 7 ;
  if ( N % 2 == 0 ) {
    for ( int i = 1 ;
    i < N ;
    i += 2 ) {
      B . add ( i ) ;
      B . add ( i ) ;
    }
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( A . get ( i ) != B . get ( i ) ) {
        System . out . println ( 0 ) ;
        exit ( ) ;
      }
    }
    System . out . println ( 2 * ( N / 2 ) % mod ) ;
  }
  else {
    B . add ( 0 ) ;
    for ( int i = 2 ;
    i < N ;
    i += 2 ) {
      B . add ( i ) ;
      B . add ( i ) ;
    }
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( A . get ( i ) != B . get ( i ) ) {
        System . out . println ( 0 ) ;
        exit ( ) ;
      }
    }
    System . out . println ( 2 * ( ( N - 1 ) / 2 ) % mod ) ;
  }
}
