public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  HashMap < Integer , Integer > r = new HashMap < Integer , Integer > ( ) ;
  HashMap < Integer , Integer > b = new HashMap < Integer , Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = Integer . parseInt ( input ) ;
    int y = Integer . parseInt ( input ) ;
    r . put ( x , y ) ;
  }
  r . clear ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = Integer . parseInt ( input ) ;
    int y = Integer . parseInt ( input ) ;
    b . put ( x , y ) ;
  }
  b . clear ( ) ;
  b . putAll ( r ) ;
  int ans = 0 ;
  for ( Map . Entry v1 : b . entrySet ( ) ) {
    int x1 = v1 . getKey ( ) ;
    int y1 = v1 . getValue ( ) ;
    int rmax = - 1 ;
    int i = 0 ;
    for ( Map . Entry v2 : r . entrySet ( ) ) {
      int x2 = v2 . getKey ( ) ;
      int y2 = v2 . getValue ( ) ;
      if ( x2 >= x1 ) {
        break ;
      }
      else if ( y2 < y1 && rmax < y2 ) {
        rmax = y2 ;
        delk = i ;
      }
      i ++ ;
    }
    if ( rmax != - 1 ) {
      r . remove ( delk ) ;
      ans ++ ;
    }
  }
  System . out . println ( ans ) ;
}
