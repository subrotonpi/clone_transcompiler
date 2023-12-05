public static void print ( int N ) {
  int [ ] a = Integer . parseInt ( input ( ) ) ;
  int fourNum = 0 ;
  int twoNum = 0 ;
  int odNum = 0 ;
  for ( ;
  a [ 0 ] < N ;
  a [ 0 ] ++ ) {
    if ( a [ 0 ] % 4 == 0 ) {
      fourNum ++ ;
    }
    else if ( a [ 0 ] % 2 == 0 ) {
      twoNum ++ ;
    }
    else {
      odNum ++ ;
    }
  }
  if ( odNum > fourNum && twoNum > 0 ) {
    System . out . println ( "No" ) ;
  }
  else if ( odNum > fourNum + 1 && twoNum == 0 ) {
    System . out . println ( "No" ) ;
  }
  else {
    System . out . println ( "Yes" ) ;
  }
}
