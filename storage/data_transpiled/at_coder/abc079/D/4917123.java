public static void warshallfloyd ( List < List < Integer >> lis ) {
  int h = Integer . parseInt ( input . nextLine ( ) ) ;
  int w = Integer . parseInt ( input . nextLine ( ) ) ;
  final int inf = 10 * 3 ;
  int [ ] [ ] C = new int [ 10 ] [ 10 ] ;
  for ( int x = 0 ;
  x < 10 ;
  x ++ ) {
    for ( int in = 0 ;
    in < 10 ;
    in ++ ) {
      int y = in ;
      C [ x ] [ y ] = in ;
    }
  }
  List < List < Integer >> A = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    A . add ( Collections . singletonList ( i ) ) ;
  }
  new warshallfloyd ( C ) {
    @ Override protected void apply ( List < Integer > a ) {
      for ( int k = 0 ;
      k < 10 ;
      k ++ ) {
        for ( int i = 0 ;
        i < 10 ;
        i ++ ) {
          for ( int j = 0 ;
          j < 10 ;
          j ++ ) {
            if ( i != j && k != i && k != j ) {
              C [ i ] [ j ] = Math . min ( C [ i ] [ j ] , C [ i ] [ k ] + C [ k ] [ j ] ) ;
            }
          }
        }
      }
    }
  }
  ;
}
