public static void input ( ) {
  s = input . nextLine ( ) ;
  k = Integer . parseInt ( input . nextLine ( ) ) ;
  n = s . length ( ) ;
  koho = new ArrayList < String > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < k ;
    j ++ ) {
      if ( s . substring ( i , j ) . length ( ) <= k ) {
        koho . add ( s . substring ( i , j ) ) ;
      }
    }
  }
  System . out . println ( new ArrayList < String > ( Collections . reverseOrder ( koho ) ) . get ( k - 1 ) ) ;
}
