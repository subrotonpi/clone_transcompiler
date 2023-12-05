static void init ( ) throws IOException {
  final BufferedReader in = new BufferedReader ( new FileReader ( "data.txt" ) ) ;
  final BufferedWriter out = new BufferedWriter ( new FileWriter ( "out.txt" ) ) ;
  final String input = in . readLine ( ) ;
  final int top = 2505 ;
  for ( int c = 0 ;
  c < Integer . parseInt ( input ) ;
  c ++ ) {
    final int n = Integer . parseInt ( in . readLine ( ) ) ;
    final int [ ] count = new int [ top ] ;
    for ( int i = 0 ;
    i < 2 * n - 1 ;
    i ++ ) {
      for ( int j : map . get ( input ) . split ( " " ) ) {
        count [ j ] ++ ;
      }
    }
    final int [ ] ans = new int [ top ] ;
    for ( int i = 0 ;
    i < top ;
    i ++ ) {
      if ( count [ i ] % 2 != 0 ) ans [ i ] = i ;
    }
    System . out . println ( "Case #" + ( c + 1 ) + ": " + Arrays . toString ( ans ) ) ;
  }
}
