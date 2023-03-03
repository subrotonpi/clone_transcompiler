static final String getString ( ) {
  String S = input . nextLine ( ) ;
  char [ ] A = string . toCharArray ( ) ;
  List < String > ans = new LinkedList < > ( ) ;
  for ( char c : A ) {
    ans . add ( c ) ;
  }
  Collections . sort ( ans ) ;
  if ( ans . isEmpty ( ) ) {
    System . out . println ( "None" ) ;
  }
  else {
    System . out . println ( ans . get ( 0 ) ) ;
  }
  return S ;
}
