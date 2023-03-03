public static void main ( ) {
  {
    X = x ;
    Y = y ;
    H = h ;
  }
  {
    int N = Integer . parseInt ( input . nextLine ( ) ) ;
    Info [ ] infos = new Info [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int x = Integer . parseInt ( input . nextLine ( ) ) ;
      int y = Integer . parseInt ( input . nextLine ( ) ) ;
      int h = Integer . parseInt ( input . nextLine ( ) ) ;
      infos [ i ] = new Info ( x , y , h ) ;
    }
    final int MAX = 100 ;
    for ( int posY = 0 ;
    posY <= MAX ;
    posY ++ ) {
      for ( int posX = 0 ;
      posX <= MAX ;
      posX ++ ) {
        int ans_h = - 1 ;
        for ( int i = 0 ;
        i < N ;
        i ++ ) {
          if ( infos [ i ] . H > 0 ) {
            int H = infos [ i ] . H + Math . abs ( posY - infos [ i ] . Y ) + Math . abs ( posX - infos [ i ] . X ) ;
            if ( ans_h == - 1 ) {
              ans_h = H ;
            }
            else {
              if ( ans_h != H ) {
                ans_h = - 2 ;
                break ;
              }
            }
          }
        }
        if ( ans_h == - 2 ) {
          continue ;
        }
        boolean is_ok = true ;
        for ( int i = 0 ;
        i < N ;
        i ++ ) {
          if ( infos [ i ] . H == 0 ) {
            if ( ans_h - Math . abs ( posY - infos [ i ] . Y ) - Math . abs ( posX - infos [ i ] . X ) <= 0 ) {
              continue ;
            }
            else {
              is_ok = false ;
              break ;
            }
          }
        }
        if ( is_ok ) {
          System . out . println ( posX + " " + posY + " " + ans_h ) ;
          return ;
        }
      }
    }
  }
  if ( getClass ( ) . isClassPresent ) {
    Class . forName ( "java.io.Serializable" ) ;
  }
}
