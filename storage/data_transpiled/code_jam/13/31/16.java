public static int t = Integer . parseInt ( new Scanner ( System . in ) . nextLine ( ) ) {
  private static final String vowel = "aeiou" ;
  for ( int kei : xrange ( t ) ) {
    String name = new Scanner ( System . in ) . nextLine ( ) ;
    String n = new Scanner ( System . in ) . nextLine ( ) ;
    n = Integer . parseInt ( n ) ;
    int i = 0 ;
    int j = 0 ;
    int ctr = 0 ;
    int cons = 0 ;
    int [ ] start = new int [ n ] ;
    int m = - 1 ;
    while ( i < name . length ( ) ) {
      if ( ! vowel . equals ( name . charAt ( i ) ) ) {
        while ( j < name . length ( ) && ! vowel . equals ( name . charAt ( j ) ) ) j ++ ;
        while ( j - i >= n ) {
          start [ cons ++ ] = i ;
          m = Math . max ( m , i ) ;
          i ++ ;
        }
        i = j ;
      }
      else {
        i ++ ;
        j = i ;
      }
    }
    ctr = 0 ;
    j = 0 ;
    for ( ;
    ;
    ) {
      i = xrange ( name . length ( ) ) ;
      while ( j < start . length && start [ j ] < i ) j ++ ;
      if ( j >= start . length ) break ;
      ctr += name . length ( ) - ( start [ j ] + n - 1 ) ;
    }
    System . out . println ( "Case #" + ( kei + 1 ) + ": " + ctr ) ;
  }
  return 0 ;
}
