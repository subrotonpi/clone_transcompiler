public static void input ( ) {
  String s = input . readLine ( ) ;
  if ( s . length ( ) != 26 ) {
    Set < Character > se = new HashSet < Character > ( ) ;
    for ( char w : s . toCharArray ( ) ) {
      se . add ( w ) ;
    }
    for ( int i = 0 ;
    i < 26 ;
    i ++ ) {
      char w = ( char ) ( 'a' + i ) ;
      if ( ! se . contains ( w ) ) {
        System . out . println ( s + w ) ;
        exit ( ) ;
      }
    }
  }
  if ( s . equals ( "zyxwvutsrqponmlkjihgfedcba" ) ) {
    System . out . println ( - 1 ) ;
    exit ( ) ;
  }
  Set < Character > se = new HashSet < Character > ( ) ;
  for ( int i = 0 ;
  i < 26 ;
  i ++ ) {
    se . add ( s . charAt ( i ) ) ;
    for ( int j = ( s . charAt ( i ) - 'a' + 1 ) ;
    j < 26 ;
    j ++ ) {
      if ( se . contains ( ( char ) ( 'a' + j ) ) ) {
        System . out . println ( s . substring ( 0 , i ) + ( char ) ( 'a' + j ) ) ;
        exit ( ) ;
      }
    }
  }
}
