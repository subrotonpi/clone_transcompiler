public static int a ( ) {
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] arr = {
    a , b , c }
    ;
    Arrays . sort ( arr ) ;
    return 10 * arr [ arr . length - 1 ] + arr [ 1 ] + arr [ 0 ] ;
  }
  