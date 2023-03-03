public static void print ( String input ) {
  int k = Integer . parseInt ( input ) ;
  int n = 50 ;
  int a = k / n ;
  int b = k % n ;
  int [ ] res ;
  if ( b == 0 ) {
    res = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      res [ i ] += a ;
    }
  }
  else {
    res = new int [ n + 1 ] ;
    for ( int i = 0 ;
    i < n + 1 ;
    i ++ ) {
      res [ i ] = i ;
    }
  }
  System . out . println ( n ) ;
  String ass = "" ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( i != 0 ) ass += " " ;
    ass += String . valueOf ( res [ i ] ) ;
  }
  System . out . println ( ass ) ;
}
