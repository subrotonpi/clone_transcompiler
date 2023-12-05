public static void print ( int N ) {
  int pow = 1 ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    pow = ( pow * i ) % 1000000007 ;
  }
  System . out . println ( pow ) ;
}
