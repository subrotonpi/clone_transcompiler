public static int [ ] [ ] getNegativeInstances ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) , M = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] ans ;
  if ( M % 4 == 0 ) {
    ans = M / 4 + 1 <= N && N <= M / 2 ? new int [ ] {
      - 1 , - 1 , - 1 }
      : new int [ ] [ ] {
        1 , - 1 , - 1 }
        ;
      }
      else if ( M % 4 == 2 ) {
        ans = new int [ ] [ ] {
          M / 2 - ( M / 2 - N ) * 2 , 0 , M / 2 - N }
          ;
        }
        else {
          ans = new int [ ] [ ] {
            1 , M / 2 - N }
            ;
          }
          return ans ;
        }
        