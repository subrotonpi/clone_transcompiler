@ Function public static void input ( ) {
  String S = input . nextLine ( ) ;
  Counter < Integer > S_counter = new Counter < > ( S ) ;
  int pair = 0 , one = 0 ;
  for ( int m : S_counter . values ( ) ) {
    if ( m % 2 == 1 ) {
      m -- ;
      one ++ ;
    }
    pair += m ;
  }
  if ( one == 0 ) {
    System . out . println ( pair ) ;
  }
  else {
    System . out . println ( pair / 2 / one * 2 + 1 ) ;
  }
}
