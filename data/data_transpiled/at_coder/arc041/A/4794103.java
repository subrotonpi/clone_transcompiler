static final Scanner input = new Scanner ( System . in ) {
  @ Override public void close ( ) {
    Scanner input = new Scanner ( System . in ) ;
    int x = input . nextInt ( ) ;
    int y = input . nextInt ( ) ;
    int k = input . nextInt ( ) ;
    if ( k <= y ) {
      System . out . println ( k + x ) ;
    }
    else {
      System . out . println ( y + x - ( k - y ) ) ;
    }
  }
}
