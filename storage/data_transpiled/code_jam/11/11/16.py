def r1a ( ) :
    import random
    from math import gcd
    if not b :
        return a
    return gcd ( b , a % b )
def solve ( N , PD , PG ) :
    dcoeff = 100 / gcd ( 100 , PD )
    gcoeff = 100 / gcd ( 100 , PG )
    dw = dcoeff * PD / 100
    gw = gcoeff * PG / 100
    dl = dcoeff - dw
    gl = gcoeff - gw
    if not gw and dw != 0 :
        return False
    if not gl and dl != 0 :
        return False
    if dcoeff > N :
        return False
    return True
def main ( ) :
    with open ( "/proc/sys/stdin" , "r" ) as f :
        T = f.read ( )
        for cn in range ( 1 , T + 1 ) :
            N , PD , PG = solve ( N , PD , PG )
            if solve ( N , PD , PG ) :
                print ( "Case #%d: Possible\n" % cn )
            else :
                print ( "Case #%d: Broken\n" % cn )
