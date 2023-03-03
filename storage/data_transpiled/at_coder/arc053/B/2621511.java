public static void print ( String S ) {
  int i ;
  int [ ] S = new int [ S . length ] ;
  for ( i = 0 ;
  i < S . length ;
  i ++ ) {
    if ( S [ i ] != 0 ) {
      S [ i ] ++ ;
    }
    else {
      S [ i ] = 1 ;
    }
  }
  List < Integer > l = new ArrayList < Integer > ( ) ;
  int o = 0 ;
  int e = 0 ;
  for ( i = 0 ;
  i < S . length ;
  i ++ ) {
    l . add ( S [ i ] ) ;
    o += S [ i ] % 2 ;
    e += S [ i ] / 2 ;
  }
  Collections . sort ( l ) ;
  if ( o == 0 ) {
    System . out . println ( e * 2 ) ;
  }
  else {
    System . out . println ( ( e / o ) * 2 + 1 ) ;
  }
}
