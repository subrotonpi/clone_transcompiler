public static void main ( String [ ] args ) {
  int k = Integer . parseInt ( input ( ) ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    abc_List [ abc_List . indexOf ( max ( abc_List ) ) ] = max ( abc_List ) * 2 ;
  }
  System . out . println ( Arrays . toString ( abc_List ) ) ;
}
