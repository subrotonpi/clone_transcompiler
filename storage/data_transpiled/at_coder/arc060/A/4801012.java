public static int N = Integer . parseInt ( input ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] X = Arrays . stream ( input . nextLine ( ) . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int z = 0 ;
  HashMap < Integer , Integer > dic = new HashMap < > ( ) ;
  for ( int x : X ) {
    if ( x == 0 ) z ++ ;
    else {
      dic . put ( x , dic . getOrDefault ( x , 0 ) + 1 ) ;
    }
  }
  int [ ] line = new int [ dic . size ( ) ] ;
  line [ 0 ] = 1 ;
  for ( int k = 0 ;
  k < dic . size ( ) ;
  k ++ ) {
    HashMap < Integer , Integer > line_k = new HashMap < > ( ) ;
    for ( int i = 0 ;
    i < dic . size ( ) ;
    i ++ ) {
      line_k . put ( k * i , 1 ) ;
      for ( int j = dic . get ( k ) ;
      j > i ;
      j -- ) {
        line_k . put ( k + j , line_k . get ( k ) + line [ j ] * line [ j ] ) ;
      }
    }
    line = line_k . copy ( ) ;
  }
  System . out . println ( line [ 0 ] * ( 2 * z ) - 1 ) ;
  return z ;
}
