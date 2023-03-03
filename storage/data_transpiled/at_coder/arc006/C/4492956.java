static List < List < Integer >> bump ( List < List < Integer >> T , int x ) {
  if ( T . isEmpty ( ) ) {
    return Arrays . asList ( new List < > ( ) ) ;
  }
  else {
    int i = Collections . binarySearch ( T . get ( 0 ) , x ) ;
    if ( i == T . get ( 0 ) . size ( ) ) {
      return Arrays . asList ( T . get ( 0 ) . toArray ( ) ) ;
    }
    else {
      int y = T . get ( 0 ) . get ( i ) ;
      T . set ( i , y ) ;
    }
  }
}
