private static int [ ] readValues ( ) {
  final int [ ] input = new int [ 1 + input . length ] ;
  for ( int caseIndex = 1 ;
  caseIndex <= 1 ;
  caseIndex ++ ) {
    System . err . print ( Integer . toString ( caseIndex ) + ' ' ) ;
    int res = 0 ;
    final String [ ] words = input . nextLine ( ) . split ( " " ) ;
    final int n = Integer . parseInt ( words [ 0 ] ) ;
    final int [ ] x = {
      1 , 1 }
      ;
      final int [ ] t = {
        0 , 0 }
        ;
        final char [ ] color = {
          'O' , 'B' }
          ;
          for ( int i = 0 ;
          i < n ;
          i ++ ) {
            final char r = words [ i ] ;
            final int p = Integer . parseInt ( words [ i ] ) ;
            final int which = color [ i ] ;
            res = Math . max ( res + 1 , t [ which ] + Math . abs ( x [ which ] - p ) + 1 ) ;
            x [ which ] = p ;
            t [ which ] = res ;
          }
          System . err . println ( ) ;
        }
        return null ;
      }
      