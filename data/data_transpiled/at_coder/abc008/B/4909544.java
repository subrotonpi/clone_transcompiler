public static void print ( int n ) {
  String [ ] s = new String [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) s [ i ] = input . next ( ) ;
  String [ ] name = new String [ s . length ] ;
  Arrays . sort ( name ) ;
  int [ ] count = new int [ name . length ] ;
  for ( int i = 0 ;
  i < count . length ;
  i ++ ) {
    count [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < count . length ;
  i ++ ) {
    if ( s [ i ] . equals ( name [ i ] ) ) {
      count [ i ] ++ ;
      break ;
    }
  }
  int ans = 0 ;
  System . out . println ( name [ ans ] ) ;
}
