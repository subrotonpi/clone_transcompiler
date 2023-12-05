public static void input ( ) {
  String a = input . nextLine ( ) ;
  int b = Integer . parseInt ( a ) ;
  String s = ( 9 - a . length ( ) ) * '0' + a ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < 9 ;
  i ++ ) {
    if ( s . charAt ( i ) == '0' && ans == 0 ) {
      continue ;
    }
    ans += ( b / ( ( 10 * ( 8 - i ) ) * 10 ) ) * ( 10 * ( 8 - i ) ) ;
    int c = ( b % ( ( 10 * ( 8 - i ) ) * 10 ) ) + 1 ;
    if ( 2 * ( 10 * ( 8 - i ) ) >= c > 10 * ( 8 - i ) ) {
      ans += c - 10 * ( 8 - i ) ;
    }
    else if ( c >= 2 * 10 * ( 10 - i ) ) {
      ans += 10 * ( 8 - i ) ;
    }
  }
  System . out . println ( ans ) ;
}
