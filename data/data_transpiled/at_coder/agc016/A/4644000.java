public static int input ( ) {
  String s = input ( ) ;
  ArrayList < Integer > L = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( ! L . contains ( s . charAt ( i ) ) ) {
      L . add ( s . charAt ( i ) ) ;
    }
  }
  int Ans = 100 ;
  for ( Integer i : L ) {
    int cnt = 0 ;
    int ma = 0 ;
    for ( int j : s . toCharArray ( ) ) {
      if ( i != j ) {
        cnt ++ ;
      }
      else {
        ma = Math . max ( ma , cnt ) ;
        cnt = 0 ;
      }
    }
    ma = Math . max ( ma , cnt ) ;
    Ans = Math . min ( Ans , ma ) ;
  }
  return Ans ;
}
