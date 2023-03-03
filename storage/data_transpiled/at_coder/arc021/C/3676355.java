static final Scanner input = new Scanner ( System . in ) {
  private final List < Integer > inpl = Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  private final int K = Integer . parseInt ( input . nextLine ( ) ) ;
  private final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  private final List < Integer > src = new ArrayList < > ( N ) ;
  private static boolean solve ( final int price ) {
    int n = 0 ;
    for ( int a = 0 ;
    a < src . size ( ) ;
    a ++ ) {
      int d = src . get ( a ) ;
      if ( price < d ) {
        continue ;
      }
      n += ( price - a ) / d + 1 ;
    }
    if ( n >= K ) {
      return true ;
    }
    else {
      return false ;
    }
  }
}
