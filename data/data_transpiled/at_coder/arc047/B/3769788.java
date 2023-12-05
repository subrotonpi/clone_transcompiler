public static final String getLoopString ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < List < Integer >> a = new ArrayList < > ( ) ;
  for ( String l : System . console ( ) . readLine ( ) . split ( " " ) ) {
    a . add ( Collections . singletonList ( l ) ) ;
  }
  final List < Integer > rotated = a . stream ( ) . map ( x -> x + y ) . collect ( Collectors . toList ( ) ) ;
  final int maxX = Collections . max ( rotated ) . get ( 0 ) , minX = Collections . min ( rotated ) . get ( 0 ) ;
  final int maxY = Collections . max ( rotated , new Comparator < Integer > ( ) {
  }
  ) ;
  int length = Math . max ( 1 , maxX - minX , maxY - minY ) ;
  if ( length % 2 == 1 ) {
    for ( int x = 0 , y = 0 ;
    x < length ;
    x ++ , y ++ ) {
      if ( rotated . size ( ) == 1 ) {
        final int answerX = ( x + y ) / 2 ;
        final int answerY = - y + answerX ;
        if ( - ( 10 * 9 ) <= answerX && answerY <= 10 * 9 ) {
          System . out . println ( answerX + " " + answerY ) ;
          exit ( ) ;
        }
      }
    }
  }
  throw new IllegalStateException ( "hoge" ) ;
}
