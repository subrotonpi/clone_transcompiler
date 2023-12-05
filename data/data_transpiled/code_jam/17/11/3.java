public static int tc = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
for ( int tes = 0 ;
tes < tc ;
tes ++ ) {
  int r = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
  List < List < String >> t = new LinkedList < List < String >> ( ) ;
  for ( int i = 0 ;
  i < r ;
  i ++ ) {
    t . add ( new LinkedList < String > ( ) ) ;
  }
  for ( int i = 0 ;
  i < r ;
  i ++ ) {
    if ( StringUtils . isNotBlank ( t . get ( i ) ) ) {
      char cha = Character . toUpperCase ( t . get ( i ) . charAt ( 0 ) ) ;
      for ( int j = 0 ;
      j < c ;
      j ++ ) {
        if ( t . get ( i ) . get ( j ) . equals ( '?' ) ) {
          t . set ( i , j , cha ) ;
        }
        else {
          cha = t . get ( i ) . get ( j ) ;
        }
      }
    }
  }
  List < String > row = new LinkedList < String > ( ) ;
  for ( int i = 0 ;
  i < r ;
  i ++ ) {
    if ( t . get ( i ) . get ( 0 ) . equals ( '?' ) ) {
      t . set ( i , row ) ;
    }
    else {
      row = t . get ( i ) ;
    }
  }
  System . out . println ( "Case #" + ( tes + 1 ) + ":" ) ;
  for ( int i = 0 ;
  i < r ;
  i ++ ) {
    System . out . println ( Arrays . toString ( t . get ( i ) ) ) ;
  }
}
return tc ;
}
