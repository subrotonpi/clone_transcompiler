public static int Q , int H , int S , int D ;
int N = Integer . parseInt ( input ( ) ) ;
H = Math . min ( H , 2 * Q ) ;
S = Math . min ( S , 2 * H ) ;
D = Math . min ( D , 2 * S ) ;
return N ;
}
