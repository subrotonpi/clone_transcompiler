public static int n = Integer . parseInt ( input ) {
  int [ ] uni = new int [ 10 + 26 ] ;
  for ( int i = 0 ;
  i < uni . length ;
  i ++ ) {
    uni [ i ] = - 1 ;
  }
  /* root of the string */
  if ( uni [ 0 ] < 0 ) {
    /* a */
  }
  else {
    uni [ 0 ] = root ( uni [ 0 ] ) ;
    /* num check */
  }
  /* connect to the string */
  char a , b ;
  /* connect to the string */
  a = root ( a ) ;
  b = root ( b ) ;
  if ( a == b ) {
    /* return false */
  }
  if ( uni [ a ] > uni [ b ] ) {
    a = b ;
    b = a ;
  }
  uni [ a ] += uni [ b ] ;
  uni [ b ] = a ;
  /* print out the string */
  String [ ] [ ] s = new String [ 2 ] [ n ] ;
  for ( int i = 0 ;
  i < s . length ;
  i ++ ) {
    s [ i ] = new String ( input ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < s [ j ] . length ;
    j ++ ) {
      if ( Character . isLetter ( s [ j ] [ i ] ) ) {
        s [ j ] [ i ] = Character . digit ( s [ j ] [ i ] , 16 ) - 64 + 9 ;
      }
      else {
        s [ j ] [ i ] = Integer . parseInt ( s [ j ] [ i ] ) ;
      }
    }
    /* print out the string */
  }
  List < Integer > dig_root = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < 10 ;
  i ++ ) {
    dig_root . add ( root ( i ) ) ;
  }
  List < Integer > t = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    t . add ( root ( s [ 0 ] [ i ] ) ) ;
  }
  int ini = root ( s [ 0 ] [ 0 ] ) ;
  int ans = 1 ;
  for ( int i : Collections . list ( t ) ) {
    if ( dig_root . contains ( i ) ) ans *= 1 ;
    else {
      if ( s [