public static int N = Integer . parseInt ( input ) ;
int h = N / 3600 ;
N = N % 3600 ;
int m = N / 60 ;
int s = N % 60 ;
h = Integer . toString ( h ) ;
m = Integer . toString ( m ) ;
s = Integer . toString ( s ) ;
return h ;
}
