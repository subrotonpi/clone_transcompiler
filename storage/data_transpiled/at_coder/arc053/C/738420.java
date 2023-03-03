public static int N = Integer . parseInt ( input ) {
  int [ ] [ ] costs = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    costs [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  }
  Arrays . sort ( costs ) ;
  List < Integer > costsNegative = new ArrayList < > ( Arrays . asList ( costs ) ) ;
  List < Integer > costsZero = new ArrayList < > ( Arrays . asList ( costs ) ) ;
  List < Integer > costsPositive = new ArrayList < > ( Arrays . asList ( costs ) ) ;
  Collections . sort ( costsNegative , costsZero ) ;
  Collections . sort ( costsPositive , costsNegative ) ;
  int val = 0 ;
  int maxVal = - Integer . MAX_VALUE ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int up = costsNegative . get ( i ) ;
    int down = costsZero . get ( i ) ;
    val += up ;
    if ( val > maxVal ) {
      maxVal = val ;
    }
    val -= down ;
  }
  System . out . println ( maxVal ) ;
  return val ;
}
