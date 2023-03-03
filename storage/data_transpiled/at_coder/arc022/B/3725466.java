public static void print ( int N ) {
  int [ ] A = Integer . parseInt ( input ( ) ) ;
  int maxlength = 0 ;
  int right = 0 ;
  boolean [ ] Checklist = new boolean [ 100001 ] ;
  for ( int left = 0 ;
  left < N ;
  left ++ ) {
    while ( right < N && ! Checklist [ A [ right ] ] ) {
      Checklist [ A [ right ] ] = true ;
      right ++ ;
    }
    maxlength = Math . max ( maxlength , right - left ) ;
    Checklist [ A [ left ] ] = false ;
  }
  System . out . println ( maxlength ) ;
}
