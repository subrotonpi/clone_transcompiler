public static boolean isPalindrome ( String string ) {
  int i = 0 , j = string . length ( ) - 1 ;
  while ( i < j ) {
    if ( string . charAt ( i ) != string . charAt ( j ) ) return false ;
    i ++ ;
    j -- ;
  }
  final int LEN = 27 ;
  {
    int lo = 0 , hi = string . length ( ) ;
    while ( lo < hi ) {
      mid = ( lo + hi ) / 2 ;
      if ( string . charAt ( mid ) >= num ) hi = mid ;
      else lo = mid + 1 ;
    }
  }
  {
    int lowerBound = Integer . parseInt ( string ) ;
    int total = lowerBound ( cands , lowerBound ) ;
    System . out . println ( "Case #{0}: {1}" , lowerBound , total ) ;
  }
  {
    int [ ] possible = new int [ LEN ] ;
    for ( int n = 1 ;
    n <= LEN ;
    n ++ ) {
      for ( int a = 0 ;
      a < n ;
      a ++ ) {
        for ( int b = 0 ;
        b < n ;
        b ++ ) {
          for ( int c = 0 ;
          c < n ;
          c ++ ) {
            for ( int d = 0 ;
            d < n ;
            d ++ ) {
              for ( int e = 0 ;
              e <= n - 1 ;
              e ++ ) {
                String s = "0" + n ;
                s = s . substring ( 0 , a ) + '1' + s . substring ( a + 1 ) ;
                possible [ n ] = lowerBound ( s , lowerBound ) ;
                s = s . substring ( 0 , b ) + '1' + s . substring ( b + 1 ) ;
                possible [ n ] = lowerBound ( s , lowerBound ) ;
                s = s . substring ( 0 , c ) + '1' + s . substring ( c + 1 ) ;
                possible [ n ] = lowerBound ( s , lowerBound ) ;
                s = s . substring ( 0 , d ) + '1' + s . substring ( d + 1 ) ;
                possible [ n ] = lowerBound ( s , lowerBound ) ;
                s = s . substring ( 0 , e ) + '2' + s . substring ( e + 1 ) ;
                possible [ n ] = lowerBound ( s , lowerBound ) ;
                s = s . substring ( 0 , e ) + '2' + s . substring ( e + 1 ) ;
                possible [ n ] = lowerBound ( s , lowerBound ) ;
              }
            }
          }
        }
      }
    }
    possible [ LEN - 1 ] = 3 ;
    List < Integer > cands = new ArrayList <