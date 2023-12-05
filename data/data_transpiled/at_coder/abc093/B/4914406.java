public static int [ ] [ ] ints ( Scanner input ) {
  int a = input . nextInt ( ) ;
  int b = input . nextInt ( ) ;
  int k = input . nextInt ( ) ;
  int [ ] [ ] res = new int [ a ] [ b ] ;
  for ( int i = a ;
  i < Math . min ( a + k , b ) ;
  i ++ ) res [ i ] = input . nextInt ( ) ;
  for ( int j = Math . max ( a , b - k + 1 ) ;
  j <= b ;
  j ++ ) res [ j ] = input . nextInt ( ) ;
  Arrays . sort ( res ) ;
  for ( int i : res ) {
    System . out . println ( i ) ;
  }
  return res ;
}
