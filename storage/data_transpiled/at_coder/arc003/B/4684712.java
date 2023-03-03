public static void print ( int N ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  ArrayList < String > s = new ArrayList < String > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) s . add ( input . readLine ( ) ) ;
  Collections . sort ( s , new Comparator < String > ( ) {
    @ Override public int compare ( String o1 , String o2 ) {
      return o1 . compareTo ( o2 ) ;
    }
  }
  ) ;
  for ( String w : s ) {
    System . out . println ( w ) ;
  }
}
