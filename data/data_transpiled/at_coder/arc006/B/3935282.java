public static void input ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int L = Integer . parseInt ( input . readLine ( ) ) ;
  StringBuilder sb = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < L + 1 ;
  i ++ ) {
    sb . append ( input . readLine ( ) ) ;
  }
  sb . reverse ( ) ;
  int start = sb . toString ( ) . indexOf ( 'o' ) ;
  for ( int i = 0 ;
  i < L ;
  i ++ ) {
    if ( 0 <= start - 1 && sb . charAt ( i + 1 ) == '-' ) {
      sb . replace ( i , start - 1 , ' ' ) ;
      start -= 2 ;
    }
    else if ( start + 1 <= 2 * N - 2 && sb . charAt ( i + 1 ) == '-' ) {
      sb . replace ( i , start + 1 , ' ' ) ;
      start += 2 ;
    }
  }
  System . out . println ( start / 2 + 1 ) ;
}
