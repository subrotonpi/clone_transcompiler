public static int N = Integer . parseInt ( input ) {
  int [ ] a = Arrays . stream ( input . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int [ ] ans = new int [ 10 * 5 + 1 ] ;
  for ( int i : a ) {
    if ( i != 0 ) {
      ans [ i - 1 ] ++ ;
      ans [ i ] ++ ;
      ans [ i ] ++ ;
    }
    else {
      ans [ i ] ++ ;
      ans [ i + 1 ] ++ ;
    }
  }
  System . out . println ( max ( ans ) ) ;
  return ans . length ;
}
