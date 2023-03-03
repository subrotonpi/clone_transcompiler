public static String print ( ) {
  String s = input . toString ( ) ;
  String ans = "" ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i += 1 ) {
    if ( s . charAt ( i ) == '1' || s . charAt ( i ) == '0' ) {
      ans += s . charAt ( i ) ;
    }
    else {
      ans = ans . substring ( 0 , ans . length ( ) - 1 ) ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
