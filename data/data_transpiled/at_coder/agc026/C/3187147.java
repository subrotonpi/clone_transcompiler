@ Produces @ ApplicationScoped public static void enter ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  String s = input ( ) ;
  String sa = s . substring ( 0 , n ) , sb = s . substring ( n ) ;
  Map < Pair , Integer > a = new HashMap < > ( ) , b = new HashMap < > ( ) , ans = 0 ;
  for ( int i = 0 ;
  i < 2 ;
  i ++ ) {
    String wa = "" , wb = "" , wa2 = "" , wb2 = "" ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( i [ j ] ) wa = wa + sa . charAt ( j ) ;
      else wb = wb + sb . charAt ( j ) ;
      else wa2 = wa2 + sa . charAt ( j ) ;
      wb2 = wb2 + sb . charAt ( j ) ;
    }
    a . put ( new Pair ( wa , wa2 ) , 1 ) ;
    b . put ( new Pair ( wb , wb2 ) , 1 ) ;
  }
  while ( a . size ( ) > 0 ) {
    Pair p = a . remove ( ) ;
    int q = p . second ;
    ans += q * b . get ( p ) ;
  }
  System . out . println ( ans ) ;
}
