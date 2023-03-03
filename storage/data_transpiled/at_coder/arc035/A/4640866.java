public static String s ( ) {
  String S = s . substring ( 0 , s . length ( ) - 1 ) ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    switch ( S . charAt ( i ) ) {
      case '*' : break ;
      default : {
        System . out . println ( "NO" ) ;
        exit ( ) ;
      }
    }
  }
  System . out . println ( "YES" ) ;
  return S ;
}
