public static void print ( String input ) {
  int h = Integer . parseInt ( input . substring ( 0 , h ) ) ;
  int w = Integer . parseInt ( input . substring ( w , h ) ) ;
  List < List < String >> s = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    s . add ( new LinkedList < > ( ) ) ;
  }
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    for ( int j = 0 ;
    j < w ;
    j ++ ) {
      if ( s . get ( i ) . get ( j ) . equals ( "#" ) ) {
        continue ;
      }
      int cnt = 0 ;
      for ( int dx = - 1 ;
      dx <= 0 ;
      dx += 1 ) {
        for ( int dy = - 1 ;
        dy <= 0 ;
        dy += 1 ) {
          if ( ! ( 0 <= dx + i && dx + i <= h - 1 && 0 <= dy + j && dy + j <= w - 1 ) ) {
            continue ;
          }
          if ( s . get ( i + dx ) . get ( j + dy ) . equals ( "#" ) ) {
            cnt ++ ;
          }
        }
      }
      s . set ( i , j , String . valueOf ( cnt ) ) ;
    }
  }
  for ( List < String > m : s ) {
    System . out . println ( m . toString ( ) ) ;
  }
}
