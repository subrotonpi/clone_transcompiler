def _solve ( ) :
    import random
    import sys
    import os
    import math
    import os
    import Queue
    import tokenize
    class D ( object ) :
        def __init__ ( self ) :
            self.stdin = open ( "%s.stdin" % self.stdin )
            self.stdout.flush ( )
            self.filename = open ( "%s.stdin" % self.stdin ).readline ( )
            self.stdin = open ( "%s.stdin" % self.stdin )
            self.stdout = open ( "%s.stdout" % self.stdin , self.stdout )
            self.stdin.write ( "%s %s" % ( self.filename , self.conq , self.threat ) )
            self.stdin.close ( )
        def next ( self ) :
            while self.conn [ 0 ] [ 1 ] not in [ '' , '' ] :
                self.conn [ 0 ] [ 1 ] = 0
        def __next__ ( self ) :
            token = next ( self )
            if len ( token ) != 1 :
                raise ValueError ( " String SPACETOKEN \% s\" % token )
            return token [ 0 ]
    def __next__ ( self ) :
        return atoi ( next ( self ) )
    def randrange ( self ) :
        return long ( next ( self ) )
    def next_ ( self ) :
        return randrange
    for i in range ( 1 , n ) :
        if not conn [ 0 ] [ i ] :
            continue
        ans = 0
        for j in range ( n ) :
            if conn [ 0 ] [ j ] != cdist - 1 :
                continue
        for k in range ( n ) :
            if conn [ k ] [ j ] != cdist + 1 or not conn [ i ] [ j ] :
                continue
            ans = max ( ans , self.conn [ k ] [ i ] )
    return ans
