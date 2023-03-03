{
  l = new int [ ] {
    Integer . parseInt ( input . nextLine ( ) ) , Integer . parseInt ( input . nextLine ( ) ) , Integer . parseInt ( input . nextLine ( ) ) }
    ;
    ArrayList < Integer > s = new ArrayList < > ( l ) ;
    HashMap < Integer , Integer > map = new HashMap < > ( ) ;
    map . put ( s . get ( 2 ) , 1 ) ;
    map . put ( s . get ( 1 ) , 2 ) ;
    map . put ( s . get ( 0 ) , 3 ) ;
    for ( int i : l ) {
      System . out . println ( map . get ( i ) ) ;
    }
  }
  