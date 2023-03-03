public static String input ( ) {
  String O = input ( ) , E = input ( ) ;
  StringBuffer ans = new StringBuffer ( ) ;
  if ( O . length ( ) == E . length ( ) ) {
    for ( int i = 0 ;
    i < O . length ( ) ;
    i ++ ) {
      ans . append ( O . charAt ( i ) ) ;
      ans . append ( E . charAt ( i ) ) ;
    }
  }
  else {
    ans . append ( O . charAt ( O . length ( ) - 1 ) ) ;
  }
  return ans . toString ( ) ;
}
