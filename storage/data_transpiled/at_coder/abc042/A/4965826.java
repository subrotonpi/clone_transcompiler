public static int a = Integer . parseInt ( input ) {
  int b = Integer . parseInt ( input . readLine ( ) ) ;
  int c = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] arr = {
    a , b , c }
    ;
    Arrays . sort ( arr ) ;
    if ( arr [ 0 ] == arr [ 1 ] == 5 && arr [ 2 ] == 7 ) {
      System . out . println ( "YES" ) ;
    }
    else {
      System . out . println ( "NO" ) ;
    }
    return arr [ 0 ] ;
  }
  