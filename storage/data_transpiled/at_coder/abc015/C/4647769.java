public static String tobi ( String string ) {
  return format ( Integer . parseInt ( string ) , "07b" ) ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> T = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    T . add ( Collections . singletonList ( tobi ( input . nextLine ( ) ) ) ) ;
  }
  boolean flag = true ;
  /* bi5(inte, a, b) */
  int [ ] ans = new int [ b ] ;
  for ( int i = b - 1 ;
  i >= 0 ;
  i -- ) {
    ans [ i ] = 0 ;
    for ( int i = b - 1 ;
    i >= 0 ;
    i -- ) {
      if ( inte >= a * a * i ) {
        ans [ i ] = ( int ) ( inte / ( a * a * i ) ) ;
        inte = inte % a * a * i ;
      }
    }
  }
  for ( int i = 0 ;
  i < k * n ;
  i ++ ) {
    int [ ] temp = new int [ 7 ] ;
    for ( int p = 0 , l = 0 ;
    i < n ;
    p ++ ) {
      for ( int t = T . get ( l ) . get ( p ) ;
      t < 7 ;
      t ++ ) {
        int m = T . get ( l ) . get ( t ) ;
        temp [ m ] += Integer . parseInt ( t ) ;
      }
    }
    for ( int j = 0 ;
    j < 7 ;
    j ++ ) {
      temp [ j ] = temp [ j ] % 2 ;
    }
    if ( Arrays . deepEquals ( temp , temp ) ) {
      System . out . println ( "Found" ) ;
      flag = false ;
      break ;
    }
  }
  if ( flag ) {
    System . out . println ( "Nothing" ) ;
  }
  return string ;
}
