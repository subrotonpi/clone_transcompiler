private static String solve ( ) {
  Scanner s = new Scanner ( System . in ) ;
  int [ ] howmany = new int [ 10 ] ;
  howmany [ 0 ] = s . nextInt ( ) ;
  howmany [ 2 ] = s . nextInt ( ) ;
  howmany [ 6 ] = s . nextInt ( ) ;
  howmany [ 8 ] = s . nextInt ( ) ;
  howmany [ 7 ] = s . nextInt ( ) - howmany [ 6 ] ;
  howmany [ 5 ] = s . nextInt ( ) - howmany [ 7 ] ;
  howmany [ 4 ] = s . nextInt ( ) - howmany [ 5 ] ;
  howmany [ 3 ] = s . nextInt ( ) - howmany [ 8 ] ;
  howmany [ 1 ] = s . nextInt ( ) - howmany [ 0 ] - howmany [ 2 ] - howmany [ 4 ] ;
  howmany [ 9 ] = s . nextInt ( ) - howmany [ 5 ] - howmany [ 6 ] - howmany [ 8 ] ;
  StringBuilder ans = new StringBuilder ( ) ;
  for ( int i : xrange ( 10 ) ) {
    ans . append ( i ) ;
  }
  Collections . sort ( ans ) ;
  return ans . toString ( ) ;
}
