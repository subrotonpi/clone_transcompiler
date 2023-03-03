private static void solve ( int n , int k ) {
  Map < Integer , Integer > gapCounts = new HashMap < > ( ) ;
  gapCounts . put ( n , 1 ) ;
  do {
    int gap = Collections . max ( gapCounts ) ;
    int count = gapCounts . get ( gap ) ;
    int hi = gap / 2 , lo = ( gap - 1 ) / 2 ;
    if ( k <= count ) {
      return String . format ( "%d %d" , hi , lo ) ;
    }
    k -= count ;
    gapCounts . remove ( gap ) ;
    for ( int newGap : new int [ ] {
      lo , hi }
      ) {
        if ( newGap > 0 ) {
          if ( ! newGap == 0 ) {
            gapCounts . put ( newGap , count ) ;
          }
          else {
            gapCounts . put ( newGap , count ) ;
          }
        }
      }
    }
    while ( k <= count ) ;
    int caseCount = input . nextInt ( ) ;
    for ( int i = 1 ;
    i <= caseCount ;
    i ++ ) {
      n = Integer . parseInt ( input . nextLine ( ) ) ;
      k = Integer . parseInt ( input . nextLine ( ) ) ;
      System . out . println ( String . format ( "Case #%d: %s" , i , solve ( n , k ) ) ) ;
    }
  }
  