public static void print ( int N ) {
  int N = Integer . parseInt ( input ( ) ) ;
  List < Integer > li = new ArrayList < > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    li . add ( Collections . singletonList ( Integer . parseInt ( input ( ) ) ) ) ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ans += li . get ( i ) [ 1 ] - li . get ( i ) [ 0 ] + 1 ;
  }
  System . out . println ( ans ) ;
}
