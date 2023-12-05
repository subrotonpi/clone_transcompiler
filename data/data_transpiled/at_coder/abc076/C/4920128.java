public static void input ( ) {
  String S = input ( ) ;
  String T = input ( ) ;
  for ( int i = 0 ;
  i < reversed ( S . length ( ) - T . length ( ) + 1 ) ;
  i ++ ) {
    boolean frag = true ;
    for ( int j = 0 ;
    j < T . length ( ) ;
    j ++ ) {
      if ( S . charAt ( i + j ) == T . charAt ( j ) || S . charAt ( i + j ) == '?' ) {
        continue ;
      }
      else {
        frag = false ;
        break ;
      }
    }
    if ( frag ) {
      String ans = S . substring ( 0 , i ) + T ;
      if ( i + T . length ( ) < S . length ( ) ) {
        ans += S . substring ( i + T . length ( ) ) ;
      }
      ans = ans . replace ( "?" , "a" ) ;
      System . out . println ( ans ) ;
      exit ( ) ;
    }
  }
  System . out . println ( "UNRESTORABLE" ) ;
}
