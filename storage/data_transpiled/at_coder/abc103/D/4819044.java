public static void main ( String input , int n , int m ) {
  List < List < Integer >> requests = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    requests . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
  }
  Collections . sort ( requests , new Comparator < List < Integer >> ( ) {
    @ Override public int compare ( List < Integer > o1 , List < Integer > o2 ) {
      return o1 . get ( o2 ) . compareTo ( o2 . get ( o1 ) ) ;
    }
  }
  ) ;
  int start = 0 ;
  int end = 0 ;
  int ans = 0 ;
  for ( List < Integer > request : requests ) {
    int nextstart = request . get ( start ) ;
    int nextend = request . get ( end ) ;
    if ( end <= nextstart ) {
      ans ++ ;
      start = nextstart ;
      end = nextend ;
    }
  }
  System . out . println ( ans ) ;
}
