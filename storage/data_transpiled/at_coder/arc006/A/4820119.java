public static List < Integer > convert ( String input ) {
  List < Integer > E = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < input . length ( ) ;
  i ++ ) {
    E . add ( Integer . parseInt ( input . substring ( i , i + 1 ) ) ) ;
  }
  int b = Integer . parseInt ( input . substring ( 0 , i + 1 ) ) ;
  List < Integer > L = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < input . length ( ) ;
  i ++ ) {
    L . add ( Integer . parseInt ( input . substring ( i , i + 1 ) ) ) ;
  }
  int cnt = 0 ;
  int bonus = 0 ;
  for ( int l : L ) {
    if ( E . contains ( l ) ) {
      cnt ++ ;
    }
    else if ( l == b ) {
      bonus ++ ;
    }
  }
  if ( cnt == 6 ) {
    System . out . println ( 1 ) ;
  }
  else if ( cnt == 5 && bonus == 1 ) {
    System . out . println ( 2 ) ;
  }
  else if ( cnt == 5 ) {
    System . out . println ( 3 ) ;
  }
  else if ( cnt == 4 ) {
    System . out . println ( 4 ) ;
  }
  else if ( cnt == 3 ) {
    System . out . println ( 5 ) ;
  }
  else {
    System . out . println ( 0 ) ;
  }
  return L ;
}
