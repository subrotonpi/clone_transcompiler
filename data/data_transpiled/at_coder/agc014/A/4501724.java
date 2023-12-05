public static int solve ( ) {
  int a = ( Integer ) input . nextInt ( ) , b = ( Integer ) input . nextInt ( ) , c = ( Integer ) input . nextInt ( ) ;
  ArrayList < int [ ] > queue = new ArrayList < > ( ) ;
  queue . add ( new int [ ] {
    a , b , c }
    ) ;
    int ct = 0 ;
    while ( ct < 100000000 ) {
      if ( a % 2 == 1 || b % 2 == 1 || c % 2 == 1 ) break ;
      int tmpa = a / 2 ;
      int tmpb = b / 2 ;
      int tmpc = c / 2 ;
      a = tmpb + tmpc ;
      b = tmpa + tmpc ;
      c = tmpa + tmpb ;
      if ( queue . contains ( new int [ ] {
        a , b , c }
        ) ) return - 1 ;
        else {
          ct ++ ;
          queue . add ( new int [ ] {
            a , b , c }
            ) ;
          }
        }
        return ct ;
      }
      