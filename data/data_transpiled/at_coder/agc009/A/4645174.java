public static int [ ] getPrime ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ n ] ;
  int [ ] b = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int A = Integer . parseInt ( input . nextLine ( ) ) ;
    int B = Integer . parseInt ( input . nextLine ( ) ) ;
    a [ i ] = A ;
    b [ i ] = B ;
  }
  Collections . reverse ( a ) ;
  Collections . reverse ( b ) ;
  return a ;
}
