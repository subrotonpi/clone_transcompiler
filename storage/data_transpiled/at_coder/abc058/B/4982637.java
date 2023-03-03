public static String print ( String o ) {
  String e = input . next ( ) ;
  StringBuilder ans = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < o . length ( ) ;
  i ++ ) {
    ans . append ( o . charAt ( i ) ) ;
    if ( i < o . length ( ) - 1 ) {
      ans . append ( e . charAt ( i ) ) ;
    }
    else {
      if ( e . length ( ) == o . length ( ) ) {
        ans . append ( e . charAt ( i ) ) ;
      }
    }
  }
  return ans . toString ( ) ;
}
