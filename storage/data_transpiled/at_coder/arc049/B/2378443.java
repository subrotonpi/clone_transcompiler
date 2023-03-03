public static void print ( int n = Integer . parseInt ( input ) ) {
  List < List < Integer >> lis = new ArrayList < > ( ) ;
  for ( int m = 0 ;
  m < n ;
  m ++ ) {
    lis . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  int mat = 0 ;
  for ( int i = 0 ;
  i < lis . size ( ) ;
  i ++ ) {
    List < Integer > cou = lis . get ( i ) ;
    for ( List < Integer > co : lis . subList ( i + 1 , lis . size ( ) ) ) {
      int ix = cou . get ( 0 ) ;
      int yx = cou . get ( 1 ) ;
      int cx = cou . get ( 2 ) ;
      int iy = co . get ( 3 ) ;
      int yy = co . get ( 4 ) ;
      int cy = co . get ( 5 ) ;
      int d = Math . max ( Math . abs ( ix - iy ) , Math . abs ( yx - yy ) ) ;
      int tim = ( cx * cy * d / ( cx + cy ) ) ;
      mat = Math . max ( tim , mat ) ;
    }
  }
  System . out . println ( mat ) ;
}
