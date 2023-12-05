static void f ( File f ) throws IOException {
  File f1 = new File ( "input.txt" ) ;
  FileWriter f1 = new FileWriter ( "output.txt" ) ;
  int n = Integer . parseInt ( f . readLine ( ) ) ;
  for ( int i = xrange ( n ) ;
  i < n ;
  i ++ ) {
    print ( i ) ;
    String value = f . readLine ( ) . trim ( ) ;
    Map < Integer , Integer > mem = new HashMap < Integer , Integer > ( ) ;
    {
      int i = 0 ;
      int i2 = 0 ;
      int i3 = 0 ;
      int i5 = 0 ;
      int i7 = 0 ;
      Integer key = new Integer ( i ) ;
      if ( mem . containsKey ( key ) ) {
        return mem . get ( key ) ;
      }
      if ( i == value . length ( ) ) {
        if ( ( i2 == 0 ) || ( i3 == 0 ) || ( i5 == 0 ) || ( i7 == 0 ) ) {
          return 1 ;
        }
        else {
          return 0 ;
        }
      }
      int res = 0 ;
      for ( int j = xrange ( i + 1 , value . length ( ) + 1 ) ;
      j < value . length ( ) ;
      j ++ ) {
        int cur = Integer . parseInt ( value . substring ( i , j ) ) ;
        res += probe ( j , ( i2 + cur ) % 2 , ( i3 + cur ) % 3 , ( i5 + cur ) % 5 , ( i7 + cur ) % 7 ) ;
      }
      mem . put ( key , res ) ;
    }
  }
}
