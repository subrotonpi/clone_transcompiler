public static int score = 0 ;
for ( int i = 0 ;
i < 3 ;
i ++ ) {
  int s = Integer . parseInt ( input . nextLine ( ) ) , e = Integer . parseInt ( input . nextLine ( ) ) ;
  score += s * e / 10 ;
}
return score ;
}
