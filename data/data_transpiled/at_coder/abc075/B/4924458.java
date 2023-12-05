public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  String [ ] [ ] hoge = new String [ n ] [ m + 2 ] ;
  hoge [ 0 ] = new String [ n ] ;
  hoge [ 1 ] = new String [ n ] ;
  hoge [ 2 ] [ 0 ] = "." ;
  hoge [ 2 ] [ 1 ] = new String [ n ] ;
  hoge [ 2 ] [ 0 ] = "." ;
  hoge [ 2 ] [ 1 ] = new String [ n ] ;
  hoge [ 2 ] [ 1 ] = "." ;
  hoge [ 2 ] [ 1 ] = "." ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < m ;
    j ++ ) {
      int a = i + 1 ;
      int b = j + 1 ;
      if ( ( hoge [ a ] [ b ] == "#" ) && ( hoge [ a ] [ b ] == "#" ) ) {
        System . out . print ( "#" ) ;
      }
      else {
        int ans = 0 ;
        if ( ( hoge [ a - 1 ] [ b - 1 ] == "#" ) && ( hoge [ a - 1 ] [ b ] == "#" ) && ( hoge [ a - 1 ] [ b + 1 ] == "#" ) && ( hoge [ a ] [ b + 1 ] == "#" ) && ( hoge [ a ] [ b + 1 ] == "#" ) && ( hoge [ a ] [ b + 1 ] == "#" ) && ( hoge [ a ] [ b + 1 ] == "#" ) && ( hoge [ a ] [ b + 1 ] == "#" ) && ( hoge [ a ] [ b + 1 ] == "#" ) && ( hoge [ a ] [ b + 1 ] == "#" ) && ( hoge [ a ] [ b + 1 ] == "#" ) && ( hoge [ a ] [ b + 1 ] == "#" ) && ( hoge [ a ] [ b + 1 ] == "#" ) && ( hoge [ a ] [ b + 1 ] == "#" ) && ( hoge [ a ] [ b + 1 ] == "#" )