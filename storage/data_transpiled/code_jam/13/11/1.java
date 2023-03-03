static final Scanner input = new Scanner ( System . in ) {
  private final int rl = Integer . parseInt ( input . nextLine ( ) ) ;
  @ Override public int sum ( int n ) {
    return ( n * ( n + 1 ) ) / 2 ;
  }
  @ Override public boolean canDraw ( int r , int t , int rings ) {
    t -= ( 2 * r + 1 ) * rings ;
    t -= sum ( rings - 1 ) * 4 ;
    return t >= 0 ;
  }
}
