@ Test ( enabled = false ) public static void test ( String name , String type ) throws IOException {
  name = "A" ;
  String type = "large" ;
  String base = name + "-" + type + "." ;
  String [ ] lines = FileUtil . readFileLines ( base + "in" ) ;
  Arrays . sort ( lines ) ;
  int T = Integer . parseInt ( lines [ 0 ] ) ;
  int fpos = 1 ;
  {
    int i ;
    int j ;
    int temp ;
    int steps = 0 ;
    for ( i = xrange ( lines . length ) ;
    i < T ;
    i ++ ) {
      if ( lines [ i ] . compareTo ( lines [ i ] ) > 0 ) {
        j = i + 1 ;
        while ( lines [ j ] . compareTo ( lines [ i ] ) > 0 ) j ++ ;
        steps += j - i ;
      }
    }
  }
}
