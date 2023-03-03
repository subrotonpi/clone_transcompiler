public static String input ( ) {
  String s = input . nextLine ( ) ;
  String a = "AC" ;
  if ( s . charAt ( 0 ) != 'A' ) {
    a = "WA" ;
  }
  int cnt = 0 ;
  for ( int i = 2 ;
  i < s . length ( ) - 1 ;
  i ++ ) {
    if ( s . charAt ( i ) == 'C' && ( char ) s . charAt ( i ) < 'a' ) {
      a = "WA" ;
    }
  }
  return a ;
}
