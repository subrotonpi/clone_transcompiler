@ VisibleForTesting static void binarySearch ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > red = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) red . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  List < Integer > blue = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) blue . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  int ans = 0 ;
  for ( int x = 0 ;
  x < blue . size ( ) ;
  x ++ ) {
    int y = blue . get ( x ) ;
    int i = Integer . parseInt ( red . get ( i ) ) ;
    List < Integer > tmp = new ArrayList < > ( red . subList ( 0 , i ) ) ;
    for ( int xx : tmp ) {
      int yy = y ;
      if ( y > yy ) {
        ans ++ ;
        red . remove ( new Integer ( xx ) ) ;
        break ;
      }
    }
  }
  System . out . println ( ans ) ;
}
