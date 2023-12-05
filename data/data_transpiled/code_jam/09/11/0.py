def _import ( ) :
    from os import popen
    from itertools import count
    ishappy = [ [ 0 ] * ( 11 - len ( popen.read ( ).strip ( ) ) ) for i in range ( 0 , 1000 ) ]
    T = int ( popen.read ( ).strip ( ) )
    while T > 0 :
        t += 1
        parts = popen.read ( ).strip ( ).split ( 's++' )
        bases = [ int ( p ) for p in parts ]
        state = 0
        for x in bases :
            state |= 1 << ( x - 2 )
        num = ret
    return ishappy [ base ] [ num ] == 1
def getnext ( num , base ) :
    ret = 0
    while num > 0 :
        ret += ( num % base ) * ( num % base )
        num /= base
    return ret
def solve ( base , num ) :
    if ishappy [ base ] [ num ] == 1 :
        return True
    if ishappy [ base ] [ num ] == 0 :
        return False
    ishappy [ base ] [ num ] = 0
    if solve ( base , getnext ( num , base ) ) :
        ishappy [ base ] [ num ] = 1
    return ishappy [ base ] [ num ] == 1
ans = [ 1 << 9 ]
def main ( ) :
    for i in range ( 1000 ) :
        for j in range ( 11 ) :
            ishappy [ j ] [ i ] = - 1
        for j in range ( 2 , 10 ) :
            [ ishappy [ j ] , ishappy [ j ] ] = - 1
            ishappy [ j ] [ 1 ] = 1
            for k in range ( 2 , 1000 ) :
                solve ( j , k )
        for i in range ( 1 , ( 1 << 9 ) ) :
            ti = i
            numbases = 0
            while ti > 0 :
                numbases += ti % 2
                ti /= 2
            bases = [ ]
            bb = 0
            firstbit = 0
            for j in range ( 9 ) :
                if i & ( 1 << j ) :
                    bases.append ( j + 2 )
                    firstbit = j
                