public static void print ( int n ) {
  int [ ] l = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) l [ i ] = Integer . parseInt ( input ( ) ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ans = ans - l [ i ] . intValue ( ) + l [ i ] . intValue ( ) + 1 ;
  }
  System . out . println ( ans ) ;
}
