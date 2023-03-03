static int N ( int M ) {
  int X = Integer . parseInt ( input . nextLine ( ) ) ;
  int Y = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > L1 = new LinkedList < Integer > ( ) ;
  List < Integer > L2 = new LinkedList < Integer > ( ) ;
  int t = 0 ;
  int cnt = 0 ;
  final int i = 0 ;
  while ( true ) {
    try {
      t = L1 . get ( i ) ;
      t += X ;
      t = L2 . get ( i ) ;
      t += Y ;
      cnt ++ ;
    }
    catch ( Exception e ) {
      break ;
    }
  }
}
