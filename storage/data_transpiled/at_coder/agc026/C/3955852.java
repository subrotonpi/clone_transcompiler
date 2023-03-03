public static int N = Integer . parseInt ( input ) {
  String S = input . nextLine ( ) ;
  /* Count the number of characters in the string */
  HashMap < String , Integer > res = new HashMap < String , Integer > ( ) ;
  for ( int i = 0 ;
  i < 2 * N ;
  i ++ ) {
    String t1 = "" ;
    String t2 = "" ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( ( i & 1 << j ) != 0 ) {
        t1 += s . charAt ( j ) ;
      }
      else {
        t2 += s . charAt ( j ) ;
      }
    }
    String k = t1 + t2 + "abcdefghijklmnoprst" . substring ( Integer . valueOf ( i ) . indexOf ( "1" ) ) ;
    res . put ( k , res . getOrDefault ( k , 0 ) + 1 ) ;
  }
  HashMap < String , Integer > h1 = count ( S . substring ( 0 , N ) ) ;
  HashMap < String , Integer > h2 = count ( S . substring ( N ) . substring ( 0 , S . length ( ) - 1 ) ) ;
  int ans = 0 ;
  for ( Map . Entry < String , Integer > e : h1 . entrySet ( ) ) {
    if ( e . getKey ( ) != null ) {
      ans += e . getValue ( ) * h2 . get ( e . getKey ( ) ) ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
