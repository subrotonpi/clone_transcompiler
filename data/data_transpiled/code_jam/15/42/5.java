static double inf = 1e111 ;
double subok = ( R0 , X0 ) -> {
  if ( Math . abs ( X0 - X ) < 1e-8 ) return V / R0 ;
  else return inf ;
}
double subok2 = ( R0 , X0 ) -> {
  if ( Math . abs ( X0 - X ) < 1e-8 && Math . abs ( X1 - X ) < 1e-8 ) return V / ( R1 + R0 ) ;
  if ( Math . abs ( X0 - X ) < 1e-8 || Math . abs ( X1 - X ) < 1e-8 ) return inf ;
  if ( X0 >= X >= X1 ) return subok2 ( ( R1 , X1 ) -> {
    if ( X0 <= X && X1 <= X1 ) return subok2 ( ( R1 , X1 ) -> {
      if ( X0 <= X && X1 <= X1 ) return subok2 ( ( R1 , X1 ) -> {
        if ( X0 <= X && X1 <= X1 ) return subok2 ( ( R1 , X1 ) -> {
          if ( X0 <= X && X1 <= X1 ) return subok2 ( ( R1 , X1 ) -> {
            if ( X0 <= X && X1 <= X1 ) return subok2 ( ( R1 , X1 ) ) ;
            return subok2 ( ( R1 , X1 ) -> {
              if ( X0 <= X && X1 <= X1 ) return subok2 ( ( R1 , X1 ) ) ;
              return subok2 ( ( R1 , X1 ) -> {
                if ( X0 <= X && X1 <= X1 ) return subok2 ( ( R1 , X1 ) ) ;
                return subok2 ( ( R1 , X1 ) -> {
                  if ( X0 <= X && X1 <= X1 ) return subok2 ( ( R1 , X1 ) ) ;
                  return subok2 ( ( R1 , X1 ) ) ;
                }
                ) ;
              }
            }
            ) ;
            return subok2 ( ( R1 , X1 ) -> subok2 ( ( R1 , X1 ) ) ) ;
          }
          ) ;
        }
      }
      ) ;
    }
  }
}
;
for ( int cas : xrange ( 1 , 1 + input ) ) {
  int N = input . nextInt ( ) ;
  double V = input . nextDouble ( ) ;
  double X = input . nextDouble ( ) ;
  N = Integer . parseInt ( input . nextInt ( ) ) ;
  double [ ] src = new double [ N ] ;
  for ( int i = xrange ( N ) ;
  i < N ;
  i ++ ) {
    double Ri = input . nextDouble ( ) ;
    double Xi = input . nextDouble ( ) ;
    src [ i ]