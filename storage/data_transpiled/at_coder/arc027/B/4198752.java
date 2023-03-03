public static int N = Integer . parseInt ( input ) {
  Integer S1 = input . nextInt ( ) ;
  Integer S2 = input . nextInt ( ) ;
  /* delete node */
  if ( relations . containsKey ( node ) ) {
    Set < Integer > wildcardDeletedNodes = relations . remove ( node ) ;
    for ( Integer wildcardDeletedNode : wildcardDeletedNodes ) {
      /* delete node */
    }
  }
  List < Integer > firsts = Arrays . asList ( S1 . intValue ( ) , S2 . intValue ( ) ) ;
  Map < Integer , Set < Integer >> relations = new HashMap < Integer , Set < Integer >> ( ) ;
  for ( int i = 0 ;
  i < 10 ;
  i ++ ) {
    Integer s1 = Integer . parseInt ( input . nextInt ( ) ) ;
    Integer s2 = Integer . parseInt ( input . nextInt ( ) ) ;
    if ( ! relations . containsKey ( s1 ) ) {
      relations . put ( s1 , new HashSet < Integer > ( ) ) ;
    }
    relations . get ( s1 ) . add ( s2 ) ;
    if ( ! relations . containsKey ( s2 ) ) {
      relations . put ( s2 , new HashSet < Integer > ( ) ) ;
    }
  }
  for ( int item = 0 ;
  item < 10 ;
  item ++ ) {
    String string = Integer . toString ( item ) ;
    /* delete node */
  }
  int ans = 1 ;
  while ( relations . size ( ) > 0 ) {
    Integer key = Collections . reverseOrder ( relations . keySet ( ) ) . get ( 0 ) ;
    ans *= ( 10 - ( firsts . contains ( key ) ) ) ;
    /* delete node */
    relations . remove ( key ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
