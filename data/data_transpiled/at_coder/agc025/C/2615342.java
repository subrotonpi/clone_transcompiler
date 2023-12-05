public static int [ ] getNegativeInstances ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int [ ] L = new int [ N ] ;
  int [ ] R = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    R [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( L , Collections . reverseOrder ( ) ) ;
  Arrays . sort ( R ) ;
  int ans = 0 ;
  int acc = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ans = Math . max ( ans , acc + 2 * L [ i ] ) ;
    acc += ( 2 * ( L [ i ] - R [ i ] ) ) ;
    ans = Math . max ( ans , acc ) ;
  }
  System . out . println ( ans ) ;
  return L ;
}
