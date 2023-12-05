public static int N = Integer . parseInt ( input ) {
  String name = input . nextLine ( ) ;
  String kit = input . nextLine ( ) ;
  int c1 = 0 ;
  int c2 = 0 ;
  int m = 0 ;
  for ( String s : name . split ( " " ) ) {
    c1 = name . indexOf ( s ) ;
    c2 = kit . indexOf ( s ) ;
    if ( c2 != 0 ) {
      m = Math . max ( m , - ( - c1 / c2 ) ) ;
    }
    else {
      System . out . println ( - 1 ) ;
      exit ( ) ;
    }
  }
  return m ;
}
