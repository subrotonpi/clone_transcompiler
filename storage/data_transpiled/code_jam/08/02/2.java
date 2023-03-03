@ VisibleForTesting static int [ ] [ ] solve ( Scanner scanner ) {
  String l = scanner . nextLine ( ) ;
  int n = Integer . parseInt ( l ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    System . out . format ( "Case #%d:" , i + 1 ) ;
    l = scanner . nextLine ( ) ;
    int turnaround = Integer . parseInt ( l ) ;
    l = scanner . nextLine ( ) ;
    int [ ] departures = new int [ 2 ] ;
    for ( int j = 0 ;
    j < departures . length ;
    j ++ ) departures [ j ] = Integer . parseInt ( l . split ( " " ) [ 0 ] ) ;
    List < Pair > queue = new ArrayList < > ( ) ;
    for ( int j = 0 ;
    j < departures [ 0 ] ;
    j ++ ) {
      l = scanner . nextLine ( ) ;
      int [ ] time = new int [ 2 ] ;
      for ( int k = 0 ;
      k < departures [ 0 ] ;
      k ++ ) time [ k ] = Integer . parseInt ( l . split ( ":" ) [ 0 ] ) ;
      int depart = time [ 0 ] * 60 + time [ 1 ] ;
      time = new int [ 2 ] ;
      for ( int k = 0 ;
      k < departures [ 1 ] ;
      k ++ ) time [ k ] = Integer . parseInt ( l . split ( ":" ) [ 1 ] ) ;
      int arrive = time [ 0 ] * 60 + time [ 1 ] ;
      queue . add ( new Pair ( depart , "A" , 1 ) ) ;
      queue . add ( new Pair ( arrive + turnaround , "B" , - 1 ) ) ;
    }
    for ( int j = 0 ;
    j < departures [ 1 ] ;
    j ++ ) {
      l = scanner . nextLine ( ) ;
      int [ ] time = new int [ 2 ] ;
      for ( int k = 0 ;
      k < departures [ 0 ] ;
      k ++ ) time [ k ] = Integer . parseInt ( l . split ( ":" ) [ 0 ] ) ;
      int depart = time [ 0 ] * 60 + time [ 1 ] ;
      time = new int [ 2 ] ;
      for ( int k = 0 ;
      k < departures [ 1 ] ;
      k ++ ) time [ k ] = Integer . parseInt ( l . split ( ":" ) [ 1 ] ) ;
      int arrive = time [ 0 ] *