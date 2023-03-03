public static void search ( int i ) {
  int [ ] firstfrom = new int [ firstmap . length ] ;
  int [ ] secondfrom = new int [ secondmap . length ] ;
  PriorityQueue < Integer > queue = new PriorityQueue < Integer > ( ) ;
  queue . add ( new Integer ( 0 ) ) ;
  firstfrom [ i ] = - 1 ;
  while ( queue . size ( ) > 0 ) {
    int which = queue . peek ( ) ;
    int j = 0 ;
    queue . remove ( ) ;
    if ( which == 0 ) {
      for ( int k = 0 ;
      k < secondmap . length ;
      k ++ ) {
        if ( matrix [ j ] [ k ] != 1 ) continue ;
        if ( secondfrom [ k ] != 0 ) continue ;
        if ( secondmatched [ k ] == 0 ) {
          secondmatched [ k ] = 1 ;
          matrix [ j ] [ k ] = 2 ;
          k = firstfrom [ j ] ;
          while ( k != - 1 ) {
            matrix [ j ] [ k ] = 1 ;
            j = secondfrom [ k ] ;
            matrix [ j ] [ k ] = 2 ;
            k = firstfrom [ j ] ;
          }
          firstmatched [ j ] = 1 ;
          return ;
        }
        secondfrom [ k ] = j ;
        queue . add ( new Integer ( 1 ) ) ;
      }
    }
    else {
      for ( int k = 0 ;
      k < firstmap . length ;
      k ++ ) {
        if ( matrix [ k ] [ j ] != 2 ) continue ;
        if ( firstfrom [ k ] != 0 ) continue ;
        firstfrom [ k ] = j ;
        queue . add ( new Integer ( 0 ) ) ;
      }
    }
  }
  for ( int x = 1 ;
  x <= Integer . MAX_VALUE ;
  x ++ ) {
    int n = Integer . parseInt ( input . nextLine ( ) ) ;
    firstmap = new HashMap < String , Integer > ( ) ;
    secondmap = new HashMap < String , Integer > ( ) ;
    ArrayList < Pair > topicgrid = new ArrayList < Pair > ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      String [ ] topic = input . split ( " " ) ;
      if ( ! firstmap . containsKey ( topic [ 0 ] ) ) {
        firstmap . put ( topic [ 0 ] , firstmap . size ( ) ) ;
      }
      if ( ! secondmap . containsKey ( topic [ 1 ] ) ) {
        secondmap . put ( topic [ 1 ] , secondmap . size ( ) ) ;
      }
      topicgrid . add