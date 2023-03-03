public static int [ ] [ ] [ ] map ( String input ) {
  int w = Integer . parseInt ( input ) ;
  int h = Integer . parseInt ( input ) ;
  int n = Integer . parseInt ( input ) ;
  List < List < Integer >> xya = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    xya . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
  }
  int [ ] [ ] m = new int [ w ] [ h ] ;
  for ( int x = 0 ;
  x < xya . size ( ) ;
  x ++ ) {
    int y = xya . get ( x ) ;
    int a = xya . get ( y ) ;
    if ( a == 1 ) {
      for ( int i = 0 ;
      i < h ;
      i ++ ) {
        for ( int j = 0 ;
        j < x ;
        j ++ ) {
          m [ i ] [ j ] = 1 ;
        }
      }
    }
    else if ( a == 2 ) {
      for ( int i = 0 ;
      i < h ;
      i ++ ) {
        for ( int j = 0 ;
        j < w ;
        j ++ ) {
          m [ i ] [ j ] = 1 ;
        }
      }
    }
    else {
      for ( int i = 0 ;
      i < w ;
      i ++ ) {
        m [ i ] [ i ] [ j ] = 1 ;
      }
    }
  }
  int ans = 0 ;
  for ( int i : m ) {
    ans += m [ i ] . count ( 0 ) ;
  }
  System . out . println ( ans ) ;
  return m ;
}
