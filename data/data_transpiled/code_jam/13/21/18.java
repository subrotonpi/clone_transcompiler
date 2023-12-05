public static long solve ( int a , int [ ] motes ) throws IOException {
  long result = 100000000000 ;
  for ( int upto : xrange ( motes . length + 1 ) ) {
    result = Math . min ( result , motes . length - upto + getMin ( a , motes , 0 , upto ) ) ;
  }
  /* get min */
  int upto = 0 ;
  long ops = 0 ;
  while ( upto < motes . length ) {
    if ( a <= motes [ upto ] ) {
      if ( a < 2 ) {
        ops = 10000000000 ;
        break ;
      }
      a += a - 1 ;
      ops ++ ;
    }
    else {
      a += motes [ upto ] ;
      upto ++ ;
    }
  }
  String [ ] f = Files . readAllLines ( Paths . get ( "large.in" ) , StandardCharsets . UTF_8 ) . toArray ( new String [ 1 ] ) ;
  if ( ! f [ f . length - 1 ] . equals ( "large.in" ) ) f = Arrays . copyOfRange ( f , 0 , f . length - 1 ) ;
  for ( int i = xrange ( 0 , f . length , 2 ) ;
  i < f . length ;
  i ++ ) {
    int a = Integer . parseInt ( f [ i ] ) ;
    int n = Integer . parseInt ( f [ i + 1 ] ) ;
    motes = new ArrayList < Integer > ( ) ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      motes . add ( Integer . parseInt ( f [ i + j ] ) ) ;
    }
    System . out . println ( "Case #" + ( i / 2 + 1 ) + ": " + solve ( a , motes ) ) ;
  }
  return result ;
}
