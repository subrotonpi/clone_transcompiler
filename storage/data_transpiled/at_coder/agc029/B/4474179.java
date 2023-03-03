public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( Integer . parseInt ( input ) ) ;
  }
  Collections . sort ( A , Collections . reverseOrder ( ) ) ;
  HashMap < Integer , Integer > dic = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( dic . containsKey ( A . get ( i ) ) ) {
      dic . put ( A . get ( i ) , ++ i ) ;
    }
    else {
      dic . put ( A . get ( i ) , 1 ) ;
    }
  }
  int res = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( dic . containsKey ( A . get ( i ) ) ) {
      int n = 0 ;
      int tmp = A . get ( i ) ;
      do {
        if ( tmp == 0 ) break ;
        tmp /= 2 ;
        n ++ ;
      }
      while ( tmp > 0 ) ;
      if ( 2 * n - A . get ( i ) == A . get ( i ) && dic . get ( A . get ( i ) ) < 2 ) {
      }
      else {
        res ++ ;
        dic . put ( 2 * n - A . get ( i ) , -- i ) ;
        if ( dic . get ( 2 * n - A . get ( i ) ) == 0 ) dic . remove ( 2 * n - A . get ( i ) ) ;
      }
    }
    dic . put ( A . get ( i ) , -- i ) ;
    if ( dic . get ( A . get ( i ) ) == 0 ) dic . remove ( A . get ( i ) ) ;
  }
  System . out . println ( res ) ;
}
