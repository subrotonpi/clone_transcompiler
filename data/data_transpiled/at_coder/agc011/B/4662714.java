public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  ArrayList < Integer > a = new ArrayList < Integer > ( Collections . nCopies ( n , input ) ) ;
  int tot = Integer . valueOf ( a . size ( ) ) ;
  int cnt = 1 ;
  for ( int i : a ) {
    tot -= i ;
    if ( i > tot * 2 ) break ;
    cnt ++ ;
  }
  System . out . println ( cnt ) ;
}
