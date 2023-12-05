public static void input ( ) {
  s = input ( ) ;
  k = Integer . parseInt ( input ( ) ) ;
  sub = new HashSet < > ( ) ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    for ( int j = 1 ;
    j <= k ;
    j ++ ) {
      sub . add ( s . substring ( i , i + j ) ) ;
    }
  }
  System . out . println ( new ArrayList < > ( Collections . reverseOrder ( sub ) ) . get ( k - 1 ) ) ;
}
