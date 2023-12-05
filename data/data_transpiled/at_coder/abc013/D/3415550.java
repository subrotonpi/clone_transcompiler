static final int [ ] [ ] getBinaryList ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int D = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N + 1 ] ;
  for ( int a = 0 ;
  a < A . length ;
  a ++ ) {
    A [ a ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] [ ] ANS = new int [ N + 1 ] [ N + 1 ] ;
  for ( int a = 0 ;
  a < N ;
  a ++ ) {
    ANS [ a - 1 ] = ANS [ a ] ;
  }
  List < Integer > LIST = new ArrayList < Integer > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    LIST . add ( ANS [ i ] - 1 , i + 1 ) ;
  }
  List < Integer > BINLIST = new ArrayList < Integer > ( ) ;
  BINLIST . add ( LIST ) ;
  for ( int i = 0 ;
  i < 35 ;
  i ++ ) {
    Integer [ ] NEXT = new Integer [ N ] ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      NEXT [ j ] = null ;
      for ( int j = 0 ;
      j < N ;
      j ++ ) {
        NEXT [ j ] = BINLIST . get ( j - 1 ) [ BINLIST . get ( j - 1 ) - 1 ] ;
      }
      BINLIST . add ( NEXT ) ;
    }
  }
  ANS = new LinkedList < Integer > ( ) ;
  for ( int j = 1 ;
  j < Integer . SIZE ;
  j ++ ) {
    Integer [ ] NEXT = new Integer [ N ] ;
    if ( Integer . valueOf ( D ) . intValue ( ) == "1" ) {
      for ( int k = 0 ;
      k < N ;
      k ++ ) {
        NEXT [ j ] [ BINLIST . get ( j ) - 1 ] = ANS [ k ] ;
      }
    }
    else {
      NEXT = new Integer [ N ] ;
    }
    ANS = new ArrayList < Integer > ( ) ;
  }
  list = new ArrayList < Integer > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    list . add ( ANS [ i ] - 1 , i + 1 ) ;
  }
  for ( int l : LIST ) {
    System . out . println ( l ) ;
  }
  return null ;
}
