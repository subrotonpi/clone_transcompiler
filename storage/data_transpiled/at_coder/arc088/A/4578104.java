public static void main ( String input , int x , int y ) {
  for ( int i = 0 ;
  i < input . length ( ) ;
  i ++ ) {
    if ( x * ( 2 * i ) <= y ) {
      cnt ++ ;
    }
  }
  System . out . println ( cnt ) ;
}
