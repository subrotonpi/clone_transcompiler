public static int N = Integer . parseInt ( input ) ;
int h = N / 3600 , m = N % 3600 ;
m = m / 60 , s = m % 60 ;
return h ;
}
