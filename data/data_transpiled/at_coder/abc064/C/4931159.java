@ VisibleForTesting static int [ ] readAllRecords ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  final HashMap < Integer , Integer > scores = new HashMap < > ( ) ;
  scores . put ( 1 , 0 ) ;
  scores . put ( 400 , 0 ) ;
  scores . put ( 800 , 0 ) ;
  scores . put ( 1200 , 0 ) ;
  scores . put ( 1600 , 0 ) ;
  scores . put ( 2000 , 0 ) ;
  scores . put ( 2400 , 0 ) ;
  scores . put ( 2800 , 0 ) ;
  for ( int record : a ) {
    for ( int s : Collections . list ( scores . keySet ( ) ) ) {
      if ( record >= s ) {
        scores . put ( s , 1 ) ;
        break ;
      }
    }
  }
  final int colors = scores . size ( ) ;
  if ( scores . get ( 3200 ) > 0 && colors == 0 ) {
    minColors = 1 ;
  }
  else {
    minColors = colors ;
  }
  final int maxColors = colors + scores . get ( 3200 ) ;
  System . out . println ( minColors + " " + maxColors ) ;
  return minColors ;
}
