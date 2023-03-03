public static void print ( int n , String X ) {
  int [ ] price = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) price [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  String X_bin = format ( X , '0' + n + 'b' ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( X_bin . charAt ( i ) == '1' ) ans += price [ n - 1 - i ] ;
  }
  System . out . println ( ans ) ;
}
