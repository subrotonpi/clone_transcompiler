public static void fin ( Scanner fin ) throws FileNotFoundException {
  int T = Integer . parseInt ( fin . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < T ;
  i ++ ) {
    String line = fin . nextLine ( ) ;
    BitSet present = new BitSet ( line . length ( ) ) ;
    for ( int j = 0 ;
    j < line . length ( ) ;
    j ++ ) {
      present . set ( line . charAt ( j ) ) ;
    }
    int base = present . cardinality ( ) ;
    if ( base < 2 ) {
      base = 2 ;
    }
    BitSet digit = new BitSet ( line . length ( ) ) ;
    int cn = 1 ;
    for ( int j = 0 ;
    j < line . length ( ) ;
    j ++ ) {
      if ( ! digit . get ( line . charAt ( j ) ) ) {
        digit . set ( line . charAt ( j ) ) ;
        if ( cn == 1 ) {
          cn = 0 ;
        }
        else if ( cn == 0 ) {
          cn = 2 ;
        }
        else {
          cn ++ ;
        }
      }
    }
    char [ ] rev = line . toCharArray ( ) ;
    int f = 1 ;
    int total = 0 ;
    for ( int j = 0 ;
    j < rev . length ;
    j ++ ) {
      total += f * digit . get ( rev [ j ] ) ;
      f *= base ;
    }
    System . out . println ( "Case #" + ( i + 1 ) + ": " + total ) ;
  }
}
