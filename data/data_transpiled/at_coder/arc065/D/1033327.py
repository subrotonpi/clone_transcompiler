def import import _sys , os , sys
from os import urandom
import random
class Main ( object ) :
    MOD = int ( 1e9 + 7 )
    def __init__ ( self , f , g ) :
        self.MOD = int ( 1e9 + 7 )
    def solve ( self , f , g ) :
        N , M = struct.unpack ( '!I' , f.read ( 8 ) )
        S = f.read ( 8 )
        right = [ - 1 ] * N
        for i in range ( M ) :
            l = random.randint ( 0 , M )
            r = random.randint ( 0 , M )
            if right [ l ] < r :
                right [ l ] = r
        self.max = [ ]
        for i in range ( N ) :
            self.max = max ( self.max , i )
            self.max = max ( self.max , right [ i ] )
            right.append ( self.max )
        self.sum = [ S [ i ] - '0' for i in range ( N ) ]
        for i in range ( N - 1 ) :
            self.sum += sum [ i ]
        dp = [ [ 1 ] * ( N + 1 ) ]
        dp [ 0 ] [ 0 ] = 1
        for i in range ( N ) :
            for used_one in range ( N ) :
                r = self.right [ i ]
                rest_one = self.sum [ r - used_one ]
                if rest_one < 0 :
                    continue
                if rest_one > 0 :
                    dp [ i + 1 ] [ used_one + 1 ] = ( dp [ i + 1 ] [ used_one + 1 ] + dp [ i ] [ used_one ] ) % MOD
                if r - i + 1 != rest_one :
                    dp [ i + 1 ] [ used_one ] = ( dp [ i + 1 ] [ used_one ] + dp [ i ] [ used_one ] ) % MOD
        g.write ( dp [ N ] [ sum [ N - 1 ] ] )
