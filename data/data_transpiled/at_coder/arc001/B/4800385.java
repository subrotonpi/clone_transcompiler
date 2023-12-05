public static int A = Integer . parseInt ( input ) {
  int [ ] ds = {
    - 10 , - 5 , - 1 , 1 , 5 , 10 }
    ;
    int ans = 0 ;
    Set < Integer > mem = new HashSet < Integer > ( ) ;
    mem . add ( A ) ;
    while ( true ) {
      if ( mem . contains ( B ) ) {
        System . out . println ( ans ) ;
        exit ( ) ;
      }
      ans ++ ;
      Set < Integer > mem2 = new HashSet < Integer > ( ) ;
      for ( int a : mem ) {
        for ( int d : ds ) {
          if ( ! - 15 < a + d < 55 ) continue ;
          mem2 . add ( a + d ) ;
        }
      }
      mem = mem2 ;
    }
  }
  