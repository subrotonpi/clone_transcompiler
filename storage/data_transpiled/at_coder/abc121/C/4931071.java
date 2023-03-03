public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  Map < Integer , Integer > A = new HashMap < > ( ) ;
  List < Integer > B = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . put ( i , i ) ;
    B . add ( i ) ;
  }
  List < Map . Entry < Integer , Integer >> sorted = new ArrayList < > ( A . entrySet ( ) ) ;
  Collections . sort ( sorted , new Comparator < Map . Entry < Integer , Integer >> ( ) {
    public int compare ( Map . Entry < Integer , Integer > o1 , Map . Entry < Integer , Integer > o2 ) {
      return o2 . getValue ( ) . compareTo ( o1 . getValue ( ) ) ;
    }
  }
  ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( M > B . get ( A . get ( i ) . getValue ( ) ) ) {
      ans += A . get ( i ) . getValue ( ) * B . get ( A . get ( i ) . getValue ( ) ) ;
      M -= B . get ( A . get ( i ) . getValue ( ) ) ;
    }
    else {
      ans += A . get ( i ) . getValue ( ) * M ;
      break ;
    }
  }
  System . out . println ( ans ) ;
}
