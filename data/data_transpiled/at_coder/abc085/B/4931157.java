public static void print ( int N ) {
  N = Integer . parseInt ( input ( ) ) ;
  d = new HashMap < > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) d . put ( i , Integer . parseInt ( input ( ) ) ) ;
  System . out . println ( d . size ( ) ) ;
}
