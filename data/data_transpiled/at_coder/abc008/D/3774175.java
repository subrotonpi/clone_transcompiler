public static int w = Integer . parseInt ( input ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > device = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    device . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  Map < Integer , Integer > map = new HashMap < > ( ) ;
  {
    int i = 0 ;
    int j = 0 ;
    int k = 0 ;
    int l = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( ( i & 1 ) != 0 ) {
        return map . get ( ( i & 1 ) ) ;
      }
    }
    int v = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int x = device . get ( i ) ;
      int y = device . get ( j ) ;
      x -- ;
      y -- ;
      if ( i <= x && x <= k && j <= y && y <= l ) {
        v = Math . max ( v , ( k - i + 1 ) + ( l - j + 1 ) - 1 ) + f ( i , j , x - 1 , y - 1 ) + f ( i , y , k , l ) ;
      }
    }
    map . put ( ( i & 1 ) , v ) ;
    return v ;
  }
}
