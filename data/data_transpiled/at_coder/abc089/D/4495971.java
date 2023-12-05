public static void main ( String [ ] args ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int H = Integer . parseInt ( input . nextLine ( ) ) ;
  final int W = Integer . parseInt ( input . nextLine ( ) ) ;
  final int D = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] [ ] d = new int [ H * W + 1 ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    final int [ ] row = Lists . newArrayList ( ) ;
    for ( int j = 0 ;
    j < W ;
    j ++ ) {
      row [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
    for ( int j = 0 ;
    j < W ;
    j ++ ) {
      d [ row [ j ] ] [ i ] = j ;
    }
  }
  final int [ ] A = new int [ H * W + 1 ] ;
  for ( int l = H * W - D ;
  l > 0 ;
  l -- ) {
    final int [ ] a = d [ l ] ;
    final int [ ] b = d [ l + D ] ;
    A [ l ] = A [ l + D ] + Math . abs ( a [ 0 ] - b [ 0 ] ) + Math . abs ( a [ 1 ] - b [ 1 ] ) ;
  }
  final int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    final int L = Integer . parseInt ( input . nextLine ( ) ) ;
    final int R = Integer . parseInt ( input . nextLine ( ) ) ;
    System . out . println ( A [ L ] - A [ R ] ) ;
  }
  if ( Class . isEnum ( ) ) {
    System . out . println ( Class . forName ( "java.util.Arrays$ArrayList$ArrayList$ArrayList$ArrayList$ArrayList" ) ) ;
  }
}
