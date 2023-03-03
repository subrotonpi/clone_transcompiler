public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int n = 40 ;
  for ( int i = 40 ;
  i >= 0 ;
  i -- ) {
    if ( ( N >= ( 1 << i ) - 1 ) && ( N >= ( 1 << i ) ) ) {
      n = i ;
      break ;
    }
  }
  int [ ] data = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    data [ i ] = i + 1 ;
  }
  N -= ( 1 << n ) - 1 ;
  int tmp = n ;
  for ( int i = n - 1 ;
  i >= 0 ;
  i -- ) {
    if ( ( N < ( 1 << i ) ) && ( N >= ( 1 << i ) ) ) {
      continue ;
    }
    tmp ++ ;
    data = Arrays . copyOf ( data , i ) ;
    data [ i ] = tmp ;
    data [ i ] = data [ i ] ;
    N -= ( 1 << i ) ;
  }
  int [ ] ans = new int [ data . length ] ;
  for ( int x = 0 ;
  x < ans . length ;
  x ++ ) {
    ans [ x ] = data [ x ] + 1 ;
  }
  ans = Arrays . copyOf ( ans , ans . length ) ;
  System . out . println ( ans . length ) ;
  System . out . println ( Arrays . toString ( ans ) ) ;
}
