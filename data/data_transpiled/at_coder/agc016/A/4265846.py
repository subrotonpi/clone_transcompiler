def _ ( ) : return True
import sys
import string
import random
class Main ( object ) :
    def __init__ ( self ) :
        sc = string.ascii_lowercase
        s = sc.split ( )
        alp = [ 0 ] * 26
        for c in s :
            alp [ c ] - 97
    mjs = [ [ - 1 ] * 26 for c in s ]
    for i in range ( len ( s ) ) :
        mjs [ 0 ] [ i ] = - 1
    answ = 114514
    for max in range ( 26 ) :
        for i in range ( 1 , len ( s ) ) :
            for j in range ( len ( s ) - i ) :
                if mjs [ i - 1 ] [ j ] != max and mjs [ i - 1 ] [ j + 1 ] != max :
                    if mjs [ i - 1 ] [ j + 1 ] == - 1 :
                        mjs [ i ] [ j ] = mjs [ i - 1 ] [ j ]
                    else :
                        mjs [ i ] [ j ] = mjs [ i - 1 ] [ j ]
                if mjs [ i - 1 ] [ j ] == max or mjs [ i - 1 ] [ j + 1 ] == max :
                    mjs [ i ] [ j ] = max
        for i in range ( len ( s ) ) :
            ans = ac ( i )
            if ans :
                answ = min ( i , answ )
    print ( answ )
    def ac ( a ) :
        for i in range ( len ( mjs [ 0 ] ) ) :
            if mjs [ 0 ] [ i ] != - 1 and max != mjs [ 0 ] [ i ] :
                return False
            elif mjs [ 0 ] [ i ] == - 1 :
                break
        return True
