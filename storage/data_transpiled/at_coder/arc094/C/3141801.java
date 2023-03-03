public static int N = Integer . parseInt ( input ) {
  int c = - 1 ;
  int s = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int ai = Integer . parseInt ( input . readLine ( ) ) ;
    int bi = Integer . parseInt ( input . readLine ( ) ) ;
    s += ai ;
    if ( ai > bi ) {
      if ( c == - 1 ) {
        c = bi ;
      }
      if ( bi < c ) {
        c = bi ;
      }
    }
  }
  if ( c == - 1 ) {
    System . out . println ( 0 ) ;
  }
  else {
    System . out . println ( s - c ) ;
  }
  return s ;
}
