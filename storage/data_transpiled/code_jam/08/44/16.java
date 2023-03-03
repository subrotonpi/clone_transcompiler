@ GwtIncompatible ( "java.util.regex.Pattern" ) public static void main ( String [ ] args ) throws IOException {
  /* Use the pattern to test the pattern */
  Pattern pattern = Pattern . compile ( "^([A-Za-z]*)$" ) ;
  /* Use all permutations of the pattern */
  String [ ] allPerms = pattern . matcher ( str ) . toArray ( new String [ 0 ] ) ;
  /* Use all permutations of the pattern */
  if ( str . length ( ) <= 1 ) {
    /* Use all permutations of the pattern */
    String perm = allPerms [ str . length ( ) - 1 ] ;
    for ( int i = 0 ;
    i <= perm . length ( ) ;
    i ++ ) {
      /* Use all permutations of the pattern */
      String res = "" ;
      for ( int i = 0 ;
      i <= S . length ( ) / k ;
      i ++ ) {
        for ( int j = 0 ;
        j <= k ;
        j ++ ) {
          res = res + S . charAt ( i * k + p . charAt ( j ) ) ;
        }
      }
      /* Use all permutations of the pattern */
      String z = "" ;
      /* Use all permutations of the pattern */
      String res = "" ;
      char prev = '0' ;
      for ( int i = 0 ;
      i <= z . length ( ) ;
      i ++ ) {
        if ( z . charAt ( i ) != prev ) {
          /* Use all permutations of the pattern */
          res = res + 1 ;
        }
        prev = z . charAt ( i ) ;
      }
      /* Use all permutations of the pattern */
      String x = new String ( ) ;
      int min = 99999999 ;
      for ( int i = 0 ;
      i <= k ;
      i ++ ) {
        x . add ( i ) ;
      }
      for ( String perm : allPerms ) {
        String z = apply ( pattern , k , perm , S ) ;
        int t = evaluate ( z ) ;
        if ( t < min ) {
          min = t ;
        }
      }
      /* Use all permutations of the pattern */
      String line = input . nextLine ( ) ;
      for ( int testCase = 1 ;
      testCase < 1 + Integer . parseInt ( line ) ;
      testCase ++