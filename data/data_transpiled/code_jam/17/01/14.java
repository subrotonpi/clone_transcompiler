public static void for ( final int i = 0 ;
i < Integer . parseInt ( input . nextLine ( ) ) ;
) {
  String x = input . nextLine ( ) ;
  String y = input . nextLine ( ) ;
  int len = x . length ( ) ;
  int y = Integer . parseInt ( y ) ;
  int cnt = 0 ;
  for ( int i = 0 ;
  i < len - y + 1 ;
  i ++ ) {
    if ( x . charAt ( i ) == '-' ) {
      for ( int j = i ;
      j <= i + y ;
      j ++ ) {
        if ( x . charAt ( j ) == '-' ) x . charAt ( j ) = '+' ;
        else x . charAt ( j ) = '-' ;
        cnt ++ ;
      }
    }
  }
  for ( int j = 0 ;
  j < len ;
  j ++ ) {
    if ( x . charAt ( j ) == '-' ) cnt = - 1 ;
  }
  if ( cnt != - 1 ) System . out . println ( "Case #" + ( i + 1 ) + ": " + cnt ) ;
  else System . out . println ( "Case #" + ( i + 1 ) + ": IMPOSSIBLE" ) ;
}
