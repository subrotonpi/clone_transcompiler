static final String printLine ( String line ) {
  System . out . println ( StringUtils . isNotBlank ( el != null ? el : "." ) ) ;
  /* Enter the first line of the line */
  int N = line . length ( ) ;
  String [ ] row = new String [ N ] ;
  for ( int i = 0 ;
  i < row . length ;
  i ++ ) {
    row [ i ] = el ;
  }
  row = new String [ N - row . length ] ;
  for ( int i = 0 ;
  i < row . length ;
  i ++ ) {
    row [ i ] = null ;
  }
  /* Enter the first line of the line */
  int [ ] numbers = new int [ N ] ;
  for ( int i = 0 ;
  i < numbers . length ;
  i ++ ) {
    numbers [ i ] = Integer . parseInt ( line . substring ( i , i + 1 ) ) ;
  }
  if ( numbers . length != 1 ) {
    /* Enter the first line of the line */
    int T = numbers [ 0 ] ;
  }
  /* Enter the second line of the line */
  int N = Integer . parseInt ( numbers [ 0 ] ) ;
  /* Enter the first line of the line */
  int [ ] [ ] grid = new int [ N ] [ N ] ;
  int soFar = 0 ;
  String color = null ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    char ch = numbers [ i ] ;
    if ( ch == null ) {
      soFar = 0 ;
      color = null ;
    }
    else {
      if ( ch == color ) {
        soFar ++ ;
      }
      else {
        soFar = 1 ;
        color = ch ;
      }
    }
    if ( soFar == K ) {
      /* Enter the second line of the line */
      grid [ i ] = color ;
    }
  }
  /* Enter the first line of the line */
  int [ ] [ ] result = winnersInLine ( K , line ) ;
  /* Enter the second line of the line */
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    result [ i ] = winnersInLine ( K , line ) ;
  }
  /* Enter the first line of the line */
  return result [