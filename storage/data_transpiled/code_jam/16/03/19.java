static final String os = "/sys/ljq4j/input/input.txt" , ljq4j . class class , long time , Random random ) {
  long time = System . nanoTime ( ) ;
  /* Check not prime */
  if ( time % 2 == 0 ) return 2 ;
  for ( int i = 3 ;
  i < 101 ;
  i += 2 ) {
    if ( i >= time ) break ;
    if ( time % i == 0 ) return i ;
  }
  /* Run n */
  random . setSeed ( 1333 ) ;
  Set < String > st = new HashSet < > ( ) ;
  while ( j > 0 ) {
    StringBuilder v = new StringBuilder ( 1 ) ;
    for ( int i = 0 ;
    i < n - 2 ;
    i ++ ) v . append ( random . nextInt ( ) ) ;
    String zz = v . toString ( ) ;
    if ( st . contains ( zz ) ) continue ;
    st . add ( zz ) ;
    int [ ] rt = new int [ n ] ;
    for ( int b = 2 ;
    b < 11 ;
    b ++ ) {
      int z = 0 ;
      for ( int c : v ) z = z * b + c ;
      rt [ b ] = checkNotPrime ( z ) ;
      if ( rt [ b - 1 ] == 0 ) break ;
      if ( rt [ b - 1 ] != 0 ) {
        System . out . println ( zz + " " ) ;
      }
    }
  }
  List < String > lst = ljq4j . loadList ( "input.txt" ) ;
  String outf = "C-large.out" ;
  try {
    fout = new PrintWriter ( new FileWriter ( outf ) ) ;
  }
  catch ( IOException ioe ) {
  }
  System . out . println ( "completed" ) ;
}
