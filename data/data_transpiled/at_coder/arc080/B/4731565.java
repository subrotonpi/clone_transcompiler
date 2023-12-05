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
    for ( int j = 0 ;
    j < w ;
    j ++ ) {
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
    else {
      System . out . println ( c . substring ( 0 , c . length ( ) - 1 ) ) ;
    }
  }
}
