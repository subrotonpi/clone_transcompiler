public static String input ( ) {
  String O = input ( ) ;
  String E = input ( ) ;
  String ans = "" ;
  if ( O . length ( ) == E . length ( ) ) {
    for ( int i = 0 ;
    i < O . length ( ) ;
    i ++ ) {
      ans += O . charAt ( i ) ;
      ans += E . charAt ( i ) ;
    }
    System . out . println ( ans ) ;
  }
  else {
    for ( int i = 0 ;
    i < E . length ( ) ;
    i ++ ) {
      ans += O . charAt ( i ) ;
      ans += E . charAt ( i ) ;
    }
    ans += O . charAt ( O . length ( ) - 1 ) ;
    System . out . println ( ans ) ;
  }
  return ans ;
}
