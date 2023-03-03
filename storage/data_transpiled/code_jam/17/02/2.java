public static void main ( String input ) {
  int tnum = Integer . parseInt ( input ) ;
  for ( int ti = 0 ;
  ti < tnum ;
  ti ++ ) {
    String s = String . valueOf ( Integer . parseInt ( input ) + 1 ) ;
    for ( int i = 0 ;
    i < s . length ( ) ;
    i ++ ) {
      if ( i > 0 && Integer . parseInt ( s . charAt ( i ) ) < Integer . parseInt ( s . charAt ( i - 1 ) ) ) break ;
      if ( s . charAt ( i ) != '0' && ( i == 0 || Integer . parseInt ( s . charAt ( i ) ) > Integer . parseInt ( s . charAt ( i - 1 ) ) ) ) {
        ans = s . substring ( 0 , i ) + Integer . toString ( Integer . parseInt ( s . charAt ( i ) ) - 1 ) + '9' * s . substring ( i + 1 ) . length ( ) ;
      }
    }
    while ( ans . charAt ( 0 ) == '0' ) ans = ans . substring ( 1 ) ;
    System . out . println ( "Case #" + ( ti + 1 ) + ": " + ans ) ;
  }
}
