public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] [ ] rows = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) rows [ i ] [ i ] = input . toCharArray ( ) ;
  int ans = 0 ;
  for ( int n = 0 ;
  n < N ;
  n ++ ) {
    boolean flag = false ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      for ( int j = 0 ;
      j < N ;
      j ++ ) {
        int num = j - n >= 0 ? j - n : N + ( j - n ) ;
        int a = i - n >= 0 ? i - n : N + ( i - n ) ;
        if ( rows [ i ] [ num ] != rows [ j ] [ a ] ) {
          flag = true ;
          break ;
        }
      }
      if ( flag == true ) break ;
    }
    if ( flag == false ) ans ++ ;
  }
  System . out . println ( ans * N ) ;
  if ( args . length == 0 ) {
    N = Integer . parseInt ( input ) ;
    String [ ] Sss = new String [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) Sss [ i ] = input . toCharArray ( ) ;
    List < String > Sss_tr = Lists . newArrayList ( ) ;
    for ( int k = 0 ;
    k < N ;
    k ++ ) for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( ( Sss [ i ] . length ( ) - k ) + Sss [ i ] . substring ( 0 , Sss [ i ] . length ( ) - k ) != Sss_tr . get ( i - k ) ) break ;
    }
    else ans += N ;
  }
  System . out . println ( ans ) ;
}
