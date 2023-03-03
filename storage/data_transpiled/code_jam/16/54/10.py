def import input
import sys
import os
class d ( input ) :
    def __init__ ( self ) :
        self.input = sys.stdin
        self.stdout = open ( 'd1.out' , 'w' )
        self.T = input.__next__ ( )
        for t in range ( self.T ) :
            n , l = input.__next__ ( )
            good = [ i for i in input.next ( ) if i in good ]
            bad = [ i for i in input.next ( ) if i in bad ]
            a = [ ]
            for i in range ( n ) :
                for j in range ( l ) :
                    if good [ i ] [ j ] == '0' : a [ i ] += 1
            a.sort ( )
            print ( 'Case #%d: ' % ( t + 1 ) , end = '' )
            if a [ 0 ] == 0 :
                print ( 'IMPOSSIBLE' , file = sys.stderr )
            else :
                res1 = ''
                for i in range ( l - 1 ) : res1 += '1'
                res0 = ''
                for i in range ( l ) :
                    res0 += '0'
                    if i == l - 1 and not res1 : res1 += '?'
                    else : res0 += '?'
                print ( res0 , res1 )
class input ( input ) :
    def __init__ ( self ) :
        self.input = sys.stdin
        self.tokens = sys.stdin.readlines ( )
    def __next__ ( self ) :
        while not self.tokens :
            self.tokens = sys.stdin.readlines ( )
        return self.tokens [ 0 ]
    def __next__ ( self ) :
        return int ( __next__ )
    def __next__ ( self ) :
        return float ( __next__ )
    def __next__ ( self ) :
        return int ( __next__ )
d.__next__ = __next__
