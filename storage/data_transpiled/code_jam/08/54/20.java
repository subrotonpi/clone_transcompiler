static final Scanner getScanner ( ) {
  final Scanner scanner = new Scanner ( System . in ) ;
  scanner . setCheckInterval ( 10000 ) ;
  final double PI = arccos ( - 1 ) ;
  final double PI_2 = arccos ( - 1 ) / 2 ;
  final Map < Integer , Integer > cache = new HashMap < Integer , Integer > ( ) ;
  final Map < Integer , Integer > r = new HashMap < Integer , Integer > ( ) ;
  {
    if ( scanner . hasNext ( ) && scanner . next ( ) . equals ( W ) ) return 1 ;
    if ( Globals . cache . containsKey ( new Integer ( scanner . nextInt ( ) ) ) ) return Globals . cache . get ( new Integer ( scanner . nextInt ( ) ) ) ;
    int total = 0 ;
    if ( scanner . next ( ) + 2 <= W && scanner . next ( ) + 1 <= H && ( ! r . containsKey ( new Integer ( scanner . nextInt ( ) ) ) ) ) total += solveR ( scanner . nextInt ( ) + 2 , scanner . next ( ) , H , W ) ;
    if ( scanner . next ( ) + 1 <= W && scanner . next ( ) + 2 <= H && ( ! r . containsKey ( new Integer ( scanner . nextInt ( ) ) ) ) ) total += solveR ( scanner . nextInt ( ) + 1 , scanner . next ( ) , H , W ) ;
    total = total % 10007 ;
    Globals . cache . put ( new Integer ( scanner . nextInt ( ) ) , total ) ;
    return new Scanner ( System . in ) ;
  }
  private static void solve ( int caseNum ) {
    final int H = Integer . parseInt ( scanner . nextLine ( ) ) ;
    final int W = Integer . parseInt ( scanner . nextLine ( ) ) ;
    final int R = Integer . parseInt ( scanner . nextLine ( ) ) ;
    Globals . cache . put ( new Integer ( R ) , new Integer ( R ) ) ;
    for ( int i = 0 ;
    i < R ;
    i ++ ) {
      final int [ ] tmp = map . get ( scanner . nextInt ( ) ) ;
      Globals . cache . put ( new Integer ( tmp [ 1 ] ) , tmp [ 0 ] ) ;
    }
    Globals . cache . clear ( ) ;
    final int total = solveR ( 1 , 1 , H , W ) ;
    System . out . printf ( "Case #%d: %s%n" , caseNum , total ) ;
  }
  final int casesCount = Integer . parseInt ( scanner