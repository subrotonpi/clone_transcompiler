public static int getInt ( ) {
  s = Integer . parseInt ( input . nextLine ( ) ) ;
  int count = 2 ;
  int num = s ;
  List < Integer > collatzList = new ArrayList < Integer > ( ) ;
  collatzList . add ( s ) ;
  while ( true ) {
    if ( num % 2 == 0 ) {
      num = num / 2 ;
    }
    else {
      num = 3 * num + 1 ;
    }
    if ( collatzList . contains ( num ) ) {
      System . out . println ( count ) ;
      exit ( ) ;
    }
    else {
      collatzList . add ( num ) ;
      count ++ ;
    }
  }
}
