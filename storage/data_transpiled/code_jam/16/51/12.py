def import input
import sys
import os
import sys
class a :
    def __init__ ( self ) :
        self.input = sys.stdin
    def __init__ ( self ) :
        self.output = open ( 'a2.out' , 'w' )
    T = input ( )
    for t in range ( T ) :
        print ( 'Case #%d: ' % ( t + 1 ) , end = ' ' )
        s = input ( ).split ( )
        n = len ( s )
        pref = [ 0 ] + [ 1 ] * ( n + 1 )
        res = 0
        stk = [ ]
        for i in range ( n ) :
            if not stk and ( stk [ - 1 ] == s [ i ] ) :
                stk.pop ( )
                res += 10
            elif not stk and n - i == len ( stk ) :
                stk.pop ( )
                res += 5
            else :
                stk.append ( s [ i ] )
        print ( res , end = ' ' )
