def import import string , symbols
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = int ( sys.stdin.readline ( ).strip ( ) )
        self.L = int ( sys.stdin.readline ( ).strip ( ) )
        S = '+' + str ( sys.stdin.readline ( ).strip ( ) )
        sum = [ 0 ] * ( N + 1 )
        count = 0
        sum [ 0 ] = 1
        for i in range ( 1 , N + 1 ) :
            if S [ i ] == '+' :
                sum [ i ] = sum [ i - 1 ] + 1
            if S [ i ] == '-' :
                sum [ i ] = sum [ i - 1 ] - 1
            if sum [ i ] > L :
                count += 1
                sum [ i ] = 1
        print ( count )
