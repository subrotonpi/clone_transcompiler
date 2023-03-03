public static void input ( ) {
  String s = input . readLine ( ) ;
  for ( int i = 0 ;
  i < 2 * 3 ;
  i ++ ) {
    String b = Integer . toBinaryString ( i ) . substring ( 2 ) . toUpperCase ( ) ;
    String a = s . substring ( 0 , 1 ) ;
    for ( int j = 0 ;
    j < 3 ;
    j ++ ) a += ( b . charAt ( j ) == '0' ? "+" : "-" ) + s . charAt ( j + 1 ) ;
    if ( new Integer ( a ) . intValue ( ) == 7 ) System . out . println ( a + "=7" ) ;
    exit ( ) ;
  }
}
