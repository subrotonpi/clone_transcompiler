def import _main
import sys
import os
import sys
import itertools
import itertools
class Main ( object ) :
    def __init__ ( self ) :
        self.prime = [ 2 , 3 , 5 , 7 ]
        self.target = [ 2 , 4 , 14 , 24 , 74 ]
    def main ( self ) :
        n = self.n
        if n < 10 :
            print ( 0 )
            return
        list = [ ]
        for i in range ( 2 , n + 1 ) :
            tmp = i
            for j in range ( 4 ) :
                if tmp % self.prime [ j ] == 0 :
                    while tmp % self.prime [ j ] == 0 :
                        list.append ( self.prime [ j ] )
                        tmp /= self.prime [ j ]
            if tmp != 1 :
                list.append ( tmp )
        dict = list.groupby ( lambda p : p.count ( ) )
        tmp = [ 0 ] * 5
        for cnt in dict.values ( ) :
            for i in range ( 5 ) :
                if cnt >= self.target [ i ] :
                    tmp [ i ] += 1
        ans = 0
        ans += tmp [ 4 ]
        if tmp [ 3 ] > 0 :
            ans += ( tmp [ 0 ] - tmp [ 3 ] ) * tmp [ 3 ]
            ans += tmp [ 3 ] * ( tmp [ 3 ] - 1 )
        if tmp [ 2 ] > 0 :
            ans += ( tmp [ 1 ] - tmp [ 2 ] ) * tmp [ 2 ]
            ans += tmp [ 2 ] * ( tmp [ 2 ] - 1 )
        if tmp [ 1 ] >= 2 :
            ans += ( tmp [ 0 ] - tmp [ 1 ] ) * tmp [ 1 ] * ( tmp [ 1 ] - 1 ) / 2
            ans += tmp [ 1 ] * ( tmp [ 1 ] - 1 ) * ( tmp [ 1 ] - 2 ) / 2
        print ( ans )
