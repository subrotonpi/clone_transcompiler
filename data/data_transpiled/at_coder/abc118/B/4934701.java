public static int [ ] [ ] map ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int [ ] count = new int [ m ] ;
  int ans = 0 ;
  List < List < Integer >> arr = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    arr . add ( Collections . singletonList ( i ) ) ;
    for ( int j = 1 ;
    j <= arr . get ( i ) ;
    j ++ ) {
      count [ arr . get ( i ) - 1 ] ++ ;
    }
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    if ( count [ i ] == n ) ans ++ ;
  }
  return ans ;
}
