private static void input ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) , m = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] ch = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    ch [ i ] [ 0 ] = 1 ;
    ch [ i ] [ 1 ] = 1 ;
  }
  int ans = 1 ;
  for ( int i = 0 ;
  i < 2 * n ;
  i ++ ) {
    String s = format ( i , "b" ) . replaceAll ( " " , "" ) ;
    boolean key = 1 ;
    for ( int j = 0 ;
    j < n - 1 ;
    j ++ ) {
      for ( int k = j + 1 ;
      k < n ;
      k ++ ) {
        if ( s . charAt ( j ) == '1' && s . charAt ( k ) == '1' && ch [ j ] [ k ] == 0 ) {
          key = 0 ;
        }
      }
    }
    if ( key ) {
      ans = Math . max ( ans , s . indexOf ( "1" ) ) ;
    }
  }
  System . out . println ( ans ) ;
}
