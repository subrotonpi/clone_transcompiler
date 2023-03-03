@ Sys public static void main ( String in ) throws IOException {
  String pattern = "welcome to code jam" ;
  Map < String , List < Integer >> ip = new HashMap < String , List < Integer >> ( ) ;
  for ( int i = 0 ;
  i < pattern . length ( ) ;
  i ++ ) {
    ip . computeIfAbsent ( pattern . charAt ( i ) , k -> new ArrayList < Integer > ( ) ) . add ( i ) ;
  }
  int n = pattern . length ( ) ;
  int N = Integer . parseInt ( in . readLine ( ) ) ;
  for ( int i : xrange ( 1 , N + 1 ) ) {
    String line = in . readLine ( ) . trim ( ) ;
    List < int [ ] > ans = new ArrayList < int [ ] > ( ) ;
    for ( int p = 0 ;
    p < line . length ( ) ;
    p ++ ) {
      int [ ] val = new int [ n ] ;
      if ( ip . containsKey ( line . charAt ( p ) ) ) {
        for ( int j : ip . get ( line . charAt ( p ) ) ) {
          if ( j == 0 ) {
            val [ j ] = 1 ;
          }
          else {
            for ( int k : xrange ( p ) ) {
              val [ j ] += ans . get ( k ) [ j - 1 ] ;
            }
            val [ j ] %= 10000 ;
          }
        }
      }
      ans . add ( val ) ;
    }
    int total = 0 ;
    for ( int [ ] val : ans ) {
      total += val [ n - 1 ] ;
    }
    System . out . printf ( "Case #%d: %04d\n" , i , total % 10000 ) ;
  }
}
