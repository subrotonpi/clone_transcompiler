public static void print ( int n ) {
  int [ ] [ ] a = new int [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    a [ i ] = new int [ ] {
      x , y }
      ;
    }
    List < Integer > l = new ArrayList < Integer > ( a ) ;
    List < Integer > r = new ArrayList < Integer > ( a ) ;
    Collections . sort ( l , new Comparator < Integer > ( ) {
      public int compare ( Integer o1 , Integer o2 ) {
        return - o1 . compareTo ( o2 ) ;
      }
    }
    ) ;
    Collections . sort ( r , new Comparator < Integer > ( ) {
      public int compare ( Integer o1 , Integer o2 ) {
        return - o1 . compareTo ( o2 ) ;
      }
    }
    ) ;
    int left = 0 ;
    int hi = 0 ;
    int mi = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      hi += l [ i ] . intValue ( ) ;
      left = Math . max ( left , ( hi - mi ) * 2 ) ;
      mi += r [ i ] . intValue ( ) ;
      left = Math . max ( left , ( hi - mi ) * 2 ) ;
    }
    int right = 0 ;
    hi = 0 ;
    mi = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      mi += r [ i ] . intValue ( ) ;
      right = Math . max ( right , ( hi - mi ) * 2 ) ;
      hi += l [ i ] . intValue ( ) ;
      right = Math . max ( right , ( hi - mi ) * 2 ) ;
    }
    System . out . println ( Math . max ( right , left ) ) ;
  }
  