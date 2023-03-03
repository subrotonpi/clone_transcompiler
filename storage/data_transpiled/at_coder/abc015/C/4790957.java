public static String [ ] [ ] getStrings ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int k = Integer . parseInt ( input . readLine ( ) ) ;
  List < List < Integer >> tAll = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    List < Integer > tmp = Lists . newArrayList ( ) ;
    for ( int j = 0 ;
    j < k ;
    j ++ ) {
      tmp . add ( Integer . parseInt ( input . readLine ( ) ) ) ;
    }
    tAll . add ( tmp ) ;
  }
  for ( int i = 0 ;
  i < 5 - n ;
  i ++ ) {
    tAll . add ( new ArrayList < > ( ) ) ;
  }
  String ans = "Nothing" ;
  for ( int a = 0 ;
  a < k ;
  a ++ ) {
    for ( int b = 0 ;
    b < k ;
    b ++ ) {
      for ( int c = 0 ;
      c < k ;
      c ++ ) {
        for ( int d = 0 ;
        d < k ;
        d ++ ) {
          for ( int e = 0 ;
          e < k ;
          e ++ ) {
            if ( tAll . get ( 0 ) . get ( a ) ^ tAll . get ( 1 ) . get ( b ) ^ tAll . get ( 2 ) . get ( c ) ^ tAll . get ( 3 ) . get ( d ) ^ tAll . get ( 4 ) . get ( e ) == 0 ) {
              ans = "Found" ;
            }
          }
        }
      }
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
