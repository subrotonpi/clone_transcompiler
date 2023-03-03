@ VisibleForTesting static void from ( String input ) {
  int N = Integer . parseInt ( input ) ;
  List < Integer > src = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    src . add ( Integer . parseInt ( input ) ) ;
  }
  Map < Integer , Pair > dic = new TreeMap < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = src . get ( i ) ;
    int m = dic . get ( a ) ;
    int n = dic . get ( a ) ;
    dic . put ( a , new Pair ( Math . min ( m , i ) , n + 1 ) ) ;
  }
  List < Pair > order = new ArrayList < > ( Collections . reverseOrder ( dic . entrySet ( ) ) ) ;
  int [ ] hist = new int [ N ] ;
  while ( true ) {
    int a1 = order . remove ( 0 ) ;
    int m1 = order . get ( m1 ) ;
    int n1 = order . get ( m1 ) ;
    if ( order . isEmpty ( ) ) {
      hist [ m1 ] += n1 * a1 ;
      break ;
    }
    int a2 = order . get ( order . size ( ) - 1 ) ;
    int m2 = order . get ( order . size ( ) - 1 ) ;
    int n2 = order . get ( order . size ( ) - 1 ) ;
    hist [ m1 ] += n1 * ( a1 - a2 ) ;
    order . set ( a2 , new Pair ( Math . min ( m1 , m2 ) , n1 + n2 ) ) ;
  }
  System . out . println ( hist [ 0 ] ) ;
}
