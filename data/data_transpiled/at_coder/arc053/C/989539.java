public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  List < Pair > EisNegative = new ArrayList < > ( ) ;
  List < Pair > EisPositive = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    int e = a - b ;
    if ( e <= 0 ) {
      EisNegative . add ( new Pair ( a , e ) ) ;
    }
    else {
      EisPositive . add ( new Pair ( a , e ) ) ;
    }
  }
  Collections . sort ( EisNegative , new Comparator < Pair > ( ) {
    public int compare ( Pair aande , Pair aande ) {
      return aande . first - aande . second ;
    }
  }
  ) ;
  Collections . reverse ( EisPositive ) ;
  int T = 0 ;
  int ans = 0 ;
  for ( Pair a : EisNegative ) {
    int e = Math . max ( a + T , ans ) ;
    T += e ;
  }
  System . out . println ( ans ) ;
}
