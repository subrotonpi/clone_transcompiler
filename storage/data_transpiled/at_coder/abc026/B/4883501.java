public static double [ ] getHoge ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  double [ ] hoge = new double [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    hoge [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  Arrays . sort ( hoge , Collections . reverseOrder ( ) ) ;
  double ans = 0 ;
  int flag = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ( flag == 0 ) && ( hoge [ i ] < 0 ) ) {
      ans += hoge [ i ] * hoge [ i ] ;
      flag = 1 ;
    }
    else {
      ans -= hoge [ i ] * hoge [ i ] ;
      flag = 0 ;
    }
  }
  System . out . println ( ans * 3.1415926535 ) ;
  return ans ;
}
