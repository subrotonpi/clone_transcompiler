public static List < Integer > solve ( ) {
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > res = new ArrayList < > ( ) ;
  for ( int n = Math . max ( N - 10000 , 1 ) ;
  n <= N ;
  n ++ ) {
    res . add ( n ) ;
  }
  return res ;
}
