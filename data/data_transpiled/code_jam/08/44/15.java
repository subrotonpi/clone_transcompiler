public static List < List < String >> genPerm ( List < Integer > rem ) {
  if ( rem != null ) {
    List < List < String >> result = new ArrayList < List < String >> ( ) ;
    for ( Integer i : rem ) {
      for ( List < String > perm : genPerm ( rem . stream ( ) . map ( Integer :: valueOf ) . collect ( Collectors . toList ( ) ) ) ) {
        result . add ( Arrays . asList ( i ) . stream ( ) . map ( String :: valueOf ) . collect ( Collectors . toList ( ) ) ) ;
      }
    }
    return result ;
  }
  /* permute the permutations of the list */
  private static String permute ( List < String > perm , String s ) {
    return StringUtils . join ( perm , s ) ;
  }
  private static String compress ( String s ) {
    char prev = 0 ;
    int n = 0 ;
    for ( char c : s . toCharArray ( ) ) {
      if ( c != prev ) {
        n ++ ;
        prev = c ;
      }
    }
    return n ;
  }
  private static int solve ( ) {
    int permSize = Integer . parseInt ( scanner . nextLine ( ) ) ;
    String str = scanner . nextLine ( ) ;
    List < List < String >> permutations = Lists . newArrayList ( genPerm ( new HashSet < String > ( permutations ) ) ) ;
    int clen = 1000000000 ;
    for ( List < String > perm : permutations ) {
      StringBuffer permData = new StringBuffer ( ) ;
      for ( int i = 0 ;
      i < str . length ( ) ;
      i += permSize ) {
        permData . append ( permute ( perm , str . substring ( i , i + permSize ) ) ) ;
      }
      clen = Math . min ( clen , compress ( permData . toString ( ) ) ) ;
    }
    return clen ;
  }
  private static String solve ( ) {
    final Scanner scanner = new Scanner ( scanner ) ;
    scanner . nextLine ( ) ;
    for ( int testCase = 0 ;
    testCase < Integer . parseInt ( scanner . nextLine ( ) ) ;
    testCase ++ ) {
      System . out . println ( "Case #" + ( testCase + 1 ) + ": " + solve ( ) ) ;
    }
    return scanner . nextLine ( ) ;
  }
}
