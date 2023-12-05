static final Map < Integer , Integer > RESOURCE_MAP = Collections . unmodifiableMap ( new HashMap < Integer , Integer > ( ) {
  private final Map < Integer , Integer > RESOURCE_MAP = Collections . unmodifiableMap ( new HashMap < Integer , Integer > ( ) {
    private static final long serialVersionUID = 1L ;
    {
      put ( RESOURCE_MAP , RESOURCE_MAP ) ;
    }
  }
  ) ;
  @ Override protected Object [ ] getInput ( ) {
    int N = Integer . parseInt ( input ( ) ) ;
    int M = Integer . parseInt ( input ( ) ) ;
    int [ ] A = Arrays . stream ( input ( ) . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
    return new Object [ ] {
      N , M , A }
      ;
    }
    @ Override protected String solve ( int N , int M , List < Integer > A ) {
      List < Integer > sortedA = new ArrayList < > ( A ) ;
      sortedA . sort ( ) . forEach ( i -> sortedA . add ( i ) ) ;
      int [ ] dp = fillDP ( N , sortedA ) ;
      String [ ] array = findArray ( dp , N , sortedA ) ;
      return Arrays . stream ( array ) . collect ( Collectors . joining ( "" ) ) ;
    }
    private int [ ] fillDP ( int N , List < Integer > A ) {
      int [ ] dp = new int [ N + 1 ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        dp [ i ] = - 100 * N ;
      }
      dp [ 0 ] = 0 ;
      for ( int i = 1 ;
      i <= N ;
      i ++ ) {
        fill ( A , dp , i , N ) ;
      }
      return dp ;
    }
    private void fill ( List < Integer > A , int dp , int n , int N ) {
      int [ ] cand = new int [ A . size ( ) ] ;
      for ( int i = 0 ;
      i < A . size ( ) ;
      i ++ ) {
        int num = A . get ( i ) ;
        if ( n - RESOURCE_MAP . get ( num ) >= 0 && dp [ currentN - RESOURCE_MAP . get ( i ) ] == dp [ currentN ] - 1 ) {
          array [ n ] = i ;
          currentN -= RESOURCE_MAP . get ( i ) ;
          break ;
        }
      }
    }
    @ Override protected String findArray ( int dp , int N , List < Integer > sortedA ) {
      String [ ] array = new String [ N ] ;
      int current @ @