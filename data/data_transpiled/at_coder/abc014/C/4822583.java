public static int m ( int m ) {
  int n = Integer . parseInt ( input ( ) ) ;
  List < List < Integer >> ab = Arrays . asList ( Lists . newArrayList ( ) ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ab . add ( Lists . newArrayList ( ) ) ;
  }
  List < Integer > a = new ArrayList < > ( ) ;
  for ( List < Integer > abi : ab ) {
    a . add ( abi . get ( 0 ) ) ;
  }
  List < Integer > b = new ArrayList < > ( ) ;
  for ( List < Integer > abi : ab ) {
    b . add ( abi . get ( 1 ) ) ;
  }
  int [ ] A = new int [ m ] ;
  int [ ] B = new int [ m ] ;
  int [ ] Sa = new int [ m ] ;
  int [ ] Sb = new int [ m ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    A [ a [ i ] ] ++ ;
    B [ b [ i ] ] ++ ;
  }
  Sa [ 0 ] = A [ 0 ] ;
  Sb [ 0 ] = 0 ;
  for ( int i = 1 ;
  i < m ;
  i ++ ) {
    Sa [ i ] = Sa [ i - 1 ] + A [ i ] ;
    Sb [ i ] = Sb [ i - 1 ] + B [ i - 1 ] ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    ans = Math . max ( ans , Sa [ i ] - Sb [ i ] ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
