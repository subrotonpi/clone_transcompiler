public static String getString ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < String > sList = new ArrayList < String > ( ) ;
  Set < Set < String >> sSet = new TreeSet < Set < String >> ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    sList . add ( Collections . singletonList ( input . nextLine ( ) ) ) ;
  }
  for ( int i = 0 ;
  i < sList . size ( ) ;
  i ++ ) {
    sSet . add ( new HashSet < String > ( sList . get ( i ) ) ) ;
  }
  Set < String > resultChar = new HashSet < String > ( ) ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    resultChar = ( Set < String > ) ( sSet . get ( i ) & resultChar ) ;
  }
  Collections . sort ( resultChar ) ;
  StringBuffer result = new StringBuffer ( ) ;
  for ( String i : resultChar ) {
    int count = Math . min ( sList . size ( ) , s . length ( ) ) ;
    result . append ( i * count ) ;
  }
  System . out . println ( result ) ;
  return result . toString ( ) ;
}
