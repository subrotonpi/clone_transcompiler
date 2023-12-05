public static void main ( String input ) {
  N = Integer . parseInt ( input ) ;
  K = Integer . parseInt ( input ) ;
  T = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    T . add ( Integer . parseInt ( input ) ) ;
  }
  @ SuppressWarnings ( "unchecked" ) Iterator < List < Integer >> iterator = T . iterator ( ) ;
  for ( List < Integer > cand : T ) {
    if ( iterator . hasNext ( ) ) {
      iterator . next ( ) ;
    }
    else {
      System . out . println ( "Found" ) ;
      exit ( ) ;
    }
  }
  else {
    System . out . println ( "Nothing" ) ;
  }
}
