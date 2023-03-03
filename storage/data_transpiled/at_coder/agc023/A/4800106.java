public static int n ( ) {
  int [ ] slist = new int [ n ] ;
  slist [ 0 ] = 0 ;
  for ( int a : map . values ( ) ) {
    slist [ n ] = slist [ n - 1 ] + a ;
  }
  slist [ n ] = slist [ n - 1 ] + Math . pow ( 10 , 9 ) + 5 ;
  int prevs = 0 ;
  int c = 0 ;
  int ans = 0 ;
  for ( int s : new ArrayList < > ( slist ) ) {
    if ( prevs == 0 ) {
      prevs = s ;
      c = 1 ;
    }
    else {
      if ( prevs == s ) {
        c ++ ;
      }
      else {
        ans += ( c * ( c - 1 ) ) / 2 ;
        c = 1 ;
        prevs = s ;
      }
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
