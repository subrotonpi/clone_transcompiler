static final int [ ] [ ] input ( ) {
  int h = Integer . parseInt ( input . readLine ( ) ) ;
  int w = Integer . parseInt ( input . readLine ( ) ) ;
  List < List < Integer >> aList = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    aList . add ( Collections . singletonList ( input . readLine ( ) ) ) ;
  }
  List < Integer > res = new ArrayList < > ( ) ;
  for ( List < Integer > a : aList ) {
    if ( new HashSet < > ( a ) . size ( ) != 1 ) {
      res . add ( a ) ;
    }
  }
  int size = res . size ( ) ;
  List < Integer > resT = new ArrayList < > ( ) ;
  for ( List < Integer > a : res ) {
    if ( new HashSet < > ( a ) . size ( ) != 1 ) {
      resT . add ( a ) ;
    }
  }
  for ( int a : list ( resT ) ) {
    System . out . println ( StringUtils . join ( a , "" ) ) ;
  }
  return resT . toArray ( new String [ size ] [ ] ) ;
}
