public static int ans = 0 ;
int [ ] lenDic = new int [ level ] ;
int [ ] pDic = new int [ level ] ;
int indexNext ;
int level = 0 ;
int eatNum = 0 ;
for ( int i = 0 ;
i < level ;
i ++ ) {
  if ( i == 0 ) {
    ans ++ ;
  }
  else {
    if ( i == index ) {
    }
    else if ( i == lenDic [ level ] / 2 ) {
      ans ++ ;
      ans += pDic [ level - 1 ] ;
    }
    else if ( i == lenDic [ level ] - 1 ) {
      ans += pDic [ level ] ;
    }
    else if ( i > lenDic [ level ] / 2 ) {
      ans += pDic [ level - 1 ] + 1 ;
      indexNext = index - lenDic [ level - 1 ] - 2 ;
      countAns ( level - 1 , indexNext , lenDic , pDic ) ;
    }
    else {
      indexNext = index - 1 ;
      countAns ( level - 1 , indexNext , lenDic , pDic ) ;
    }
  }
}
/* lenDic = new int[level];
lenDic[level] = 1;
for(int i = 0; i < level; i++) {
lenDic[i] = lenDic[i] * 2 +3;
}*/
/* pDic = new int[level];
pDic[level] = 1;
for(int i = 0; i < level; i++) {
pDic[i] = pDic[i] * 2 +1;
}*/
/* main program */
int ans = Integer . parseInt ( input ( ) ) ;
int level = input ( ) ;
int eatNum = input ( ) ;
lenDic = lenDic ;
pDic = pDic ;
countAns ( level , eatNum - 1 , lenDic , pDic ) ;
System . out . println ( ans ) ;
if ( __name__ . equals ( "main" ) ) {
  main ( ) ;
}
return ans ;
}
