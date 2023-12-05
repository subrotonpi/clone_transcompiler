public static int [ ] getDigits ( ) {
  int n = Integer . parseInt ( input ) ;
  String s = input . substring ( 0 , n ) ;
  String t = input . substring ( n , n ) ;
  int mod = 10 * 9 + 7 ;
  int [ ] l = new int [ n ] ;
  int k = 0 ;
  int i = 0 ;
  while ( i < n ) {
    if ( s . charAt ( i ) == t . charAt ( i ) ) {
      switch ( k ) {
        case 0 : l [ i ] = 3 ;
        break ;
        case 1 : l [ i ] = 2 ;
        break ;
        default : l [ i ] = 1 ;
        break ;
      }
      k = 1 ;
      i ++ ;
    }
    else {
      switch ( k ) {
        case 0 : l = l . clone ( ) ;
        l [ i ] = 3 ;
        l [ i ] = 2 ;
        break ;
        default : l [ i ] = 1 ;
      }
      k = 2 ;
      i += 2 ;
    }
  }
  int ans = 1 ;
  for ( ;
  i < n ;
  i ++ ) ans *= l [ i ] ;
  System . out . println ( ans % mod ) ;
  return l ;
}
