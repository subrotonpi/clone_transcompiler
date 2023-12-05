@ VisibleForTesting static LinkedHashMap < Integer , Integer > map ( String input ) {
  LinkedHashMap < Integer , Integer > map = new LinkedHashMap < > ( ) ;
  int n = Integer . parseInt ( input ) ;
  int c = Integer . parseInt ( input ) ;
  LinkedHashMap < Integer , Integer > do = map . get ( Integer . class ) ;
  LinkedHashMap < Integer , Integer > de = map . get ( Integer . class ) ;
  do . put ( 0 , 0 ) ;
  de . put ( 0 , 0 ) ;
  for ( int i = 0 ;
  i < n / 2 ;
  i ++ ) {
    do . put ( input , 1 ) ;
    de . put ( input , 1 ) ;
  }
  if ( n % 2 != 0 ) do . put ( input , 1 ) ;
  Integer o = Collections . max ( do , new Comparator < Integer > ( ) {
    public int compare ( Integer o1 , Integer o2 ) {
      return o1 - o2 ;
    }
  }
  ) ;
  Integer e = Collections . max ( de , new Comparator < Integer > ( ) {
    public int compare ( Integer o1 , Integer o2 ) {
      return o2 - o1 ;
    }
  }
  ) ;
  if ( o != e ) System . out . println ( ( n - do . get ( o ) - de . get ( e ) ) * c ) ;
  else {
    Integer vo = do . remove ( o ) ;
    Integer ve = de . remove ( e ) ;
    Integer vo2 = Collections . max ( do . values ( ) ) ;
    Integer ve2 = Collections . max ( de . values ( ) ) ;
    System . out . println ( ( n - Math . max ( vo + ve2 , ve + vo2 ) ) * c ) ;
  }
}
