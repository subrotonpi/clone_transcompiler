public static void input ( ) {
  Scanner file = new Scanner ( System . in ) ;
  int testsCount = Integer . parseInt ( file . nextLine ( ) . trim ( ) ) ;
  for ( int i : xrange ( testsCount ) ) {
    int levelsCount = Integer . parseInt ( file . nextLine ( ) . trim ( ) ) ;
    int [ ] [ ] levelsRequirements = new int [ levelsCount ] [ levelsCount ] ;
    for ( int j : xrange ( levelsCount ) ) {
      levelsRequirements [ j ] = new int [ levelsCount ] ;
      for ( int n : file . nextLine ( ) . trim ( ) . split ( " " ) ) {
        levelsRequirements [ j ] [ n ] = Integer . parseInt ( file . nextLine ( ) . trim ( ) ) ;
      }
    }
    input ( levelsRequirements ) ;
  }
}
