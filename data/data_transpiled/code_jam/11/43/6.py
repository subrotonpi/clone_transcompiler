def _import ( ) : return int ( x )
import os
import sys
import math
import os
import sys
import os
import tempfile
import os
import tokenize
import tokenize
import tokenize
import readline
import tokenize
import readline
import tokenize
import random
import random
class C :
    def readline ( ) :
        return open ( '' )
    def readline ( ) :
        return next ( tokenize.lex )
    def readline ( ) :
        return next ( tokenize.lex )
    def readline ( ) :
        return next ( readline )
    def lpow ( a , n ) :
        ans = 1
        for i in range ( n ) :
            nans = ans * a
            if nans / a != ans :
                return long ( next ( tokenize.lex ) )
            ans = nans
        return ans
    def solve ( ) :
        n = random.randint ( 1 , n )
        if n <= 1 :
            print ( 0 )
            return
        ans = 1
        for i in range ( 2 ) :
            est = round ( pow ( n , 1./ i ) )
            while lpow ( est , i ) < n :
                est += 1
            while lpow ( est , i ) > n :
                est -= 1
            if est < 2 :
                break
            ans += pi ( int ( est ) )
        print ( ans )
        if primes [ 0 ] != 2 :
            raise AssertionError
    primes = [ 2 ]
    def pi ( val ) :
        while val > primes [ - 1 ] :
            nprimes = primes [ : 2 ]
            i = len ( primes )
            primes = nprimes
            for i in range ( len ( primes ) ) :
                ps = 0
                for p in primes [ i - 1 ] + 1 :
                    for j in range ( i , i + 1 ) and long ( primes [ j ] * primes [ j ] <= p ) :
                        if p % primes [ j ] == 0 :
                            continue
                    primes [ i ] = p
                    break
        ans = sum ( primes )
        return ans + 1 if ans >= 0 else ~ ans
    C.write ( 'Enter filename: ' )
    sys.stdout.flush ( )
