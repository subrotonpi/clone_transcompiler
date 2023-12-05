public static int [ ] [ ] scan ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int room [ ] = new int [ n + 1 ] ;
  List < Student > students = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int s = Integer . parseInt ( input ) ;
    int t = Integer . parseInt ( input ) ;
    room [ s - 1 ] ++ ;
    room [ t ] -- ;
    students . add ( new Student ( s , t ) ) ;
  }
  int s = room [ 0 ] ;
  room [ 0 ] = s < 2 ? 0 : 1 ;
  for ( int i = 1 ;
  i < 1 + n ;
  i ++ ) {
    s += room [ i ] ;
    room [ i ] = s < 2 ? 0 : 1 + room [ i - 1 ] ;
  }
  List < Integer > ans = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < students . size ( ) ;
  i ++ ) {
    Student student = students . get ( i ) ;
    int s = student . s ;
    int t = student . t ;
    if ( room [ t - 1 ] - room [ s - 2 ] == t - s + 1 ) ans . add ( i + 1 ) ;
  }
  System . out . println ( ans . size ( ) ) ;
  for ( int a : ans ) {
    System . out . println ( a ) ;
  }
  return ans . toArray ( new Integer [ ans . size ( ) ] [ ] ) ;
}
