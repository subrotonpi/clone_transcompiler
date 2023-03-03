static public final void solve ( int N , int A , int B , int C , @ Nonnull List < Integer > l ) {
  long result = 10000000000 ;
  for ( int i = 0 ;
  i < 2 * ( N * 2 ) - 1 ;
  i ++ ) {
    int bitBase = i | 2 * ( N * 2 ) ;
    boolean debug = false ;
    long mergeCost = 0 ;
    long a = 0 ;
    long b = 0 ;
    long c = 0 ;
    boolean invalid = false ;
    String debugStr = "" ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      int flag = ( ( 3 << ( j * 2 ) ) & bitBase ) >>> ( j * 2 ) ;
      switch ( flag ) {
        case 1 : if ( a != 0 ) mergeCost += 10 ;
        if ( debug ) debugStr += "A" ;
        a += l . get ( j ) ;
        break ;
        case 2 : if ( b != 0 ) mergeCost += 10 ;
        if ( debug ) debugStr += "B" ;
        b += l . get ( j ) ;
        break ;
        case 3 : if ( c != 0 ) mergeCost += 10 ;
        if ( debug ) debugStr += "C" ;
        c += l . get ( j ) ;
        break ;
        default : if ( debug ) debugStr += "X" ;
        break ;
      }
    }
    if ( a == 0 || b == 0 || c == 0 ) continue ;
    long cost = mergeCost + Math . abs ( A - a ) + Math . abs ( B - b ) + Math . abs ( C - c ) ;
    if ( debug ) {
      System . out . println ( debugStr ) ;
    }
    result = Math . min ( cost , result ) ;
  }
  System . out . println ( result ) ;
  /* main loop */
  for ( String line : System . console ( ) . split ( " " ) ) {
    for ( String word : line . split ( " " ) ) {
      /* print word */
      System . out . println ( word ) ;
    }
  }
  List < String > tokens = new ArrayList < String > ( ) ;
  N = Integer . parseInt ( tokens . get ( 0 ) ) ;
  A = Integer . parseInt ( tokens . get ( 1 ) ) ;
  B = Integer . parseInt ( tokens . get ( 2 ) ) ;
  C = Integer . parseInt ( tokens . get ( 3 ) ) ;
  l . clear ( ) ;
  for ( int i = 0 ;
  i < N