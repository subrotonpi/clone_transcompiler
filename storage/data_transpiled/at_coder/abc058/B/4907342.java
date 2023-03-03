public static void input ( ) {
  String o = input ( ) ;
  String e = input ( ) ;
  StringBuffer ans = new StringBuffer ( ) ;
  for ( int i = 0 ;
  i < Math . min ( o . length ( ) , e . length ( ) ) ;
  i ++ ) {
    ans . append ( o . charAt ( i ) ) ;
    ans . append ( e . charAt ( i ) ) ;
  }
  if ( o . length ( ) > e . length ( ) ) {
    ans . append ( o . charAt ( e . length ( ) - 1 ) ) ;
  }
  System . out . println ( ans ) ;
}
