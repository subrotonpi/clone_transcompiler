public static int N = Integer . parseInt ( input ) {
  int [ ] R = list . split ( " " ) ;
  int [ ] a = new int [ 8 ] ;
  int b = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( R [ i ] < 400 ) a [ 0 ] ++ ;
    else if ( R [ i ] < 800 ) a [ 1 ] ++ ;
    else if ( R [ i ] < 1200 ) a [ 2 ] ++ ;
    else if ( R [ i ] < 1600 ) a [ 3 ] ++ ;
    else if ( R [ i ] < 2000 ) a [ 4 ] ++ ;
    else if ( R [ i ] < 2400 ) a [ 5 ] ++ ;
    else if ( R [ i ] < 2800 ) a [ 6 ] ++ ;
    else if ( R [ i ] < 3200 ) a [ 7 ] ++ ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < 8 ;
  i ++ ) if ( a [ i ] != 0 ) ans ++ ;
  String ans2 = Integer . toString ( ans ) ;
  if ( ans == 0 ) ans = 1 ;
  String ans1 = Integer . toString ( ans ) ;
  System . out . println ( ans1 + " " + ans2 ) ;
  return ans ;
}
