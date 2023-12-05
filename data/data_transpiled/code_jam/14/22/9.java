public static void fileIn ( Scanner fileIn , PrintWriter fileOut ) throws IOException {
  Scanner fileIn = new Scanner ( fileIn ) ;
  PrintWriter fileOut = new PrintWriter ( fileOut ) ;
  int nCase = Integer . parseInt ( fileIn . nextLine ( ) ) ;
  for ( int i_Case = 0 ;
  i_Case < nCase ;
  i_Case ++ ) {
    System . out . println ( i_Case ) ;
  }
  fileIn . close ( ) ;
  fileOut . close ( ) ;
}
