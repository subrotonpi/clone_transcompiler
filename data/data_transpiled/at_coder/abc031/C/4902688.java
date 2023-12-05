public static int N ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > al = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = ( - 1 ) * 10 * 4 ;
    int ta = - 1 ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( i > j ) {
        if ( a < Integer . MAX_VALUE ) {
          a = Integer . MAX_VALUE ;
          ta = j ;
        }
      }
      else if ( j > i ) {
        if ( a < Integer . MAX_VALUE ) {
          a = Integer . MAX_VALUE ;
          ta = j ;
        }
      }
    }
    if ( i > ta ) {
      ans = Math . max ( ans , Integer . MAX_VALUE ) ;
    }
    else {
      ans = Math . max ( ans , Integer . MAX_VALUE ) ;
    }
  }
  System . out . println ( ans ) ;
  return N ;
}
