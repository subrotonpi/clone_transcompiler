public static List < List < String >> hoge = new ArrayList < List < String >> ( ) {
  {
    for ( int i = 0 ;
    i < 4 ;
    i ++ ) {
      hoge . add ( new LinkedList < String > ( ) {
        {
          add ( input . nextLine ( ) ) ;
        }
      }
      ) ;
    }
  }
  ;
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 4 ;
    j ++ ) {
      System . out . print ( hoge . get ( 3 - i ) . get ( 3 - j ) + " " ) ;
    }
    System . out . println ( "" ) ;
  }
  return hoge ;
}
