def import locale , file
import locale
import os
import locale
import sys
import locale
import os
DX = [ 0 , - 1 , - 1 , - 1 , 0 , 1 , 1 , 1 ]
DY = [ 1 , 1 , 0 , - 1 , - 1 , - 1 , 0 , 1 ]
def solve ( ) :
    with open ( 'd.out' , 'w' ) as f :
        with open ( 'd.in' , 'r' ) as f :
            f.write ( 'A' )
def go ( d ) :
    global DX
    global DY
    global mem
    mem = { }
    def go ( d ) :
        key = ''
        for row in d :
            key += ''.join ( row )
        if mem.has_key ( key ) :
            return mem [ key ]
        ki , kj = - 1 , - 1
        for i in range ( n ) :
            for j in range ( m ) :
                if d [ i ] [ j ] == 'K' :
                    d [ i ] [ j ] = '#'
                    ki = i
                    kj = j
                    break
        ans = False
        for t in range ( 8 ) :
            ni = ki + DX [ t ]
            nj = kj + DY [ t ]
            if ni < 0 or nj < 0 or ni >= n or nj >= m :
                continue
            if d [ ni ] [ nj ] == '#' :
                continue
            d [ ni ] [ nj ] = 'K'
            res = go ( d )
            d [ ni ] [ nj ] = '.'
            if not res :
                ans = True
                break
        mem [ key ] = ans
        d [ ki ] [ kj ] = 'K'
        return ans
