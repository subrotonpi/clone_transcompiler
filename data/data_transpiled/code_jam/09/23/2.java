static final int OFFSET = 2000 ;
final int MAX = 10 ;
final int OFFSET = 10 ;
int [ ] [ ] sol = new int [ n ] [ m ] , int [ ] [ ] [ ] ;
final boolean [ ] mark = new boolean [ n ] [ m ] ;
{
  Set < String > querys = new HashSet < String > ( ) ;
  for ( int r = 0 ;
  r < n ;
  r ++ ) {
    querys . add ( r ) ;
  }
  int [ ] [ ] sol = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int n = Integer . parseInt ( querys . get ( i ) ) ;
    int m = Integer . parseInt ( querys . get ( i ) ) ;
    map = new int [ n ] [ m ] ;
    for ( int j = 0 ;
    j < m ;
    j ++ ) {
      map [ i ] [ j ] = Integer . parseInt ( querys . get ( j ) ) ;
    }
  }
  Arrays . sort ( sol ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    System . out . println ( "Case #" + ( i + 1 ) + ":" ) ;
    docase ( in ) ;
  }
  final Scanner scanner = new Scanner ( System . in ) ;
  final int n = scanner . nextInt ( ) ;
  final int [ ] [ ] map = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    scan . nextLine ( ) ;
    for ( int j = 0 ;
    j < m ;
    j ++ ) {
      map [ i ] [ j ] = scanner . nextInt ( ) ;
    }
  }
  final int [ ] [ ] neighbours = new int [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    final int [ ] move = new int [ ] {
      0 , 1 }
      ;
      final int [ ] [ ] spans = new int [ ] [ ] {
        0 , 1 }
        ;
        for ( int i = 0 ;
        i < spans . length ;
        i ++ ) {
          final int [ ] spans = new int [ ] {
            i , 1 }
            ;
            for ( int j = 0 ;
            j < spans . length ;
            j ++ ) {
              final int [ ] spans = new int [ spans . length ] ;
              for ( int k = 0 ;
              k < spans . length ;
              k ++ ) spans [ k ] = spans [ j ] ;
              