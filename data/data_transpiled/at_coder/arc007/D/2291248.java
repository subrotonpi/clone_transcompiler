public static void print ( String c ) {
  c = input . nextLine ( ) ;
  int n = c . length ( ) ;
  int z = 0 ;
  while ( z < n ) {
    if ( c . charAt ( z ) != '0' ) break ;
    z = z + 1 ;
  }
  int v ;
  if ( z == 0 ) {
    z = 1 ;
    while ( z < n ) {
      if ( c . charAt ( z ) != '0' ) break ;
      z = z + 1 ;
    }
    v = Integer . parseInt ( c . substring ( 0 , z ) ) ;
  }
  else {
    v = Integer . parseInt ( "1" + c . substring ( 0 , z ) ) ;
  }
  if ( z == n ) {
    System . out . println ( v + " " + 1 ) ;
    quit ( ) ;
  }
  for ( int zz = z + 1 ;
  zz < n ;
  zz ++ ) {
    int w = Integer . parseInt ( c . substring ( z , zz ) ) ;
    if ( v < w ) {
      int d = w - v ;
      String r = Integer . toString ( w ) ;
      int m = Math . min ( r . length ( ) , n - s ) ;
      if ( r . substring ( 0 , m ) . equals ( c . substring ( z ) ) ) {
        System . out . println ( v + " " + 1 ) ;
        quit ( ) ;
      }
    }
  }
}
