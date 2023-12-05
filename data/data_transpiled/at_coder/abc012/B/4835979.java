public static int N = Integer . parseInt ( input ) ;
int hh = ( int ) ( N / 3600 % 24 ) ;
int mm = ( int ) ( N / 60 % 60 ) ;
int ss = N % 60 ;
return hh + mm + ss ;
}
