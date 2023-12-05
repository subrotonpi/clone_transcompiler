static final int solve ( int n , int k , String s ) {
  int a = Character . digit ( s . charAt ( 0 ) , 16 ) ;
  if ( n / 2 < k ) return false ;
  HashMap < String , Integer > map = new HashMap < String , Integer > ( ) ;
  int [ ] t = new int [ 26 ] ;
  for ( int i = s . length ( ) - a ;
  i >= k ;
  i -- ) {
    t [ s . charAt ( i ) - a ] ++ ;
  }
  String u = StringUtils . join ( s , t ) ;
  map . put ( u , 0 ) ;
  for ( int i = 1 ;
  i <= n - k ;
  i ++ ) {
    t [ s . charAt ( i - 1 ) - a ] -- ;
    t [ s . charAt ( k - 1 + i ) - a ] ++ ;
    u = StringUtils . join ( s , t ) ;
    if ( map . containsKey ( u ) ) {
      if ( k <= i - map . get ( u ) ) return true ;
    }
    else map . put ( u , i ) ;
  }
  /* main program */
  n = input . nextInt ( ) ;
  k = input . nextInt ( ) ;
  n = Integer . parseInt ( n ) ;
  k = Integer . parseInt ( k ) ;
  String s = input . nextLine ( ) ;
  System . out . println ( solve ( n , k , s ) ? "YES" : "NO" ) ;
  if ( getClass ( ) . isEnum ( ) ) {
    return 1 ;
  }
  return 0 ;
}
