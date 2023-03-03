public static void main ( String N , int M ) {
  for ( int i = 0 ;
  i < input . length ( ) ;
  i ++ ) {
    if ( N > Integer . MAX_VALUE / 2 ) {
      System . out . println ( Integer . MAX_VALUE / 2 ) ;
    }
    else {
      int hoge = Integer . MAX_VALUE / 2 - N ;
      System . out . println ( N + Integer . MAX_VALUE / 2 ) ;
    }
  }
}
