public static int s ( ) {
  int s = Integer . parseInt ( input . nextLine ( ) ) ;
  LinkedList < Integer > sl = new LinkedList < Integer > ( ) ;
  boolean lflg = true ;
  sl . add ( s ) ;
  int cnt = 1 ;
  while ( ( lflg ) && ( cnt < sl . size ( ) ) ) {
    cnt ++ ;
    if ( s % 2 == 0 ) s = ( int ) ( s / 2 ) ;
    else s = 3 * s + 1 ;
    for ( int i = 0 ;
    i < sl . size ( ) ;
    i ++ ) {
      if ( s == sl . get ( i ) ) {
        System . out . println ( cnt ) ;
        lflg = false ;
        break ;
      }
    }
    sl . add ( s ) ;
  }
  return cnt ;
}
