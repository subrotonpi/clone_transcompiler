public static int [ ] [ ] [ ] S ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  ArrayList < ArrayList < Integer >> S = new ArrayList < > ( ) ;
  ArrayList < ArrayList < Integer >> C = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    S . add ( new ArrayList < > ( a ) ) ;
  }
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int c = Integer . parseInt ( input . nextLine ( ) ) ;
    int d = Integer . parseInt ( input . nextLine ( ) ) ;
    C . add ( new ArrayList < > ( c ) ) ;
    C . add ( new ArrayList < > ( d ) ) ;
  }
  for ( ArrayList < Integer > si : S ) {
    int ans = - 1 ;
    int min_ = 10 * 10 ;
    for ( int i = 0 ;
    i < C . size ( ) ;
    i ++ ) {
      ArrayList < Integer > ci = C . get ( i ) ;
      int ds = Math . abs ( ci . get ( 0 ) - si . get ( 0 ) ) + Math . abs ( ci . get ( 1 ) - si . get ( 1 ) ) ;
      if ( ds < min_ ) {
        min_ = ds ;
        ans = i ;
      }
    }
    System . out . println ( ans + 1 ) ;
  }
  return S . toArray ( new ArrayList < > ( ) ) ;
}
