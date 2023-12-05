public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int h = Integer . parseInt ( input . nextLine ( ) ) ;
  Map [ ] m = new Map [ h ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    String line = input . nextLine ( ) ;
    for ( int j = 0 ;
    j < n - 1 ;
    j ++ ) {
      if ( line . charAt ( j * 2 + 1 ) == '-' ) {
        m [ i ] . put ( j , j + 1 ) ;
        m [ i ] . put ( j + 1 , j ) ;
      }
    }
  }
  String line = input . nextLine ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( line . charAt ( i * 2 ) == 'o' ) {
      goal = i ;
      break ;
    }
  }
  int pos = goal ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    if ( m [ i ] . containsKey ( pos ) ) {
      pos = m [ i ] . get ( pos ) ;
    }
  }
  System . out . println ( pos + 1 ) ;
}
