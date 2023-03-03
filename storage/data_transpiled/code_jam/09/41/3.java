private static void Swap ( int [ ] arr , int i ) {
  arr [ i - 1 ] = arr [ i ] ;
  arr [ i ] = arr [ i - 1 ] ;
}
for ( int tc = 1 ;
tc <= Integer . parseInt ( input ( ) ) ;
tc ++ ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int [ ] nums = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String s = input ( ) ;
    nums [ i ] = s . lastIndexOf ( "1" ) + 1 ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int upperBound = i + 1 ;
    if ( nums [ i ] > upperBound ) {
      for ( int j = i + 1 ;
      j < n ;
      j ++ ) {
        if ( nums [ j ] <= upperBound ) {
          for ( int k = j ;
          k > i ;
          k -- ) {
            Swap ( nums , k ) ;
            ans ++ ;
          }
          break ;
        }
      }
    }
  }
  System . out . println ( "Case #" + tc + ": " + ans ) ;
}
