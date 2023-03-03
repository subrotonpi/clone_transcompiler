static final int [ ] [ ] solve ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int M = Integer . parseInt ( input . readLine ( ) ) ;
  List < List < Integer >> a = new ArrayList < > ( ) ;
  for ( int l : System . console ( ) . split ( " " ) ) a . add ( Collections . singletonList ( Integer . parseInt ( l . readLine ( ) ) ) ) ;
  int [ ] [ ] result = new int [ M ] [ N ] ;
  for ( int y = 1 ;
  y < N - 1 ;
  y ++ ) {
    for ( int x = 1 ;
    x < M - 1 ;
    x ++ ) {
      int v = Math . min ( a . get ( y - 1 ) . get ( x ) , a . get ( x + 1 ) . get ( x ) ) ;
      a . get ( y + 1 ) . get ( x ) . get ( x ) . get ( y ) ;
    }
    result [ y ] [ x ] = v ;
  }
  return result ;
}
