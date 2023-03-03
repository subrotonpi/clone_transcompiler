static void m ( int n , int m ) {
  List < List < Integer >> x = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) x . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  @ SuppressWarnings ( "unchecked" ) int res = 0 ;
  for ( int a : new int [ ] {
    - 1 , 1 }
    ) {
      List < Integer > ts = new ArrayList < > ( ) ;
      for ( List < Integer > t : x ) ts . add ( t ) ;
      int s = ts . stream ( ) . sorted ( ) . limit ( m ) . sum ( ) ;
      res = Math . max ( res , s ) ;
    }
    System . out . println ( res ) ;
  }
  