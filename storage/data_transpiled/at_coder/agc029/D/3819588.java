@ InputFunction public static void input ( ) {
  int h = Integer . parseInt ( input . nextLine ( ) ) ;
  int w = Integer . parseInt ( input . nextLine ( ) ) ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> coord = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    coord . add ( Collections . singletonList ( i ) ) ;
  }
  List < List < Integer >> coSort = new ArrayList < > ( ) ;
  coSort . sort ( coord ) ;
  int c = h ;
  int r = 0 ;
  for ( List < Integer > co : coSort ) {
    if ( co . get ( 0 ) - 1 - r >= co . get ( 1 ) ) {
      c = Math . min ( c , co . get ( 0 ) - 1 ) ;
    }
    else if ( co . get ( 0 ) - r == co . get ( 1 ) ) {
      r ++ ;
    }
  }
  System . out . println ( c ) ;
}
