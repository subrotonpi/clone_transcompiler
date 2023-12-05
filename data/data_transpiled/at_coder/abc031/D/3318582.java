static final int [ ] getWordList ( ) {
  final int K = Integer . parseInt ( input . readLine ( ) ) ;
  final int N = Integer . parseInt ( input . readLine ( ) ) ;
  final PriorityQueue < List < Integer >> q = new PriorityQueue < > ( ) ;
  for ( int v = 0 ;
  v < N ;
  v ++ ) q . add ( new ArrayList < > ( Collections . nCopies ( Math . min ( k , v ) - 1 , v ) ) ) ;
  for ( int l = 0 ;
  l < N ;
  l ++ ) q . add ( new ArrayList < > ( Collections . nCopies ( Math . min ( k , l ) , l ) ) ) ;
  for ( int lengthList : new int [ ] {
    1 , 4 }
    ) {
      for ( int v = 0 ;
      v < N ;
      v ++ ) {
        for ( int w = 0 ;
        w < N ;
        w ++ ) {
          if ( Integer . bitCount ( lengthList ) != l ) break ;
        }
      }
    }
    else {
      final String [ ] ans = new String [ K ] ;
      for ( int v = 0 ;
      v < N ;
      v ++ ) {
        for ( int l = 0 ;
        l < N ;
        l ++ ) {
          ans [ v ] = w + lengthList ;
          w = w + lengthList ;
        }
      }
      System . out . println ( ans ) ;
      break ;
    }
    return ans ;
  }
  