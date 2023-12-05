public static int [ ] getNum ( ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) , B = Integer . parseInt ( input . nextLine ( ) ) ;
  int count = 0 ;
  for ( int tmp = A ;
  tmp <= B ;
  tmp ++ ) {
    int [ ] num = new int [ 4 ] ;
    while ( tmp > 0 ) {
      num [ 0 ] = tmp % 10 ;
      tmp = tmp / 10 ;
    }
    if ( num [ 0 ] == num [ 4 ] && num [ 1 ] == num [ 3 ] ) {
      count ++ ;
    }
  }
  return num ;
}
