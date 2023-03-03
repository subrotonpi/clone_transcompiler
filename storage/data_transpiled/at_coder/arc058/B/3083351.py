def _import ( ) : return _1_000_000_007
def add_mod ( a , b ) :
    tmp = ( a + b ) % MOD
    return tmp if tmp >= 0 else tmp + MOD
def sub_mod ( a , b ) : return add_mod ( a , - b )
def multmod_mod ( a , b ) :
    tmp = ( a * b ) % MOD
    return tmp if tmp >= 0 else tmp + MOD
def power_mod ( a , x ) :
    if x < 0 : return 0
    if x == 0 : return 1
    if x % 2 == 0 :
        half = power_mod ( a , x // 2 )
        return multmod_mod ( half , half )
    return ( a * power_mod ( a , x - 1 ) ) % MOD
def inverse_mod ( a ) : return power_mod ( a , MOD - 2 )
def div_mod ( a , b ) : return multmod_mod ( a , inverse_mod ( b ) )
def make_factorial ( size ) :
    x = [ 1 ]
    for i in range ( 1 , size ) :
        x.append ( multmod_mod ( x [ i - 1 ] , i ) )
    return x
def make_inversed_list ( original ) :
    x = [ inverse_mod ( original [ i ] ) for i in range ( len ( original ) ) ]
    return x
def combination ( n , r , fact , fact_inv ) :
    return multmod_mod ( fact [ n ] , multmod_mod ( fact_inv [ r ] , fact_inv [ n - r ] ) )
def main ( ) :
    fact = make_factorial ( 200001 )
    fact_inv = make_inversed_list ( fact )
    with open ( "/tmp/" , "r" ) as sc :
        H = sc.randint ( 1 , 2 )
        W = sc.randint ( 1 , 2 )
        A = sc.randint ( 1 , 2 )
        B = sc.randint ( 1 , 2 )
        h = H - 1 - A
        w = B
        ans = 0
        while h >= 0 and w < W :
            ans = add_mod ( ans , multmod_mod ( fact [ n ] , h , fact [ n - r ] , fact_inv [ n - r ] ) )
        return ans