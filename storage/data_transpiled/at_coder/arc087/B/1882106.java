public static boolean f ( int [ ] m , String s , int g ) {
  Set < Integer > v = new THashSet < Integer > ( ) , t = new HashSet < Integer > ( ) ;
  for ( int i = 0 ;
  i < m . length ;
  i ++ ) {
    for ( int j = 0 ;
    j < v . size ( ) ;
    j ++ ) {
      t . add ( new Integer ( j + i ) ) ;
    }
    v . clear ( ) ;
    t = new HashSet < Integer > ( ) ;
  }
  return v . contains ( g ) ;
  s = input . nextLine ( ) ;
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int y = Integer . parseInt ( input . nextLine ( ) ) ;
  int len = Integer . parseInt ( s . substring ( 0 , len ) ) ;
  if ( f ( m , 0 , 0 , x ) && f ( m , 1 , 0 , y ) ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
