static void solve ( @ Nonnegative int N ) {
  if ( N == 0 ) {
    System . out . println ( 0 ) ;
    return ;
  }
  String result = "" ;
  int div = 2 ;
  while ( N != 0 ) {
    int divided = N % div ;
    N -= divided ;
    if ( divided != 0 ) result = "1" + result ;
    else result = "0" + result ;
    div *= - 2 ;
  }
  System . out . println ( result ) ;
  return ;
  /* Iterate through the input stream */
  try {
    BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
    String line ;
    while ( ( line = br . readLine ( ) ) != null ) {
      StringTokenizer tokenizer = new StringTokenizer ( line ) ;
      while ( tokenizer . hasMoreTokens ( ) ) {
        result = tokenizer . nextToken ( ) ;
      }
    }
  }
  catch ( IOException e ) {
    e . printStackTrace ( ) ;
  }
  finally {
    System . out . println ( result ) ;
  }
  List < String > tokens = new ArrayList < String > ( ) ;
  N = Integer . parseInt ( ( String ) tokens . get ( 0 ) ) ;
  solve ( N ) ;
  if ( Class . isAnnotationPresent ( Main . class ) ) {
    Main . main ( tokens . toArray ( new String [ tokens . size ( ) ] ) ) ;
  }
}
