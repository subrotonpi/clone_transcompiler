public static String input ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int K = Integer . parseInt ( input . readLine ( ) ) ;
  String S = String . valueOf ( input . readLine ( ) ) ;
  List < String > base = new ArrayList < String > ( S ) ;
  Collections . sort ( base ) ;
  String tmp = "" ;
  String tmp2 = "" ;
  List < String > tmp_base = new ArrayList < String > ( ) ;
  int mismatch1 = 0 ;
  int mismatch2 = 0 ;
  int counter = 0 ;
  String result = "" ;
  String tmp_result = "" ;
  String tmp_S = "" ;
  int t = 0 ;
  List < String > rest = new ArrayList < String > ( ) ;
  String tmp_ans = "a" ;
  for ( int i = 0 ;
  i <= N - 1 ;
  i ++ ) {
    for ( String cha : base ) {
      mismatch2 = 0 ;
      tmp_base . clear ( ) ;
      tmp_base . addAll ( base ) ;
      if ( ( cha != S . charAt ( i ) ) && ( ! tmp_S . charAt ( i ) . equals ( cha ) ) ) {
        mismatch2 ++ ;
      }
      tmp_base . remove ( cha ) ;
      for ( int j = i + 1 ;
      j < N ;
      j ++ ) {
        if ( ( S . charAt ( j ) != tmp_S . charAt ( j ) ) && ( ! tmp_S . charAt ( j ) . equals ( tmp_S . charAt ( j ) ) ) ) {
          mismatch2 ++ ;
        }
      }
      result += tmp_ans ;
      base . remove ( tmp_ans ) ;
      if ( ( tmp_ans != S . charAt ( i ) ) && ( ! tmp_S . charAt ( j ) . equals ( tmp_S . charAt ( j ) ) ) ) {
        mismatch1 ++ ;
      }
    }
  }
  result += base . get ( 0 ) ;
  System . out . println ( result ) ;
  return result ;
}
