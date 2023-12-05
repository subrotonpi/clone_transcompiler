public static int tc = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
for ( int t = 0 ;
t < tc ;
t ++ ) {
  int b = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
  int n = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
  List < Integer > m = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < b ;
  i ++ ) {
    m . add ( Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ) ;
  }
  int l = - 1 , r = n * Math . min ( m . size ( ) , m . size ( ) ) ;
  int lv = 0 ;
  while ( l + 1 < r ) {
    int c = ( l + r ) / 2 ;
    int v = m . stream ( ) . mapToInt ( a -> c / a + 1 ) . sum ( ) ;
    if ( v < n ) {
      l = c ;
      lv = v ;
    }
    else {
      r = c ;
    }
  }
  int idx = n - lv - 1 ;
  int ans = Lists . newArrayList ( i + 1 ) . stream ( ) . filter ( i -> r % m . get ( i ) == 0 ) . findFirst ( ) . get ( idx ) ;
  System . out . println ( "Case #" + ( t + 1 ) + ": " + ans ) ;
}
return tc ;
}
