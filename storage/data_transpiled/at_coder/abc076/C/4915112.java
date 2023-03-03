public static String input ( ) {
  String sp = input ( ) ;
  String t = input ( ) ;
  int len_t = t . length ( ) ;
  int len_s = sp . length ( ) ;
  char [ ] cand = new char [ len_s ] ;
  int partStart = - 1 ;
  for ( int i = 0 ;
  i < len_s - len_t + 1 ;
  i ++ ) {
    int num = 0 ;
    for ( int j = 0 ;
    j < len_t ;
    j ++ ) {
      if ( ( sp . charAt ( i + j ) == '?' ) || ( sp . charAt ( i + j ) == t . charAt ( j ) ) ) {
        num ++ ;
      }
    }
    if ( ( num == len_t ) && ( partStart == i ) ) {
      partStart = i ;
    }
  }
  if ( partStart != - 1 ) {
    String ans = sp . substring ( 0 , partStart ) + t + sp . substring ( partStart + len_t , len ) ;
    ans = ans . replace ( '?' , 'a' ) ;
    System . out . println ( ans ) ;
  }
  else {
    System . out . println ( "UNRESTORABLE" ) ;
  }
  return cand ;
}
