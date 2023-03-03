public static void input ( ) {
  String s = input . nextLine ( ) . trim ( ) ;
  String t = input . nextLine ( ) . trim ( ) ;
  if ( s . length ( ) < t . length ( ) ) {
    System . out . println ( "UNRESTORABLE" ) ;
  }
  else {
    List < String > cands = new ArrayList < String > ( ) ;
    for ( int i = 0 ;
    i < s . length ( ) - t . length ( ) + 1 ;
    i ++ ) {
      boolean isMatch = true ;
      for ( int j = i ;
      j < s . length ( ) - t . length ( ) ;
      j ++ ) {
        char _s = s . charAt ( j ) ;
        char _t = t . charAt ( j ) ;
        if ( _s != '?' ) {
          if ( _s != _t ) {
            isMatch = false ;
            break ;
          }
        }
      }
      if ( isMatch ) {
        String cand = s . replace ( '?' , 'a' ) ;
        cand = cand . substring ( 0 , i ) + t + cand . substring ( i + t . length ( ) ) ;
        cands . add ( cand ) ;
      }
    }
    if ( cands . size ( ) > 0 ) {
      System . out . println ( Collections . unmodifiableList ( cands ) . toString ( ) ) ;
    }
    else {
      System . out . println ( "UNRESTORABLE" ) ;
    }
  }
}
