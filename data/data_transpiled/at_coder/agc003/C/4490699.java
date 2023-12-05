static final int [ ] getNegativeInstances ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] nums = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    nums [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Map < Integer , Integer > taiou = new HashMap < > ( ) ;
  int [ ] reprica = new int [ nums . length ] ;
  for ( int i = 0 ;
  i < reprica . length ;
  i ++ ) {
    taiou . put ( reprica [ i ] , i ) ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < nums . length ;
  i ++ ) {
    if ( nums [ i ] % 2 != taiou . get ( nums [ i ] ) % 2 ) ans ++ ;
  }
  System . out . println ( ans / 2 ) ;
  return nums ;
}
