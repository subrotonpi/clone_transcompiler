public static int [ ] [ ] N = Integer . parseInt ( input ) {
  int [ ] imos = new int [ 1443 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    imos [ i ] = 0 ;
  }
  /* myStart */
  while ( ( i = input . nextInt ( ) ) != 0 ) {
    if ( i % 5 == 0 ) break ;
    i -- ;
  }
  /* myEnd */
  while ( ( i = input . nextInt ( ) ) != 0 ) {
    if ( i % 5 == 0 ) break ;
    i ++ ;
  }
  /* outputTime */
  int h = i / 60 ;
  h = String . format ( "%02d" , h ) ;
  int m = i % 60 ;
  m = String . format ( "%02d" , m ) ;
  /* outputTime */
  int [ ] [ ] nums = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    String [ ] time = new String [ 3 ] ;
    for ( String t : input . split ( "-" ) ) time [ 0 ] = t . substring ( 0 , 2 ) ;
    time = new int [ 3 ] ;
    for ( int j = 0 ;
    j < 3 ;
    j ++ ) time [ j ] = Integer . parseInt ( time [ j ] . substring ( 2 ) ) * 60 + Integer . parseInt ( time [ j ] . substring ( 2 ) ) ;
    time = new int [ 3 ] ;
    time [ 0 ] = myStart ( time [ 0 ] ) ;
    time [ 1 ] = myEnd ( time [ 1 ] ) ;
    nums [ i ] = time ;
  }
  for ( int [ ] n : nums ) {
    imos [ n [ 0 ] ] ++ ;
    imos [ n [ 1 ] + 1 ] -- ;
  }
  int [ ] ans = new int [ N ] [ ] ;
  int j = 0 ;
  for ( int i = 0 ;
  i < imos . length ;
  i ++ ) {
    ans [ j + i ] = i ;
    j += i ;
  }
  int start = 0 , end = 0 , flag = false ;
  for ( int i = 0 ;
  i < ans . length ;
  i ++ ) {
    if ( ans [ i ] == 0 && flag == false ) continue ;
    else if ( ans [ i ] == 0 && flag == true ) {
      end = i ;
      System . out . println ( outputTime ( start ) + " -