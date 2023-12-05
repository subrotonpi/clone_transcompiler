public static void input ( ) {
  s = input . nextLine ( ) ;
  int n = s . length ( ) ;
  int [ ] dp = new int [ 26 ] ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    dp [ ( int ) s . charAt ( i ) - 'a' ] ++ ;
  }
  int ans = 0 ;
  for ( int j : dp ) {
    ans += ( j * ( n - j ) ) ;
  }
  System . out . println ( ans / 2 + 1 ) ;
}
