public static String input ( ) {
  String O = input ( ) ;
  String E = input ( ) ;
  StringBuffer ans = new StringBuffer ( ) ;
  for ( int i = 0 ;
  i < O . length ( ) ;
  i ++ ) {
    ans . append ( O . substring ( i , i + 1 ) + E . substring ( i , i + 1 ) ) ;
  }
  System . out . println ( ans ) ;
  return ans . toString ( ) ;
}
