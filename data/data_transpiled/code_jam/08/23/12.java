static final String nextLine ( ) {
  final String cachedIn = "" ;
  /* First line of the input line is in the file */
  if ( cachedIn . length ( ) > 0 ) {
    String res = new String ( cachedIn ) ;
    cachedIn = "" ;
    /* Next line of the file */
    while ( ! cachedIn . isEmpty ( ) ) {
      cachedIn = new String ( cachedIn ) ;
      cachedIn = "" ;
      /* Next line of the file */
    }
  }
  /* Return the first line of the file */
  return cachedIn ;
}
