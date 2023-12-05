public static int N = Integer . parseInt ( input ) {
  List < Integer > As = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < input . length ( ) ;
  i ++ ) As . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int ans = 0 ;
  while ( true ) {
    List < Integer > Bs = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < As . size ( ) ;
    i ++ ) Bs . add ( As . get ( i ) / N ) ;
    if ( Arrays . binarySearch ( Bs , 0 ) == 0 ) {
      System . out . println ( ans ) ;
      break ;
    }
    int sumB = Arrays . binarySearch ( Bs , 0 ) ;
    ans += sumB ;
    As . clear ( ) ;
    for ( int i = 0 ;
    i < As . size ( ) ;
    i ++ ) As . add ( As . get ( i ) % N + sumB - B ) ;
  }
  return ans ;
}
