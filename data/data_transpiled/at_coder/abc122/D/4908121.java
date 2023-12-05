public static int MOD = 10 * * 9 + 7 ;
int N = Integer . parseInt ( input ) ;
int countA = 4 ;
int countG = 4 ;
int countAG = 1 ;
int countGA = 1 ;
int countAC = 1 ;
int countAGX = 0 ;
int countAXG = 0 ;
int countAT = 1 ;
int ans = 16 ;
int [ ] nextnums = new int [ 7 ] ;
for ( int i = 0 ;
i < N - 2 ;
i ++ ) {
  nextnums [ i ] = 0 ;
}
for ( int i = 0 ;
i < N - 2 ;
i ++ ) {
  nextans = ans * 4 - countAG - countGA - countAC - countAXG - countAGX ;
  nextA = ans ;
  nextG = ans - countAC ;
  nextAG = countA ;
  nextGA = countG ;
  nextAC = countA - countGA ;
  nextAGX = 2 * countAG ;
  nextAXG = countAT ;
  nextAT = countA ;
  ans = nextans % MOD ;
  countA = nextA % MOD ;
  countAC = nextAC % MOD ;
  countAG = nextAG % MOD ;
  countAGX = nextAGX % MOD ;
  countAT = nextAT % MOD ;
  countAXG = nextAXG % MOD ;
  countG = nextG % MOD ;
  countGA = nextGA % MOD ;
}
System . out . println ( ans ) ;
return ans ;
}
