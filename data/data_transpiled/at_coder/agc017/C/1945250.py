def import _intlist
import sys
import string
import sys
import itertools
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        N = sys.stdin.read ( )
        M = sys.stdin.read ( )
        A = intlist ( )
        num = [ 0 ] * ( N + 1 )
        line = [ 0 ] * ( N + 1 )
        num [ A [ i ] ] += 1
        for i in range ( N + 1 ) :
            num [ A [ i ] ] += 1
        for i in range ( 1 , N + 1 ) :
            for j in range ( num [ i ] ) :
                if i > j :
                    line [ i - j ] += 1
        gap = 0
        for i in range ( 1 , N + 1 ) :
            if line [ i ] <= 0 :
                gap += 1
            while M :
                x = sys.stdin.read ( M - 1 )
                y = sys.stdin.read ( M )
                a = A [ x ]
                A [ x ] = y
                del num [ a ]
                if a - num [ a ] > 0 :
                    del line [ a - num [ a ] ]
                    if line [ a - num [ a ] ] == 0 :
                        gap += 1
                num [ y ] += 1
                if y - num [ y ] + 1 > 0 :
                    if line [ y - num [ y ] + 1 ] == 0 :
                        gap -= 1
                    line [ y - num [ y ] + 1 ] += 1
                print ( gap )
