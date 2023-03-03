public static String [ ] getN ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  List < String > ans = new ArrayList < String > ( ) ;
  if ( N >= A + B - 1 && N <= A * B ) {
    for ( int i = 0 ;
    i < A ;
    i ++ ) {
      ans . add ( String . valueOf ( N - A + 1 + i ) ) ;
      for ( int j = 0 ;
      j < B - 1 ;
      j ++ ) {
        if ( i * ( B - 1 ) + ( B - 1 - j ) > N - A + B ) {
          continue ;
        }
        ans . add ( String . valueOf ( i * ( B - 1 ) + ( B - 1 - j ) ) ) ;
      }
    }
  }
  else {
    ans = new ArrayList < String > ( ) ;
  }
  return ans . toArray ( new String [ ] {
  }
  ) ;
}
