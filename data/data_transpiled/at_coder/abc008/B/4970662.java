public static void print ( String s ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  Map < String , Integer > map = Maps . newHashMap ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String s = input . nextLine ( ) ;
    if ( ! map . containsKey ( s ) ) {
      map . put ( s , 1 ) ;
    }
    else {
      map . put ( s , 1 ) ;
    }
  }
  int m = 0 ;
  String b = "" ;
  for ( String a : map . keySet ( ) ) {
    if ( map . get ( a ) > m ) {
      b = a ;
      m = map . get ( a ) ;
    }
  }
  System . out . println ( b ) ;
}
