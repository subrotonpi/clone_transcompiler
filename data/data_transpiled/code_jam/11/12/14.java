static boolean same ( String [ ] w1 , String [ ] w2 , String [ ] l ) {
  for ( int i : xrange ( w1 . length ) ) {
    String c1 = w1 [ i ] ;
    String c2 = w2 [ i ] ;
    if ( c1 == c2 ) continue ;
    if ( l [ c1 ] . equals ( c2 ) || l [ c2 ] . equals ( c1 ) ) return false ;
  }
  return true ;
}
