@ VisibleForTesting static void input ( ) {
  List < Integer > A = list ( input ) ;
  int N = A . size ( ) ;
  Map < Integer , Integer > D = new TreeMap < > ( ) ;
  for ( int i : A ) {
    D . put ( i , 1 ) ;
  }
  int ans = 1 + ( int ) ( N * ( N - 1 ) / 2 ) ;
  for ( int i : D . keySet ( ) ) {
    ans -= ( int ) ( D . get ( i ) * ( D . get ( i ) - 1 ) / 2 ) ;
  }
  System . out . println ( ans ) ;
}
