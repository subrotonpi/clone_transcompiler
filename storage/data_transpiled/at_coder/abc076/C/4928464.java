public static String print ( String s ) {
  String t = new String ( input ) ;
  int slen = s . length ( ) ;
  int tlen = t . length ( ) ;
  ArrayList < Integer > cand = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < slen - tlen + 1 ;
  i ++ ) {
    boolean match = true ;
    for ( int j = 0 ;
    j < tlen ;
    j ++ ) {
      if ( s . charAt ( i + j ) == '?' || s . charAt ( i + j ) == t . charAt ( j ) ) {
      }
      else {
        match = false ;
      }
    }
    if ( match ) {
      cand . add ( i ) ;
    }
  }
  if ( cand . size ( ) != 0 ) {
    Collections . reverse ( cand ) ;
    String ans = "" ;
    for ( int i = 0 ;
    i < slen ;
    i ++ ) {
      if ( ! ( cand . get ( 0 ) <= i && i < cand . get ( 0 ) + tlen ) ) {
        if ( s . charAt ( i ) == '?' ) ans += "a" ;
        else ans += s . charAt ( i ) ;
      }
      else ans += t . charAt ( i - cand . get ( 0 ) ) ;
    }
    System . out . println ( ans ) ;
  }
  else {
    System . out . println ( "UNRESTORABLE" ) ;
  }
  return ans ;
}
