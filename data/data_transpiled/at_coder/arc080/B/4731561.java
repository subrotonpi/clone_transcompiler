public static void print ( String input ) {
  int h = Integer . parseInt ( input ) ;
  int w = Integer . parseInt ( input ) ;
  int n = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  int p = 1 ;
  int k = 0 ;
  int s = 0 ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    String c = "" ;
    for ( int j = w * ( i % 2 ) - i % 2 ;
    j <= w * ( 1 - i % 2 ) - i % 2 ;
    j += ( i % 2 == 0 ? 1 : - 1 ) ) {
      if ( i % 2 == 1 ) {
        c = String . valueOf ( p ) + " " + c ;
      }
      else {
        c += String . valueOf ( p ) + " " ;
      }
      k ++ ;
      if ( a [ p - 1 ] == k ) {
        p ++ ;
        k = 0 ;
      }
    }
  }
  System . out . println ( c . substring ( 0 , c . length ( ) - 1 ) ) ;
}
