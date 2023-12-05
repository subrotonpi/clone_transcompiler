public static void N ( ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > Xs = new ArrayList < > ( Arrays . asList ( input . nextLine ( ) . split ( " " ) ) ) ;
  int ans = 0 ;
  for ( int x : Xs ) {
    ans += Math . min ( 2 * x , 2 * Math . abs ( K - x ) ) ;
  }
  System . out . println ( ans ) ;
}
