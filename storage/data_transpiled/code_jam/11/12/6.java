static final String print ( String s ) {
  final PrintStream temp = System . out ;
  System . setOut ( new PrintStream ( System . out ) ) ;
  print ( s ) ;
  System . setOut ( temp ) ;
  /* solve the list of words */
  String [ ] answer = wordMap . toArray ( new String [ wordMap . size ( ) ] ) ;
  for ( int i = 0 ;
  i < wordMap . size ( ) ;
  i ++ ) {
    String word = wordMap . get ( i ) ;
    List < String > possibles = new ArrayList < String > ( wordMap . size ( ) ) ;
    possibles . addAll ( Arrays . asList ( answer ) ) ;
    int score = 0 ;
    for ( int j = 0 ;
    j < wordMap . size ( ) ;
    j ++ ) {
      if ( word . length ( ) != wordMap . size ( ) ) {
        possibles . remove ( wordMap . get ( j ) ) ;
      }
    }
    for ( int j = 0 ;
    j < lorder . length ;
    j ++ ) {
      boolean used = false ;
      for ( String word : possibles ) {
        if ( word . contains ( word ) ) {
          used = true ;
          boolean [ ] isMatch = new boolean [ answer . size ( ) ] ;
          for ( int i = 0 ;
          i < answer . size ( ) ;
          i ++ ) {
            String aletter = answer . get ( i ) ;
            if ( word . equals ( aletter ) ) {
              isMatch [ i ] = true ;
            }
          }
        }
        if ( ! used ) {
          continue ;
        }
        if ( ! ArrayUtils . contains ( isMatch , word ) ) {
          score ++ ;
        }
        List < String > toRemove = new ArrayList < String > ( ) ;
        for ( String word : possibles ) {
          for ( int i = 0 ;
          i < word . length ( ) ;
          i ++ ) {
            if ( ( word . charAt ( i ) == letter ) != isMatch [ i ] ) {
              toRemove . add ( word ) ;
              break ;
            }
          }
        }
        for ( String word : toRemove ) {
          possibles . remove ( word ) ;
        }
      }
      if ( score > bestscore ) {
        bestscore = score ;
        best = answer ;
      }
    }
    /* solve the list of words */
    int N = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int M = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    Set < String > set