def _import ( ) : return int ( x )
P = 998244353
mc = ModuloCombinatorics ( 1000000 , P )
def solve ( n , k ) :
    ans = 0
    for plus in range ( 0 , k ) :
        minus = k - plus
        if plus < minus or plus < n :
            continue
        same = max ( n - ( plus - minus ) , 0 )
        if same > minus :
            raise AssertionError ( )
        max_neg = minus - same
        ans += go ( plus , plus == minus , max_neg )
        if ans >= P :
            ans -= P
    def go ( p , q , bad ) :
        new_sum = p + q
        new_diff = - 2 * ( bad + 1 ) - ( p - q )
        x = ( new_sum + new_diff ) // 2
        y = ( new_sum - new_diff ) // 2
        ret = mc.choose ( p + q , p )
        if x >= 0 and y >= 0 :
            ret -= mc.choose ( x + y , x )
            if ret < 0 :
                ret += P
        return ret
    submit ( )
    return solve ( randint ( 1 , N ) , randint ( 1 , N ) )
