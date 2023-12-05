public static LinkedList < Integer > listOutput = new LinkedList < Integer > ( ) {
  LinkedList < Integer > listInput = new LinkedList < Integer > ( ) ;
  int nNum = Integer . parseInt ( input . nextLine ( ) ) ;
  String strInput = input . nextLine ( ) ;
  listInput = strInput . split ( " " ) ;
  while ( ( listInput . size ( ) > 0 ) && ( ( nNum - 1 ) >= 0 ) ) {
    if ( Integer . parseInt ( listInput . get ( nNum - 1 ) ) == nNum ) {
      listOutput . add ( 0 , nNum ) ;
      listInput . remove ( nNum - 1 ) ;
      nNum = listInput . size ( ) ;
      continue ;
    }
    nNum -- ;
  }
  if ( listInput . size ( ) == 0 ) {
    while ( ( listOutput . size ( ) > 0 ) && ( listOutput . size ( ) > 0 ) ) {
      System . out . println ( listOutput . remove ( 0 ) ) ;
    }
  }
  else {
    System . out . println ( "-1" ) ;
  }
  return listOutput ;
}
