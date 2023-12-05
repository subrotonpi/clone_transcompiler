static final void main ( String [ ] args ) throws Exception {
  final Scanner in = new Scanner ( System . in ) ;
  final int ncases = in . nextInt ( ) ;
  for ( int caseno = 0 ;
  caseno < ncases ;
  caseno ++ ) {
    final int [ ] data = new int [ in . nextInt ( ) ] ;
    for ( int i = 0 ;
    i < data . length ;
    i ++ ) {
      data [ i ] = in . nextInt ( ) ;
    }
    final int numentries = data [ 0 ] ;
    final int surprising = data [ 1 ] ;
    final int threshold = data [ 2 ] ;
    final int [ ] entries = Arrays . copyOfRange ( data , 3 , numentries ) ;
    int good = 0 ;
    int potential = 0 ;
    for ( int entry : entries ) {
      final int d = entry / 3 ;
      final int m = entry % 3 ;
      final int [ ] normal ;
      final int [ ] surp ;
      if ( m == 0 ) {
        normal = new int [ ] {
          d , d , d }
          ;
          surp = new int [ ] {
            d - 1 , d , d + 1 }
            ;
          }
          else if ( m == 1 ) {
            normal = new int [ ] {
              d , d , d + 1 }
              ;
              surp = new int [ ] {
                d - 1 , d + 1 , d + 1 }
                ;
              }
              else {
                normal = new int [ ] {
                  d , d + 1 , d + 1 }
                  ;
                  surp = new int [ ] {
                    d , d , d + 2 }
                    ;
                  }
                  if ( Arrays . binarySearch ( surp , entry ) != 0 ) throw new Exception ( " DSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSD@@