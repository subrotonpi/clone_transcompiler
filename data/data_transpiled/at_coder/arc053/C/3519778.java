public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  List < Pair > up = new ArrayList < > ( ) ;
  List < Pair > down = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    if ( a > b ) up . add ( new Pair ( a , b ) ) ;
    else down . add ( new Pair ( a , b ) ) ;
  }
  int temp = 0 ;
  int tempMax = 0 ;
  Collections . sort ( down , new Comparator < Pair > ( ) {
    public int compare ( Pair o1 , Pair o2 ) {
      return o2 . left - o1 . right ;
    }
  }
  ) ;
  for ( int a : down ) {
    temp = Math . max ( tempMax , temp + a ) ;
    temp = temp + a - b ;
  }
  System . out . println ( tempMax ) ;
}
