public static void print ( int n ) {
  String s = ".........." ;
  int cnt = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String l = s ;
    s = input . next ( ) ;
    for ( int j = 0 ;
    j < 9 ;
    j ++ ) {
      if ( s . charAt ( j ) == 'x' || ( s . charAt ( j ) == 'o' && l . charAt ( j ) != 'o' ) ) {
        cnt ++ ;
      }
    }
  }
  System . out . println ( cnt ) ;
}
