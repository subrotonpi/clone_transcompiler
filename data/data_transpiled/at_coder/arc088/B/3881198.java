public static void print ( String s ) {
  s = input . nextLine ( ) ;
  s = s . trim ( ) ;
  int length = s . length ( ) ;
  int i = 0 ;
  while ( i < s . length ( ) - 1 ) {
    if ( s . charAt ( i ) != s . charAt ( i + 1 ) ) {
      length = Math . min ( length , Math . max ( i + 1 , s . length ( ) - i - 1 ) ) ;
    }
    i ++ ;
  }
  System . out . println ( length ) ;
}
