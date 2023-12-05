public static void print ( int N ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > L = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int l = input . nextInt ( ) ;
    L . add ( l ) ;
  }
  List < Integer > sorted = new ArrayList < > ( L ) ;
  Collections . sort ( sorted ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int ans = sorted . get ( i ) . intValue ( ) ;
    System . out . println ( ans ) ;
  }
}
