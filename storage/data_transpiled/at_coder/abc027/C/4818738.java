public static final String getSummarizingString ( ) {
  Scanner input = new Scanner ( System . in ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( N == 1 ) {
    System . out . println ( "Aoki" ) ;
  }
  else {
    int tmp = 1 ;
    int index = 2 ;
    while ( true ) {
      tmp += 2 * index ;
      if ( N <= tmp ) {
        System . out . println ( "Takahashi" ) ;
        break ;
      }
      else {
        tmp += 2 * index ;
        if ( N <= tmp ) {
          System . out . println ( "Aoki" ) ;
          break ;
        }
        else {
          index += 2 ;
        }
      }
    }
  }
}
