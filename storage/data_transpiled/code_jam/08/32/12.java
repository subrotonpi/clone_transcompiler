static final String os = "sys" , regex = "" , string = "" ) {
  /* This is an ugly way */
  int index ;
  int count = 0 ;
  if ( index == 1 ) {
    return 0 ;
  }
  if ( index == 0 || ( index & 1 ) == 0 || ( index % 3 ) == 0 || ( index % 5 ) == 0 || ( index % 7 ) == 0 ) {
    return 1 ;
  }
  else {
    /* main */
    int count = Integer . parseInt ( System . in . readLine ( ) ) ;
    /* calculate the values */
    int length = values . length ;
    /* g the value */
    if ( i == valen - 1 ) {
      /* check for the first */
      return isLong ( v ) ;
    }
    /* f the first two values */
    int [ ] result = new int [ length ] ;
    /* f the first two values */
    if ( i == length - 1 ) {
      result [ 0 ] = va ;
      return result ;
    }
    /* f the first two values */
    result [ 0 ] = va ;
    /* f the first two values */
    result [ 1 ] = va [ 0 ] + ( va [ 0 ] * 10 + va [ 1 ] ) + va [ 2 ] ;
    /* f the first two values */
    result [ 2 ] = va [ 0 ] + ( va [ 1 ] * 10 + va [ 2 ] ) + va [ 2 ] ;
    /* f the first two values */
    int [ ] arys = new int [ length ] ;
    /* f the first two values */
    result [ 0 ] = arys [ 0 ] + ( va [ 0 ] * 10 + va [ 1 ] ) + va [ 2 ] ;
    /* f the first two values */
    result [ 1 ] = arys [ 1 ] + ( va [ 0 ] * 10 + va [ 2 ] ) + va [ 2 ] ;
    /* f the first two values */
    result [ 2 ] = arys [ 2 ] + ( va [ 0 ] * 10 + va [ 1 ] ) + va [ 2 ] ;
    /* f the first two values */
    result [ 3 ] = arys [ 3