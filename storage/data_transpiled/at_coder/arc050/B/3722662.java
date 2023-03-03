public static void main ( String [ ] args ) {
  if ( __name__ . equals ( "main" ) ) {
    int R = Integer . parseInt ( input . nextLine ( ) ) ;
    int B = Integer . parseInt ( input . nextLine ( ) ) ;
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    int ans = 0 ;
    ans = Math . max ( ans , Math . min ( R / x , B ) ) ;
    ans = Math . max ( ans , Math . min ( R , B / y ) ) ;
    if ( R * y - B >= 0 ) {
      int k = ( R * y - B ) / ( x * y - 1 ) ;
      int l = Math . min ( R - k * x , ( B - k ) / y ) ;
      if ( l >= 0 ) ans = Math . max ( ans , k + l ) ;
      k ++ ;
      l = Math . min ( R - k * x , ( B - k ) / y ) ;
      if ( l >= 0 ) ans = Math . max ( ans , k + l ) ;
    }
    System . out . println ( ans ) ;
  }
}
