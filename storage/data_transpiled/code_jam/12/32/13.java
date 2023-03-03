static void print ( String s ) throws IOException {
  final BufferedReader br = new BufferedReader ( new FileReader ( s ) ) ;
  final BufferedWriter g = new BufferedWriter ( new FileWriter ( "file.txt" ) ) ;
  for ( int i = 1 ;
  i <= Integer . parseInt ( br . readLine ( ) ) ;
  i ++ ) {
    Arrays . stream ( br . readLine ( ) . split ( " " ) ) . forEach ( j -> {
      double d = Double . parseDouble ( j ) ;
      String n = Double . parseDouble ( j ) ;
      int n = Integer . parseInt ( n ) ;
      double start = Double . parseDouble ( br . readLine ( ) . split ( " " ) [ 1 ] ) ;
      if ( n > 1 ) {
        Arrays . stream ( t1 , x1 ) ;
      }
      else {
        return d ;
      }
    }
    ) ;
  }
}
