public static void print ( int n , int k ) {
  int r = Integer . parseInt ( input . nextLine ( ) ) ;
  r = new int [ n ] ;
  for ( int i = 0 ;
  i < r ;
  i ++ ) {
    r [ i ] = i ;
  }
  r . sort ( ) ;
  r . remove ( k ) ;
  r . remove ( k ) ;
  int score = 0 ;
  r . reverse ( ) ;
  for ( int i = 0 ;
  i < r . size ( ) ;
  i ++ ) {
    score = ( score + r . get ( i ) ) / 2 ;
  }
  System . out . println ( score ) ;
}
