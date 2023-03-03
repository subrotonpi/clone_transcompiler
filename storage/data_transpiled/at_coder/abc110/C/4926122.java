public static void input ( Scanner input ) {
  int S = input . nextInt ( ) ;
  int T = input . nextInt ( ) ;
  HashMap < Integer , Integer > dic1 = new HashMap < Integer , Integer > ( ) ;
  HashMap < Integer , Integer > dic2 = new HashMap < Integer , Integer > ( ) ;
  boolean flag = true ;
  for ( int i = 0 ;
  i < S ;
  i ++ ) {
    int j = input . nextInt ( ) ;
    if ( dic1 . containsKey ( i ) ) {
      if ( dic1 . get ( i ) != j ) {
        flag = false ;
        break ;
      }
    }
    dic1 . put ( i , j ) ;
    if ( dic2 . containsKey ( j ) ) {
      if ( dic2 . get ( j ) != i ) {
        flag = false ;
        break ;
      }
    }
    dic2 . put ( j , i ) ;
  }
  if ( flag ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
