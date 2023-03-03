public static int N = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int Base = 0 ;
  int Combo = 0 ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int num = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( num > Base ) {
      Base = num ;
      Combo ++ ;
      if ( Combo >= K ) ans ++ ;
    }
    else {
      Base = num ;
      Combo = 1 ;
      if ( Combo >= K ) ans ++ ;
    }
  }
  return ans ;
}
