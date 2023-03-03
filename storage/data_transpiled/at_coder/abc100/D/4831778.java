public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] t = new int [ N ] [ M ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    int z = Integer . parseInt ( input . nextLine ( ) ) ;
    for ( int j = 0 ;
    j < 8 ;
    j ++ ) {
      int xs = j % 2 == 0 ? 1 : - 1 ;
      int ys = ( j / 2 ) % 2 == 0 ? 1 : - 1 ;
      int zs = ( j / 4 ) % 2 == 0 ? 1 : - 1 ;
      t [ j ] [ 0 ] = xs * x + ys * y + zs * z ;
    }
  }
  int [ ] res = new int [ M ] ;
  for ( int [ ] li : t ) {
    Arrays . sort ( li , Integer . reverseOrder ( ) ) ;
    res [ li . length - 1 ] = Integer . valueOf ( li [ 0 ] ) ;
  }
  System . out . println ( Arrays . toString ( res ) ) ;
}
