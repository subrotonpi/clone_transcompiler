public static void main ( String [ ] args ) {
  String s = input ( ) ;
  int n = s . length ( ) ;
  HashMap < Character , Integer > di = new HashMap < Character , Integer > ( ) ;
  for ( char c : s . toCharArray ( ) ) {
    if ( ! di . containsKey ( c ) ) {
      di . put ( c , 0 ) ;
    }
    di . get ( c ) ++ ;
  }
  int nEven = 0 ;
  ArrayList < Integer > odds = new ArrayList < Integer > ( ) ;
  for ( char c : di . keySet ( ) ) {
    if ( di . get ( c ) % 2 == 0 ) {
      nEven += di . get ( c ) ;
    }
    else {
      odds . add ( di . get ( c ) ) ;
    }
  }
  if ( odds . size ( ) == 0 ) {
    System . out . println ( nEven ) ;
  }
  else {
    int k = odds . size ( ) ;
    System . out . println ( 2 * ( ( n - k ) / ( 2 * k ) ) + 1 ) ;
  }
}
