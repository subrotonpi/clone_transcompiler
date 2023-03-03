public static void print ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < String > [ ] s = new List [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    s [ i ] = new LinkedList < String > ( ) ;
  }
  int ans = 0 ;
  int i = 0 ;
  while ( i < n ) {
    boolean flag = true ;
    int r = n - 1 ;
    while ( s [ i ] . get ( r ) == 'o' ) {
      r -- ;
      if ( r < 0 ) {
        flag = false ;
        break ;
      }
    }
    if ( flag ) {
      ans ++ ;
      if ( i == n - 1 ) break ;
      for ( int j = r ;
      j < n ;
      j ++ ) s [ i + 1 ] . set ( j , "o" ) ;
    }
    i ++ ;
  }
  System . out . println ( ans ) ;
}
