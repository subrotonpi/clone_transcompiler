public static void input ( ) {
  int num = Integer . parseInt ( input . nextLine ( ) ) ;
  int count = 1 ;
  List < List < Integer >> div8List = new ArrayList < > ( ) ;
  while ( count < num + 1 ) {
    if ( count % 2 != 0 ) {
      List < Integer > div = new ArrayList < > ( ) ;
      for ( int i = 1 ;
      i <= ( int ) ( count * 0.5 ) ;
      i ++ ) {
        if ( count % i == 0 ) {
          div . add ( i ) ;
          if ( i != count / i ) div . add ( count / i ) ;
        }
      }
      if ( div . size ( ) == 8 ) div8List . add ( div ) ;
    }
    count ++ ;
  }
  System . out . println ( div8List . size ( ) ) ;
}
