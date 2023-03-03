public static void print ( int n ) {
  int count = 0 ;
  int num = 0 ;
  while ( count < n ) {
    num ++ ;
    for ( int i = 0 ;
    i < String . valueOf ( num ) . length ( ) - 1 ;
    i ++ ) {
      if ( String . valueOf ( num ) . charAt ( i ) != String . valueOf ( num ) . charAt ( i + 1 ) ) break ;
    }
  }
  System . out . println ( num ) ;
}
