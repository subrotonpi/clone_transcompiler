def _ _ new _ _ ( ) : return ''
import os
import random
import math
import random
import string
class A ( object ) :
    def __init__ ( self , b ) :
        self.oo = int ( 1e9 )
        self.n = self.n
    def __init__ ( self , b ) :
        with open ( 'Abf.out' , 'r' ) as fin :
            self.n = self.n
    def __init__ ( self , b ) :
        self.n = b
        self.mask = b
    def find_base_rep ( val ) :
        for i in range ( len ( self.n ) ) :
            if self.n [ i ] == val : return self.base_reps [ i ]
    def find_base_val ( rep ) :
        return ' '.join ( self.n )
    def __init__ ( self , o ) :
        self.n = o.n
    def solve ( self , mask ) :
        z = self.n - o.n
        if z == 0 :
            z = mask - o.mask
        return z
    def solve ( self , mask ) :
        for n in range ( 2 ) :
            if happy ( n , mask ) : return n
    def happy ( self , mask ) :
        if mask == 0 : return True
        s = state ( self , mask )
        base = 2
        while not on ( mask , base ) : base += 1
        if is_happy ( self , mask ) : ret = happy ( self , mask - ( 1 << base ) )
        else : ret = False
        return ret
    def is_happy ( self , mask ) :
        S = [ ]
        s = dec_to_base ( self , base )
        while s not in S :
            S.append ( s )
            s = go ( s , base )
            if s == '1' : return True
        return False
    def go ( self , n , base ) :
        res = 0
        for i in range ( len ( self.n ) ) :
            d = self.n [ i ] - '0'
            res += d * d
        return dec_to_base ( res , base )
    def solve ( self , mask ) :
        for i in range ( len ( self.