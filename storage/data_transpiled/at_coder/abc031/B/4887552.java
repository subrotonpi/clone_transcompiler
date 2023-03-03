public static int Low = Integer . parseInt ( input ) {
  int High = Integer . parseInt ( input . nextLine ( ) ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int time = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( ( Low <= time ) && ( time <= High ) ) {
      System . out . println ( 0 ) ;
    }
    else if ( ( High < time ) ) {
      System . out . println ( - 1 ) ;
    }
    else {
      System . out . println ( Low - time ) ;
    }
  }
  return N ;
}
