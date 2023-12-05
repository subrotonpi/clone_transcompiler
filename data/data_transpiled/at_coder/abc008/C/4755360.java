public static void input ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] num = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    num [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < num . length ;
  i ++ ) {
    int yakusu = 0 ;
    for ( int j = 0 ;
    j < num . length ;
    j ++ ) {
      if ( num [ i ] % num [ j ] == 0 ) yakusu ++ ;
    }
    ans += ( ( yakusu + 1 ) / 2 ) / yakusu ;
  }
  System . out . println ( ans ) ;
}
