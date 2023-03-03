public static int tnum = Integer . parseInt ( new Scanner ( System . in ) . nextLine ( ) ) {
  /* Enter the string to be a string of characters that are not in the string form. */
  String s = new String ( ) ;
  if ( s . length ( ) == 0 || s . charAt ( 0 ) != s . charAt ( s . length ( ) - 1 ) ) {
    return 0 ;
  }
  Map < String , List < String >> ngb = Maps . newHashMap ( ) ;
  /* Enter the string to be a list of characters */
  if ( ngb . containsKey ( s ) ) {
    return 0 ;
  }
  ngb . put ( s , new ArrayList < String > ( ) ) ;
  for ( int i = 0 ;
  i <= s . length ( ) ;
  i ++ ) {
    String t = new String ( "" . equals ( s . charAt ( i ) ) ? "-" : "+" ) + s . substring ( i ) ;
    ngb . get ( s ) . add ( s . substring ( i ) ) ;
    /* Enter the string to be a list of characters */
    ngb . get ( s ) . add ( s . substring ( i ) ) ;
    /* Enter the string to be a list of characters */
  }
  for ( int tcou = 0 ;
  tcou < tnum ;
  tcou ++ ) {
    String s = new String ( new Scanner ( System . in ) . nextLine ( ) . trim ( ) ) ;
    ngb . clear ( ) ;
    /* Enter the string to be a list of characters */
    int [ ] dist = new int [ ngb . size ( ) ] ;
    for ( int i = 0 ;
    i < dist . length ;
    i ++ ) {
      dist [ i ] = 0 ;
    }
  }
  /* Enter the string to be a list of characters */
  for ( int tcou = 0 ;
  tcou < tnum ;
  tcou ++ ) {
    String s = new String ( new Scanner ( System . in ) . nextLine ( ) . trim ( ) ) ;
    ngb . put ( s , null ) ;
    / * ▁ Enter ▁ the ▁ string ▁ to ▁ be ▁ a ▁