public static int A , int B , int K , int L ;
int mikan_cost_a = B * ( K / L ) + A * ( K % L ) ;
int mikan_cost_b = B * ( K / L + 1 ) ;
mikan_cost = Math . min ( mikan_cost_a , mikan_cost_b ) ;
return mikan_cost ;
}
