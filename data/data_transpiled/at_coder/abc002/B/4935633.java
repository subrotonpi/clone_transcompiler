static void print ( String s , String a , String b ) {
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) a += ( b . contains ( s . charAt ( i ) ) ? "" : s . charAt ( i ) ) ;
  System . out . println ( a ) ;
}
