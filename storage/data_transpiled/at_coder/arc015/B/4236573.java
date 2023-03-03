public static int n = Integer . parseInt ( input ) ;
int a = 0 , b = 0 , c = 0 , d = 0 , e = 0 , f = 0 ;
for ( int i = 0 ;
i <= n ;
i ++ ) {
  String [ ] s = input . split ( " " ) ;
  if ( Double . parseDouble ( s [ 0 ] ) >= 35 ) a ++ ;
  if ( Double . parseDouble ( s [ 0 ] ) < 35 && Double . parseDouble ( s [ 0 ] ) >= 30 ) b ++ ;
  if ( Double . parseDouble ( s [ 0 ] ) >= 25 && Double . parseDouble ( s [ 0 ] ) < 30 ) c ++ ;
  if ( Double . parseDouble ( s [ 0 ] ) < 0 ) e ++ ;
}
return a ;
}
