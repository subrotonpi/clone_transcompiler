public static void print ( int n , int l ) {
  String [ ] s = new String [ l ] ;
  for ( int i = 0 ;
  i < l ;
  i ++ ) s [ i ] = input . next ( ) ;
  char y = input . charAt ( 0 ) ;
  int goal = 0 ;
  while ( y -- != 0 && y = y ) goal += 2 ;
  goal /= 2 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int now = i ;
    for ( String ss : s ) {
      if ( now != 0 && ss . charAt ( 2 * now - 1 ) == '-' ) now -- ;
      else if ( now != n - 1 && ss . charAt ( 2 * now + 1 ) == '-' ) now ++ ;
    }
    if ( now == goal ) {
      System . out . println ( i + 1 ) ;
      exit ( ) ;
    }
  }
}
