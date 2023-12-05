public static void matches ( String [ ] args ) {
  matches = {
    0 , 2 , 5 , 5 , 4 , 5 , 6 , 3 , 7 , 6 }
    ;
    int n = Integer . parseInt ( input . nextLine ( ) ) ;
    int m = Integer . parseInt ( input . nextLine ( ) ) ;
    List < Integer > alist = Lists . newArrayList ( ) ;
    for ( int i = 0 ;
    i < n + 1 ;
    i ++ ) {
      alist . add ( i ) ;
    }
    Arrays . sort ( alist ) ;
    dp = new int [ n ] ;
    dp [ 0 ] = - 1 ;
  }
  