public static void ans ( ) {
  List < Integer > E = Collections . list ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > L = Collections . list ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int cnt = 0 ;
  boolean f = false ;
  for ( int i = 0 ;
  i < 6 ;
  i ++ ) {
    if ( ( L . get ( i ) ) != null ) {
      cnt ++ ;
    }
    else if ( ( L . get ( i ) ) == B ) {
      f = true ;
    }
  }
  int res = 0 ;
  if ( ( cnt == 6 ) && ( f ) ) {
    res = 1 ;
  }
  else if ( ( cnt == 5 ) && ( f ) ) {
    res = 2 ;
  }
  else {
    res = 3 ;
  }
  System . out . println ( res ) ;
}
