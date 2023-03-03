static final int [ ] [ ] input ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  ArrayList < Integer [ ] > T = new ArrayList < > ( ) ;
  int judge = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    String [ ] t = input . nextLine ( ) . split ( " " ) ;
    for ( int j = 0 ;
    j < K ;
    j ++ ) {
      t [ j ] = Integer . parseInt ( t [ j ] ) ;
    }
    T . add ( t ) ;
  }
  ArrayList < Integer [ ] > tmp = new ArrayList < > ( T ) ;
  int len = tmp . size ( ) ;
  for ( int i = 0 ;
  i < len ;
  i ++ ) {
    Integer [ ] a = tmp . get ( i ) ;
    for ( int j = 0 ;
    j < a . length ;
    j ++ ) {
      int b ;
      if ( ( b = a [ j ] ) == 0 ) {
        b = a [ j ] ;
      }
      else {
        b = b ^ a [ j ] ;
      }
    }
    if ( ( b == 0 ) && ( judge == 0 ) ) {
      judge = 1 ;
      break ;
    }
  }
  if ( ( judge == 0 ) && ( judge == 1 ) ) {
    System . out . println ( "Nothing" ) ;
  }
  else {
    System . out . println ( "Found" ) ;
  }
  return T . toArray ( new Integer [ 0 ] [ ] ) ;
}
