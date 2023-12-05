public static void main ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > XY = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    XY . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < N - 2 ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < N - 1 ;
    j ++ ) {
      for ( int k = j + 1 ;
      k < N ;
      k ++ ) {
        int x1 = XY . get ( i ) ;
        int y1 = XY . get ( j ) ;
        int x2 = XY . get ( j ) ;
        int y2 = XY . get ( k ) ;
        int x3 = XY . get ( k ) ;
        int y3 = XY . get ( k ) ;
        int area = Math . abs ( ( x2 - x1 ) * ( y3 - y1 ) - ( x3 - x1 ) * ( y2 - y1 ) ) ;
        if ( area > 0 && area % 2 == 0 ) ans ++ ;
      }
    }
  }
  System . out . println ( ans ) ;
}
