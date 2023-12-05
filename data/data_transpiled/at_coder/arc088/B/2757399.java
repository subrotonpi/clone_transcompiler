public static void main ( String [ ] args ) {
  String s = input ( ) ;
  int n = s . length ( ) ;
  int [ ] chs = changes ( s , n ) ;
  int res = n ;
  for ( int i : chs ) {
    int di = Math . max ( i , n - i ) ;
  }
}
