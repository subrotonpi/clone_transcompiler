static final Scanner fin = new Scanner ( new File ( "1.in" ) ) ;
PrintWriter fout = new PrintWriter ( new BufferedWriter ( new OutputStreamWriter ( System . out ) ) ) ;
int T = Integer . parseInt ( fin . nextLine ( ) ) ;
for ( int t = 0 ;
t < T ;
t ++ ) {
  System . out . println ( t + 1 ) ;
  int N = Integer . parseInt ( fin . nextLine ( ) ) ;
  int K = Integer . parseInt ( fin . nextLine ( ) ) ;
  ArrayList < Point > P = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int r = Integer . parseInt ( fin . nextLine ( ) ) ;
    int h = Integer . parseInt ( fin . nextLine ( ) ) ;
    P . add ( new Point ( r , h , 2 * h * r ) ) ;
  }
  Collections . sort ( P ) ;
  System . out . println ( P ) ;
  int ans = 0 ;
  for ( int j = N - 1 ;
  j >= K - 2 ;
  j -- ) {
    int maxRadius = P . get ( j ) . x ;
    int area = P . get ( j ) . y + maxRadius * maxRadius ;
    P . remove ( j ) ;
    ArrayList < Point > filtered = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < P . size ( ) ;
    i ++ ) {
      if ( P . get ( i ) . x <= maxRadius ) {
        filtered . add ( hr ) ;
      }
    }
    Collections . sort ( filtered ) ;
    System . out . println ( filtered ) ;
    for ( int i = 1 ;
    i < K ;
    i ++ ) {
      area += filtered . get ( filtered . size ( ) - i ) ;
    }
    ans = Math . max ( ans , area ) ;
  }
  ans *= Math . PI ;
  ans = ans + ": " + ans ;
  fout . println ( "Case #" + ( t + 1 ) + ": " + ans ) ;
}
return fout ;
}
