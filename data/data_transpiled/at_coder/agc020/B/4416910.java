public static int K = Integer . parseInt ( input ) {
  int [ ] A = new int [ input . length ] ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int right = Integer . parseInt ( input . nextLine ( ) ) ;
  int length = A . length ;
  int maxi = 3 ;
  int mini = 2 ;
  int temp1 = 2 ;
  int temp2 = 2 ;
  int test = A [ 0 ] ;
  for ( int i = K - 2 ;
  i >= 0 ;
  i -- ) {
    int a = A [ i ] ;
    if ( ( temp1 == a ) && ( temp2 == a ) ) {
      maxi = maxi ;
    }
    else if ( ( maxi % a == a - 1 ) ) {
      maxi += a ;
    }
    else {
      maxi += ( a - 1 - maxi % a ) ;
    }
    if ( ( mini % a != 0 ) && ( mini % a != 0 ) ) {
      mini += ( a - mini % a ) ;
    }
    temp2 = temp1 ;
    temp1 = a ;
  }
  int test1 = mini ;
  int test2 = maxi ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    test1 = test1 - test1 % A [ i ] ;
    test2 = test2 - test2 % A [ i ] ;
  }
  if ( ( test1 == 2 ) && ( test2 == 2 ) ) {
    System . out . println ( mini + " " + maxi ) ;
  }
  else {
    System . out . println ( - 1 ) ;
  }
  return Math . max ( mini , maxi ) ;
}
