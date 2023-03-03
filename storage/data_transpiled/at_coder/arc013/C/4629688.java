static void print ( ) {
  final String input = System . getProperty ( "line.separator" ) ;
  final int n = Integer . parseInt ( input ) ;
  int nim = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    final int x = Integer . parseInt ( input ) ;
    final int y = Integer . parseInt ( input ) ;
    final int z = Integer . parseInt ( input ) ;
    final int m = Integer . parseInt ( input ) ;
    double min_x = Double . MAX_VALUE , min_y = Double . MIN_VALUE , min_z = Double . MAX_VALUE ;
    double max_x = 0 , max_y = 0 , max_z = 0 ;
    for ( int j = 0 ;
    j < m ;
    j ++ ) {
      final int hx = Integer . parseInt ( input ) ;
      final int hy = Integer . parseInt ( input ) ;
      final int hz = Integer . parseInt ( input ) ;
      min_x = Math . min ( min_x , hx ) ;
      min_y = Math . min ( min_y , hy ) ;
      min_z = Math . min ( min_z , hz ) ;
      max_x = Math . max ( max_x , hx ) ;
      max_y = Math . max ( max_y , hy ) ;
      max_z = Math . max ( max_z , hz ) ;
    }
    nim ^= min_x ^ min_y ^ min_z ^ ( x - max_x - 1 ) ^ ( y - max_y - 1 ) ^ ( z - max_z - 1 ) ;
  }
  System . out . println ( nim > 0 ? "WIN" : "LOSE" ) ;
}
