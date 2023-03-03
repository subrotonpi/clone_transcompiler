public static String print ( String S ) {
  String T = new String ( input . nextLine ( ) ) ;
  Collections . sort ( S , false ) ;
  Collections . sort ( T , true ) ;
  String S_sort = Arrays . toString ( S ) ;
  String T_sort = Arrays . toString ( T ) ;
  if ( ( S_sort . compareTo ( T_sort ) < 0 ) && ( S_sort . compareTo ( T_sort ) < 0 ) ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
  return S_sort ;
}
