public static void main ( String [ ] args ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] d = new int [ K ] ;
  Arrays . fill ( d , 100 ) ;
  d [ 1 ] = 1 ;
  List < List < Integer >> [ ] Q = new List [ 45 + 1 ] ;
  for ( int i = 0 ;
  i < Q . length ;
  i ++ ) {
    Q [ i ] = new ArrayList < Integer > ( ) ;
  }
  Q [ 1 ] . add ( 1 ) ;
  for ( int i = 1 ;
  i <= 45 ;
  i ++ ) {
    List < Integer > q = Q [ i ] ;
    while ( 0 < q . size ( ) ) {
      int v = q . remove ( 0 ) ;
      int nv = ( v * 10 ) % K ;
      if ( i < d [ nv ] ) {
        d [ nv ] = i ;
        q . add ( nv ) ;
      }
      int nnv = ( v + 1 ) % K ;
      if ( i + 1 < d [ nnv ] ) {
        d [ nnv ] = i + 1 ;
        Q [ i + 1 ] . add ( nnv ) ;
      }
    }
  }
  System . out . println ( d [ 0 ] ) ;
}
