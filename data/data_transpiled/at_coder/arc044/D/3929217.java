public static void print ( int N = Integer . parseInt ( input ) ) {
  * A , B ;
  int [ ] A = Integer . parseInt ( input . nextLine ( ) ) . split ( " " ) ;
  Arrays . sort ( A ) ;
  int [ ] C = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    C [ A [ i ] - 1 ] = i ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    C [ A [ i ] - 1 ] = i ;
  }
  int cur = ( byte ) 'A' ;
  int end = ( byte ) 'Z' ;
  char [ ] ans = new char [ N ] ;
  ans [ A [ 1 ] - 1 ] = cur ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    int a = A [ i ] ;
    int b = A [ i + 1 ] ;
    if ( C [ a ] > C [ b ] ) {
      cur ++ ;
    }
    ans [ A [ i + 1 ] - 1 ] = cur ;
  }
  if ( cur > end ) {
    System . out . println ( - 1 ) ;
  }
  else {
    System . out . print ( ( char ) ( ' ' ) + " " + ans [ 0 ] ) ;
  }
}
