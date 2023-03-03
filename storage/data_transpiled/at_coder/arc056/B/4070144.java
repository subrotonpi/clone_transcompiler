@ VisibleForTesting static void heapSort ( ) throws IOException {
  String nextLine = FileUtils . readLine ( 0 ) ;
  int N = Integer . parseInt ( nextLine ) ;
  int M = Integer . parseInt ( nextLine ) ;
  int S = Integer . parseInt ( nextLine ) ;
  int [ ] [ ] G = new int [ N ] [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int v = Integer . parseInt ( nextLine ) ;
    int w = Integer . parseInt ( nextLine ) ;
    G [ v - 1 ] [ w - 1 ] = v - 1 ;
  }
  int [ ] que = new int [ S ] ;
  Arrays . fill ( que , 1 ) ;
}
