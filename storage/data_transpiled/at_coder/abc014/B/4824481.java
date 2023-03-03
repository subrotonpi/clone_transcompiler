public static void n ( int n , String X ) {
  int [ ] A = Integer . parseInt ( input ( ) ) ;
  X = Integer . toBinaryString ( X ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    if ( X . charAt ( A . length - i - 1 ) == '1' ) {
      ans += A [ i ] ;
    }
  }
  System . out . println ( ans ) ;
}
