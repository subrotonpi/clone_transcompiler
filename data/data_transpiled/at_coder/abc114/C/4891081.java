public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  /*if (Integer.parseInt(input)>n) return;
  int ret = Arrays.binarySearch("753", n) ? 1 : 0;*/
  for ( int i = 0 ;
  i < "753" . length ( ) ;
  i ++ ) {
    ret += dfs ( "753" + i ) ;
  }
  /*System.out.println(dfs("0"));*/
  if ( getClass ( ) . equals ( String . class ) ) {
    System . out . println ( "" ) ;
  }
}
