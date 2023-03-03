public static void input ( ) {
  String s = input . readLine ( ) ;
  boolean flag = true ;
  if ( s . charAt ( 0 ) != 'A' ) flag = false ;
  if ( ! s . substring ( 2 , s . length ( ) - 1 ) . contains ( "C" ) ) flag = false ;
  int count = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( Character . isLowerCase ( s . charAt ( i ) ) ) count ++ ;
  }
  if ( s . length ( ) - count != 2 ) flag = false ;
  if ( flag ) System . out . println ( "AC" ) ;
  else System . out . println ( "WA" ) ;
}
