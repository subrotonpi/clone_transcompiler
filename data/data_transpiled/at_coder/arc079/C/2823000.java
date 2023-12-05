public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  List < Integer > aaa = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    aaa . add ( i ) ;
  }
  int ans = 0 ;
  while ( true ) {
    boolean flag = true ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int a = aaa . get ( i ) ;
      if ( a >= n ) {
        flag = false ;
        int k = ( a - n ) / n + 1 ;
        ans += k ;
        for ( int j = 0 ;
        j < n ;
        j ++ ) {
          if ( i == j ) {
            aaa . set ( j , k * n ) ;
          }
          else {
            aaa . set ( j , k ) ;
          }
        }
      }
    }
    if ( flag ) {
      break ;
    }
  }
  System . out . println ( ans ) ;
}
