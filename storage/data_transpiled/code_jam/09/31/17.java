static void solve ( int testCase , String input ) {
  final HashMap < Character , Integer > countmap = new HashMap < Character , Integer > ( ) ;
  for ( char c : Collections . list ( input . toCharArray ( ) ) ) {
    if ( ! c == '-' ) {
      countmap . put ( c , 1 ) ;
    }
    else {
      countmap . put ( c , ++ testCase ) ;
    }
  }
  int base = countmap . size ( ) ;
  if ( base < 2 ) {
    base = 2 ;
  }
  final HashMap < Character , Integer > values = new HashMap < Character , Integer > ( ) ;
  int value = 0 ;
  int mult = base * ( input . length ( ) - 1 ) ;
  int result = 0 ;
  values . put ( input . charAt ( 0 ) , 1 ) ;
  for ( int i = 0 ;
  i < input . length ( ) ;
  i ++ ) {
    char c = input . charAt ( i ) ;
    if ( ! values . containsKey ( c ) ) {
      values . put ( c , value ++ ) ;
      if ( value == 1 ) {
        value = 2 ;
      }
    }
    result += mult * values . get ( c ) ;
    mult /= base ;
  }
  System . out . println ( "Case #" + testCase + ": " + result ) ;
}
