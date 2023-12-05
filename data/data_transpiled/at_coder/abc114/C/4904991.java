public static int N = Integer . parseInt ( input ) {
  int le = String . valueOf ( N ) . length ( ) ;
  String [ ] al = {
    "3" , "5" , "7" }
    ;
    String [ ] al2 = new String [ le - 1 ] ;
    for ( int i = 0 ;
    i < le - 1 ;
    i ++ ) {
      String [ ] al1 = new String [ al . length ] ;
      for ( int j = 0 ;
      j < al . length ;
      j ++ ) {
        String n = al [ j ] ;
        int a = Integer . parseInt ( String . valueOf ( n ) + "3" ) ;
        int b = Integer . parseInt ( String . valueOf ( n ) + "5" ) ;
        int c = Integer . parseInt ( String . valueOf ( n ) + "7" ) ;
        al1 [ j ] = a ;
        al1 [ j ] = b ;
        al1 [ j ] = c ;
        al2 [ j ] = a ;
        al2 [ j ] = b ;
        al2 [ j ] = c ;
      }
      al = al1 ;
    }
    int cnt = 0 ;
    for ( String n : al2 ) {
      if ( n . length ( ) <= N ) {
        if ( Arrays . binarySearch ( String . valueOf ( n ) , "753" ) > 0 ) {
          cnt ++ ;
        }
      }
    }
    System . out . println ( cnt ) ;
    return cnt ;
  }
  