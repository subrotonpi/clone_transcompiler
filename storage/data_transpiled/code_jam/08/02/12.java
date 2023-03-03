static final Scanner in = new Scanner ( System . in ) {
  private int numcases = Integer . parseInt ( in . nextLine ( ) ) ;
  private int gettime = 0 ;
  private int turnaround = 0 ;
  private int [ ] counts = new int [ 2 ] ;
  @ Override public int nextInt ( ) {
    return Integer . parseInt ( counts [ 0 ] ) * 60 + Integer . parseInt ( counts [ 1 ] ) ;
  }
  @ Override public String nextLine ( ) {
    return "Case " + testCase + ": " + ac + " " + bc ;
  }
}
