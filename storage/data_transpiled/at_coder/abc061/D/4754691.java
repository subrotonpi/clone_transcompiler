public static double inf = Double . POSITIVE_INFINITY ;
int N = Integer . parseInt ( input . readLine ( ) ) ;
int M = Integer . parseInt ( input . readLine ( ) ) ;
List < Pair > info = new ArrayList < > ( ) ;
for ( int i = 0 ;
i < M ;
i ++ ) {
  int a = Integer . parseInt ( input . readLine ( ) ) ;
  int b = Integer . parseInt ( input . readLine ( ) ) ;
  int c = Integer . parseInt ( input . readLine ( ) ) ;
  a -- ;
  b -- ;
  info . add ( new Pair ( a , b , c ) ) ;
}
double [ ] dist = new double [ N ] ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  dist [ i ] = - inf ;
}
dist [ 0 ] = 0 ;
for ( int i = 1 ;
i < N ;
i ++ ) {
  dist [ i ] = dist [ i ] + w ;
}
dist [ N ] = 0 ;
for ( int i = 1 ;
i < N ;
i ++ ) {
  dist [ i ] = dist [ i ] = dist [ i ] + w ;
}
return dist [ N - 1 ] ;
}
