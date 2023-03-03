public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int cnt = 0 ;
  ArrayList < Integer > a = new ArrayList < Integer > ( ) ;
  for ( int i = Math . max ( 1 , n - 162 + 1 ) ;
  i <= n ;
  i ++ ) {
    if ( new Integer ( input . charAt ( i ) ) == n - i ) {
      cnt ++ ;
      a . add ( i ) ;
    }
  }
  System . out . println ( cnt ) ;
  for ( int i : a ) {
    System . out . println ( i ) ;
  }
}
