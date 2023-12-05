private static Set < String > words = new HashSet < > ( ) {
  for ( String w : Files . readAllLines ( Paths . get ( "garbled_email_dictionary.txt" ) ) ) {
    String alphabet = "abcdefghijklmnopqrstuvwxyz" ;
    /* Set the alphabet to lowercase */
    String word = w . substring ( 0 , index ) + alphabet + word . substring ( index + 1 ) ;
  }
  final Scanner fin = new Scanner ( System . in ) ;
  final int T = Integer . parseInt ( fin . nextLine ( ) ) ;
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    final String S = fin . nextLine ( ) . trim ( ) ;
    final int [ ] [ ] dp = new int [ S . length ( ) ] [ 5 ] ;
    dp [ 0 ] = new int [ S . length ( ) ] ;
    for ( int i = 0 ;
    i < S . length ( ) ;
    i ++ ) {
      dp [ i ] [ i ] = new int [ 10 * S . length ( ) ] ;
    }
    for ( int i = 0 ;
    i < S . length ( ) ;
    i ++ ) {
      char c = S . charAt ( i ) ;
      for ( int j = 0 ;
      j < 5 ;
      j ++ ) {
        for ( int l = 1 ;
        l < 11 ;
        l ++ ) {
          if ( i + l > S . length ( ) ) break ;
          final String word = S . substring ( i , i + l ) ;
          if ( words . contains ( word ) ) {
            final int newj = Math . min ( 4 , j + l ) ;
            dp [ i + l ] [ newj ] = Math . min ( dp [ i + l ] [ newj ] , dp [ i ] [ j ] + 1 ) ;
          }
          else {
            for ( int p1 = 4 - j ;
            p1 < l ;
            p1 ++ ) {
              for ( String letter : alphabet ) {
                final String word1 = setLetter ( word , p1 , letter ) ;
                if ( words . contains ( word1 ) ) {
                  final int newj = Math . min ( 4 , l - ( p1 + 1 ) ) ;
                  dp [ i + l ] [ newj ] = Math . min ( dp [ i + l ] [ newj ] , dp [ i ] [ j ] + 1 ) ;
                }
              }
            }
          }
        }
      }
    }
    final int result = Math . min ( dp [ dp . length - 1 ] , dp [ dp