def _import ( ) : return _import ( )
import sys
def main ( ) :
    global f , x
    global P
    global eof
    f = int ( raw_input ( ) )
    x = abs ( x )
    return int ( raw_input ( ) )
def uniform ( ) : return float ( raw_input ( ) )
def solve ( ) :
    n = randint ( 0 , 2 * n - 1 )
    a = [ randint ( 0 , 2 * n - 1 ) for i in range ( 2 * n - 1 ) ]
    a.sort ( )
    dp = [ [ ] , [ 1 ] ]
    for i in range ( 1 , n ) :
        add_l = 1 if a [ n - i ] != a [ n - 1 - i ] else 0
        add_r = 1 if a [ n - 1 + i ] != a [ n - 2 + i ] else 0
        nxt = [ [ ] , [ 1 ] ]
        for cnt in range ( 1 , 2 * i - 1 ) :
            for place in range ( cnt ) :
                real_cnt = cnt + add_l + add_r
                real_place = place + add_l
                for to_place in range ( real_cnt ) :
                    new_cnt = real_cnt - f ( to_place - real_place )
                    new_place = to_place if to_place <= real_place else real_place + 1
                    nxt [ new_cnt ] [ new_place ] += dp [ cnt ] [ place ]
                    if nxt [ new_cnt ] [ new_place ] >= P :
                        nxt [ new_cnt ] [ new_place ] -= P
        dp = nxt
    ret = 0
    for row in dp :
        for val in row :
            ret += val
    print ( ret % P )
P = 1_000_000_007
def solve ( ) :
    f = raw_input ( )
    out = sys.stdout
    solve ( )
    out.close ( )
