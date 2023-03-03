public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  String [ ] w = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    w [ i ] = String . valueOf ( input ) ;
  }
  String [ ] v = {
    "TAKAHASHIKUN" , "Takahashikun" , "takahashikun" }
    ;
    int ans = 0 ;
    for ( int i = 0 ;
    i < n - 1 ;
    i ++ ) {
      int now = 0 ;
      for ( int j = 0 ;
      j < 3 ;
      j ++ ) {
        if ( w [ i ] . equals ( v [ j ] ) ) {
          now = 1 ;
          break ;
        }
      }
      ans += now ;
    }
    for ( int j = 0 ;
    j < 3 ;
    j ++ ) {
      v [ j ] += "." ;
      if ( w [ n - 1 ] . equals ( v [ j ] ) ) {
        ans ++ ;
        break ;
      }
    }
    System . out . println ( ans ) ;
  }
  