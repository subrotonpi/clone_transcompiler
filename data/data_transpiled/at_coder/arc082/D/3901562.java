@ Class < ? > input = Class . forName ( "System.in.console" ) public static void main ( String input ) throws ClassNotFoundException {
  MIS = new MIS ( ) ;
  MIS . init ( ) ;
  class Sandgraph {
    int i ;
    int t , a ;
    int z = 0 ;
    int x1 = 0 ;
    int x2 = X ;
    public int i ;
    {
      int d1 = Math . min ( dt , X - ( X - ( X - x2 + z - x1 ) ) ) ;
      z += d1 ;
      dt -= d1 ;
      d1 = Math . min ( dt , X - ( X - x2 - x1 ) ) ;
      z += d1 ;
      x2 -= d1 ;
    }
    public int add ( int i , int dt ) {
      int d1 = Math . min ( dt , X - ( X - z ) ) ;
      z -= d1 ;
      dt -= d1 ;
      d1 = Math . min ( dt , X - ( X - x2 ) ) ;
      x1 += d1 ;
      return i ;
    }
    public int sub ( int i , int dt ) {
      int d1 = Math . min ( dt , X - ( X - z ) ) ;
      z -= d1 ;
      dt -= d1 ;
      d1 = Math . min ( dt , X - ( X - z ) ) ;
      x1 += d1 ;
      return i ;
    }
    public int sub ( int i , int dt ) {
      if ( dt <= X ) return X ;
      else if ( dt <= X ) return a + X - X ;
      else return X + X - X ;
    }
  }
  X = Integer . parseInt ( input ) ;
  int k = Integer . parseInt ( input ) ;
  int [ ] rev = new int [ k ] ;
  int Q = Integer . parseInt ( input ) ;
  Sandgraph sand = new Sandgraph ( X ) ;
  int last_t = 0 ;
  int i = 0 ;
  for ( int QUERY = 0 ;
  QUERY < Q ;
  QUERY ++ ) {
    int t = MIS . nextInt ( ) ;
    int a = MIS . nextInt ( ) ;
    while ( i < k && rev [ i ] <= t ) {
      int dt = rev [ i ] - last_t ;
      if ( i % 2 == 0 ) sand . sub ( dt ) ;
      else sand . add ( dt ) ;
      last_t = rev [ i ] ;
      i ++ ;
    }
    int dt = t - last_t ;
    if ( i % 2 == 0 ) sand . sub ( dt ) ;
    else sand . add ( dt ) ;
    System . out . println ( sand .