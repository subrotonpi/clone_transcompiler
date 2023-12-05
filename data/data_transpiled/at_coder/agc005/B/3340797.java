@ VisibleForTesting static void heapSort ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = Lists . newArrayList ( ) . stream ( ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  HITS hITS = new HITS ( ) ;
  long ans = 0 ;
  for ( int i = 0 , n = a . length ;
  i < n ;
  i ++ ) {
    long mul = 1 ;
    while ( hITS . hasNext ( ) && hITS . next ( ) . get ( ) < - n ) {
      long m = hITS . next ( ) ;
      long j = hITS . next ( ) ;
      long _mul = mul / 2 ;
      ans += - m * ( i - j ) * _mul ;
      mul += _mul ;
    }
    hITS . next ( ) . add ( new HITS ( - n , i , mul ) ) ;
  }
  System . out . println ( ans ) ;
}
