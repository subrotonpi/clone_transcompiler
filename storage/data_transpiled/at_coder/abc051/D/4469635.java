static final int [ ] [ ] dijkstra ( int x , Map < Integer , List < Integer >> route ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int m = Integer . parseInt ( input ( ) ) ;
  List < List < Integer >> edges = new ArrayList < > ( ) ;
  List < int [ ] [ ] > ABC = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = Integer . parseInt ( input ( ) ) ;
    int b = Integer . parseInt ( input ( ) ) ;
    int c = Integer . parseInt ( input ( ) ) ;
    a = a - 1 ;
    b = b - 1 ;
    edges . get ( a ) . add ( new Integer ( b ) ) ;
    edges . get ( b ) . add ( new Integer ( c ) ) ;
    ABC . add ( new int [ ] [ ] {
      a , b , c }
      ) ;
    }
    return new int [ ] [ ] {
      {
        x , 0 }
        , {
          n }
        }
        ;
      }
      