public static int [ ] [ ] parse ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  int [ ] road = new int [ M ] ;
  Method rAppend = road . getClass ( ) . getMethod ( "rAppend" , Integer . class ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    int c = Integer . parseInt ( input ) ;
    rAppend . invoke ( new Object [ ] {
      a , b , c }
      ) ;
    }
    int Q = Integer . parseInt ( input ) ;
    int [ ] [ ] query = new int [ Q ] [ Q ] ;
    Method qAppend = query . getClass ( ) . getMethod ( "qAppend" , Integer . class ) ;
    for ( int i = 0 ;
    i < Q ;
    i ++ ) {
      int v = Integer . parseInt ( input ) ;
      int w = Integer . parseInt ( input ) ;
      qAppend . invoke ( new Object [ ] {
        i , v , w }
        ) ;
      }
      Arrays . sort ( road , new Comparator < int [ ] > ( ) {
        int [ ] parent = new int [ N + 1 ] ;
        int [ ] size = new int [ N + 1 ] ;
        {
          int x = 0 ;
          int y = 0 ;
          @ Override public int find ( int x ) {
            if ( parent [ x ] == x ) {
              return x ;
            }
            else {
              parent [ x ] = find ( parent [ x ] ) ;
              return parent [ x ] ;
            }
          }
        }
        ) ;
      }
      int [ ] [ ] result = new int [ N + 1 ] [ ] ;
      int a = road [ 0 ] ;
      int b = road [ 1 ] ;
      int y = 0 ;
      int i = 0 ;
      for ( int [ ] q : new Comparator < int [ ] > ( ) {
        int j = 0 ;
        int v = q [ 0 ] ;
        int w = q [ 1 ] ;
        while ( i < M && y > w ) {
          result [ j ++ ] = q [ j ++ ] ;
          if ( i == M ) {
            break ;
          }
          a = road [ i ] ;
          b = q [ j ++ ] ;
        }
        result [ j ++ ] = getSize ( v ) ;
      }
      for ( int i = 0 ;
      i < Q ;
      i ++ ) {
        System . out . println ( result [ i ] ) ;
      }
      return result ;
    }
    