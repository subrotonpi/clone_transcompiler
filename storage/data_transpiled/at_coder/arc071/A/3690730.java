static final String input ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int [ ] Ans = new int [ 26 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    alp = new int [ 26 ] ;
    for ( int j = 0 ;
    j < alp . length ;
    j ++ ) {
      alp [ ( int ) ( s . charAt ( j ) - 97 ) ] ++ ;
    }
    Ans = Arrays . copyOf ( Ans , alp . length ) ;
  }
  String ans = "" ;
  for ( int i = 0 ;
  i < 26 ;
  i ++ ) {
    ans += ( char ) ( 97 + i ) * Ans [ i ] ;
  }
  System . out . println ( ans ) ;
}
