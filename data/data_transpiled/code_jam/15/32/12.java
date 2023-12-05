@ VisibleForTesting static void doTest ( String input ) {
  /* Cut the input and check for the output */
  for ( int i = 0 ;
  i < input . length ( ) ;
  ++ i ) {
    if ( input . startsWith ( input . substring ( i + 1 ) ) ) {
      return ;
    }
  }
  /* Run the test case */
  Arrays . sort ( input . split ( " " ) ) ;
  int klen = input . length ( ) ;
  int tlen = input . length ( ) ;
  int s = input . charAt ( klen ) ;
  int [ ] keyboard = new int [ tlen ] ;
  target = new int [ tlen ] ;
  System . arraycopy ( keyboard , 0 , target , 0 , klen ) ;
}
