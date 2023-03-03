public static int [ ] [ ] getOne ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  char [ ] c = input . nextLine ( ) . toCharArray ( ) ;
  final char [ ] command = {
    'A' , 'B' , 'X' , 'Y' }
    ;
    final int [ ] LorR = new int [ 16 ] ;
    int i = 0 ;
    for ( final int ABXY : new int [ ] {
      command [ i ] }
      ) {
        LorR [ i ] = ABXY ;
        i ++ ;
      }
      final int [ ] choice = new int [ 120 ] ;
      i = 0 ;
      for ( final int ABXY : new int [ ] {
        LorR , 2 }
        ) {
          choice [ i ] = ABXY ;
          i ++ ;
        }
        final int [ ] count = new int [ 120 ] ;
        for ( i = 0 ;
        i < 120 ;
        i ++ ) {
          int j = 0 ;
          while ( j < N ) {
            if ( j < N - 1 ) {
              if ( ( c [ j ] == choice [ i ] [ 0 ] && c [ j + 1 ] == choice [ i ] [ 0 ] [ 1 ] ) || ( c [ j ] == choice [ i ] [ 1 ] && c [ j + 1 ] == choice [ i ] [ 1 ] [ 1 ] ) ) {
                j += 2 ;
                count [ i ] ++ ;
              }
              else {
                j ++ ;
                count [ i ] ++ ;
              }
            }
            else {
              count [ i ] ++ ;
              j ++ ;
            }
          }
        }
        System . out . println ( min ( count ) ) ;
        return count ;
      }
      