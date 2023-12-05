@ Function public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( i ) ;
  }
  A = Ordering . natural ( ) . sortedCopy ( A ) ;
  Map < Integer , Integer > D = new TreeMap < > ( ) ;
  for ( int i : A ) {
    D . put ( i , i + 1 ) ;
  }
  List < Integer > d = new ArrayList < > ( ) ;
  for ( int i : D . keySet ( ) ) {
    d . add ( D . get ( i ) ) ;
  }
  int ans = N ;
  int n = d . size ( ) ;
  if ( ( N - n ) % 2 == 0 ) {
    System . out . println ( n ) ;
  }
  else {
    System . out . println ( n - 1 ) ;
  }
}
