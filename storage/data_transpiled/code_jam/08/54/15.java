private static HashMap < Integer , Boolean > rocks = new HashMap < Integer , Boolean > ( ) {
  private final HashMap < Integer , Boolean > numWays = new HashMap < Integer , Boolean > ( ) ;
  private int mod = 10007 ;
  private int numUWays ( int r , int c , int H , int W ) {
    if ( ( r >= H ) || ( c >= W ) ) return 0 ;
    if ( ( ( r == H - 1 ) && ( c == W - 1 ) ) ) return 1 ;
    if ( ( ( r == H ) && ( c == W ) ) ) return numWays . get ( new Integer ( r ) ) ;
    int a = numUWays ( r + 2 , c + 1 , H , W ) ;
    int b = numUWays ( r + 1 , c + 2 , H , W ) ;
    numWays . put ( new Integer ( r ) , ( a + b ) % mod ) ;
    return numWays . get ( new Integer ( r ) ) ;
  }
  private static final long serialVersionUID = - 560144028629862986298629862986298629862986298629862986298629862986298629862986298629862986298629862986298629862986298629862986298629862986298629862986298629862986298629862986298629862986298629862986298629862986298629862986298629862986298629862986298629862986298629862986298629862986298629862986298629862986298629862986298629862986298629862986298629862986298629862986298629862986298629862986298629862986298629862986298629862986298629862986298629862986298629862986298629862986298629862986298629862986298629862986298629862986298629862986298629862986298629862986298629862986 @ @