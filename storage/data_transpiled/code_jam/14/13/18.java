public static void input ( File input ) throws IOException {
  File output = new File ( "C-small-attempt0.in" ) ;
  /* Read the number of times in the file */
  int N ;
  int [ ] perm ;
  /* Read the number of times in the file */
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    perm = new int [ N ] ;
    for ( int j = 0 ;
    j < perm . length ;
    j ++ ) {
      perm [ j ] = input . read ( ) ;
    }
  }
  /* Read the file */
  output . delete ( ) ;
  /* Solve the solution */
}
