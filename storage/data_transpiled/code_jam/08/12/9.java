static final Scanner scanner = new Scanner ( new File ( "fileinput" ) ) {
  final Scanner fitr = new Scanner ( new FileInputStream ( fileinput ) ) ;
  for ( int testCase = 0 ;
  testCase < Integer . parseInt ( fitr . nextLine ( ) ) ;
  testCase ++ ) {
    final int N = Integer . parseInt ( fitr . nextLine ( ) ) ;
    final int M = Integer . parseInt ( fitr . nextLine ( ) ) ;
    final List < List < Integer >> L = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      final List < Integer > line = Arrays . asList ( Integer . parseInt ( fitr . nextLine ( ) ) ) ;
      final List < Integer > l = new ArrayList < > ( ) ;
      for ( int j = 0 ;
      j < line . get ( 0 ) ;
      j ++ ) {
        l . add ( new Integer ( Boolean . parseBoolean ( line . get ( 1 + 2 * j + 1 ) ) ) ) ;
      }
      Collections . sort ( l ) ;
      L . add ( l ) ;
    }
    final Set < Integer > malted = new HashSet < > ( ) ;
    boolean impossible = false ;
    final Set < Integer > availableCust = new HashSet < > ( M ) ;
    int oldLen = 0 ;
    while ( availableCust . size ( ) != oldLen && ! impossible ) {
      oldLen = availableCust . size ( ) ;
      for ( int i = 0 ;
      i < availableCust . size ( ) ;
      i ++ ) {
        final int m = availableCust . get ( i ) ;
        boolean placed = false ;
        final Iterator < Integer > it = L . get ( i ) . iterator ( ) ;
        while ( it . hasNext ( ) ) {
          final int f = it . next ( ) ;
          if ( m > 0 ) {
            malted . add ( f ) ;
            availableCust . remove ( i ) ;
            placed = true ;
            break ;
          }
          else {
            if ( ! malted . contains ( f ) ) {
              placed = true ;
              break ;
            }
          }
        }
        if ( ! placed ) {
          impossible = true ;
          break ;
        }
      }
    }
    final String output ;
    if ( impossible ) {
      output = "IMPOSSIBLE" ;
    }
    else {
      output = StringUtils . toString ( malted ) ;
    }
    System . out . println ( "Case #" + ( testCase + 1 ) + ": " + output ) ;
  }
  return new Scanner ( new File ( "fileinput"