public static void input ( Scanner input ) {
  String S = input . next ( ) ;
  String T = input . next ( ) ;
  int t = T . length ( ) ;
  List < Integer > indices = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < S . length ( ) - t + 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < i + t ;
    j ++ ) {
      char s = S . charAt ( i ) ;
      if ( s == '?' ) continue ;
      if ( s != T . charAt ( j ) ) break ;
    }
    else {
      indices . add ( i ) ;
    }
  }
  if ( indices . size ( ) == 0 ) {
    System . out . println ( "UNRESTORABLE" ) ;
  }
  else {
    List < String > cand = new ArrayList < String > ( ) ;
    for ( int ind : indices ) {
      StringBuffer ans = new StringBuffer ( ) ;
      for ( int i = 0 ;
      i < S . length ( ) ;
      i ++ ) {
        char s = S . charAt ( i ) ;
        if ( i == ind ) ans . append ( T ) ;
        else if ( ind < i && i < ind + t ) continue ;
        else if ( s == '?' ) ans . append ( 'a' ) ;
        else ans . append ( s ) ;
      }
      cand . add ( ans . toString ( ) ) ;
    }
    Arrays . sort ( cand ) ;
    System . out . println ( cand . get ( 0 ) ) ;
  }
}
