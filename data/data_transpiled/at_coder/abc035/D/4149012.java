static final int [ ] [ ] dijkstra ( int x , int m , int t ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int m = Integer . parseInt ( input ( ) ) ;
  int t = Integer . parseInt ( input ( ) ) ;
  int [ ] [ ] A = new int [ n ] [ m ] ;
  int [ ] [ ] go = new int [ n ] [ m ] ;
  int [ ] [ ] back = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = Integer . parseInt ( input ( ) ) ;
    int b = Integer . parseInt ( input ( ) ) ;
    int c = Integer . parseInt ( input ( ) ) ;
    a -- ;
    b -- ;
    go [ a ] [ b ] = c ;
    back [ b ] [ a ] = c ;
  }
  return new int [ ] [ ] {
    {
      x }
    }
    ;
  }
  