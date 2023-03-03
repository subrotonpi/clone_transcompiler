public static String toString ( ) {
  String s = input . toString ( ) ;
  String ans = "" ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i += 1 ) {
    switch ( s . charAt ( i ) ) {
      case '0' : ans += "0" ;
      break ;
      case '1' : ans += "1" ;
      break ;
      case 'B' : ans = ans . substring ( 0 , ans . length ( ) - 1 ) ;
      break ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
