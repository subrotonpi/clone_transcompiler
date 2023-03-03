public static void print ( char a ) {
  int n = 700 ;
  for ( char c : a ) {
    if ( c == 'o' ) {
      n += 100 ;
    }
  }
  System . out . println ( n ) ;
}
