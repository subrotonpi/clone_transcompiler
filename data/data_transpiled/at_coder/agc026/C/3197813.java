@ VisibleForTesting static void input ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  String s = input . nextLine ( ) ;
  String sa = s . substring ( 0 , n ) , sb = s . substring ( n ) ;
  TreeMap < Pair < String , Integer > , Integer > a = new TreeMap < > ( ) , b = new TreeMap < > ( ) , ans = 0 ;
  for ( boolean [ ] p : new boolean [ 2 ] ) {
    String word_a_1 = "" , word_b_1 = "" , word_a_2 = "" , word_b_2 = "" ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( p [ j ] ) {
        word_a_1 += sa . charAt ( j ) ;
        word_b_1 += sb . charAt ( j ) ;
      }
      else {
        word_a_2 += sa . charAt ( j ) ;
        word_b_2 += sb . charAt ( j ) ;
      }
    }
    a . put ( new Pair < > ( word_a_1 , word_a_2 ) , 1 ) ;
    b . put ( new Pair < > ( word_b_1 , word_b_2 ) , 1 ) ;
  }
  while ( a . size ( ) > 0 ) {
    Pair < String , Integer > key = a . pollFirst ( ) ;
    int value = key . value ;
    ans += value * b . get ( key ) ;
  }
  System . out . println ( ans ) ;
}
