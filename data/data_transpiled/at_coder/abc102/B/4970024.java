public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] arr = list ( Integer . parseInt ( input ) ) ;
  Arrays . sort ( arr ) ;
  System . out . println ( Math . abs ( arr [ arr . length - 1 ] - arr [ 0 ] ) ) ;
}
