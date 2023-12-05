public static int [ ] [ ] readInput ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int l = input . readInt ( ) ;
  int [ ] [ ] v = new int [ l ] [ n ] ;
  for ( int i = 0 ;
  i < l ;
  i ++ ) {
    String s = input . readLine ( ) ;
    for ( int j = 0 ;
    j < n - 1 ;
    j ++ ) {
      if ( s . charAt ( j * 2 + 1 ) == '-' ) {
        v [ i ] [ j ] = j + 1 ;
        v [ i ] [ j + 1 ] = j ;
      }
    }
  }
  int y = 0 ;
  String s = input . readLine ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( s . charAt ( i * 2 ) == 'o' ) {
      y = i ;
    }
  }
  return v ;
}
