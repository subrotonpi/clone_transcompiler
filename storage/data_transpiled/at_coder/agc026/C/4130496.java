@ VisibleForTesting static LinkedHashMap < String , Integer > makeDic ( String s ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  String s = input . nextLine ( ) ;
  String s1 = s . substring ( 0 , n ) ;
  String s2 = s . substring ( n ) . substring ( 0 , s . length ( ) - 1 ) ;
  /* make the dic */
  LinkedHashMap < String , Integer > dic = new LinkedHashMap < String , Integer > ( ) ;
  for ( int i = 0 ;
  i < 2 * n ;
  i ++ ) {
    int mask = 1 ;
    String c1 = "" ;
    String c2 = "" ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( ( i & mask ) != 0 ) {
        c1 += s . charAt ( j ) ;
      }
      else {
        c2 += s . charAt ( j ) ;
      }
      mask <<= 1 ;
    }
    dic . put ( new String ( c1 ) , new Integer ( c2 ) ) ;
  }
  return dic ;
}
