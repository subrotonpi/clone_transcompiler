public static int N = Integer . parseInt ( input ) {
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > Ts = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    Ts . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  int ans = 0 ;
  boolean firstFlag = true ;
  int [ ] passenger = null ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( firstFlag ) {
      passenger = new int [ ] {
        Ts . get ( i ) + K , C - 1 }
        ;
        firstFlag = false ;
        ans ++ ;
      }
      if ( i + 1 < N && passenger [ 0 ] < Ts . get ( i + 1 ) ) {
        firstFlag = true ;
      }
      else if ( passenger [ 1 ] <= 0 ) {
        firstFlag = true ;
      }
      else {
        passenger [ 1 ] -- ;
      }
    }
    System . out . println ( ans ) ;
    return ans ;
  }
  