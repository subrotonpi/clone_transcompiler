public static int n ( int x ) {
  int i , j ;
  List < Integer > alist = Lists . newArrayList ( ) ;
  for ( i = 0 ;
  i < n ;
  i ++ ) alist . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int [ ] blist = alist . toArray ( ) ;
  int ans = 0 ;
  for ( i = 0 ;
  i < n ;
  i ++ ) {
    for ( j = 0 ;
    j < n ;
    j ++ ) {
      blist [ j ] = Math . min ( blist [ j ] , alist . get ( j - i ) ) ;
    }
    if ( ans == 0 ) {
      ans = i * x + Arrays . binarySearch ( blist ) ;
    }
    else {
      ans = Math . min ( ans , i * x + Arrays . binarySearch ( blist ) ) ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
