public static void input ( ) {
  int q = Integer . parseInt ( input . readLine ( ) ) ;
  int h = Integer . parseInt ( input . readLine ( ) ) ;
  int s = Integer . parseInt ( input . readLine ( ) ) ;
  int d = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] r = {
    q , h , s , d }
    ;
    int n = Integer . parseInt ( input . readLine ( ) ) * 4 ;
    int [ ] l = {
      q , h / 2 , s / 4 , d / 8 }
      ;
      int [ ] v = {
        1 , 2 , 4 , 8 }
        ;
        int cost = 0 ;
        while ( n -- > 0 ) {
          int now = l . indexOf ( Math . min ( l [ now ] , v [ now ] ) ) ;
          cost += n / v [ now ] * r [ now ] ;
          n %= v [ now ] ;
          v [ now ] = n ;
          r [ now ] = n ;
          l [ now ] = n ;
        }
        System . out . println ( cost ) ;
      }
      