public static void print ( int n ) {
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  if ( Arrays . binarySearch ( a ) % n != 0 ) {
    System . out . println ( - 1 ) ;
    exit ( ) ;
  }
  int ave = Arrays . binarySearch ( a ) / n ;
  int cnt = 0 ;
  int sub_cnt = 0 ;
  int sub_sum = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    sub_sum += a [ i ] ;
  }
}
