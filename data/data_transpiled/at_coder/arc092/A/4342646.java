public static int N = Integer . parseInt ( input ) {
  List < List < Integer >> Red = new ArrayList < > ( ) ;
  List < List < Integer >> Blue = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    Red . add ( Collections . singletonList ( Integer . parseInt ( input . readLine ( ) ) ) ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    Blue . add ( Collections . singletonList ( Integer . parseInt ( input . readLine ( ) ) ) ) ;
  }
  Collections . sort ( Red , new Comparator < List < Integer >> ( ) {
    public int compare ( List < Integer > o1 , List < Integer > o2 ) {
      return o1 . get ( o2 . size ( ) - o2 . get ( o1 . size ( ) ) ) ;
    }
  }
  ) ;
  Collections . sort ( Blue , new Comparator < List < Integer >> ( ) {
    public int compare ( List < Integer > o1 , List < Integer > o2 ) {
      return ( o1 . get ( o2 . size ( ) - o2 . get ( o1 . size ( ) ) ) ) ;
    }
  }
  ) ;
  int answer = 0 ;
  for ( int Bluei = 0 ;
  Bluei < N ;
  Bluei ++ ) {
    int popwant = 101 ;
    int count = 0 ;
    while ( ( count < Red . size ( ) ) && ( Blue . get ( Bluei ) . get ( 1 ) <= Red . get ( count ) ) ) {
      break ;
    }
    if ( Red . get ( count ) < Blue . get ( Bluei ) ) {
      popwant = count ;
    }
    count ++ ;
  }
  if ( popwant < 100 ) {
    Red . remove ( popwant ) ;
    answer ++ ;
  }
  return answer ;
}
