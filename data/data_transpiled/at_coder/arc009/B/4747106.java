public static List < Integer > b = Lists . newArrayList ( ) ;
for ( String s : input . split ( " " ) ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > newA = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    String e = a [ i ] ;
    StringBuffer sb = new StringBuffer ( ) ;
    for ( String c : Collections . list ( String . valueOf ( e ) ) ) {
      sb . append ( String . valueOf ( b . indexOf ( Integer . parseInt ( c ) ) ) ) ;
    }
    newA . add ( Integer . parseInt ( sb . toString ( ) ) ) ;
  }
  for ( int i = 0 ;
  i < newA . size ( ) ;
  i ++ ) {
    int c = newA . get ( i ) ;
    int d = a [ i ] ;
    System . out . println ( d ) ;
  }
  return newA ;
}
