def _import ( ) : return
import os
import sys
class Template ( object ) :
    def __init__ ( self ) :
        self.f = open ( self.name + '.in' )
        self.f = open ( self.name + '.out' )
        self.f.write ( "Case #%d: %.4f" % ( self.name , self.name ) )
        self.size = 1
        while self.size < self.n :
            self.size <<= 1
        self.tree = [ self.ans , self.tree [ self.n ] ] * 2
    def set ( self , x , v , L , R , node ) :
        self.tree [ node ] = min ( self.tree [ node ] , v )
        if L < R :
            mid = ( L + R ) // 2
            if x <= mid :
                self.set ( x , v , L , mid , node * 2 + 1 )
            else :
                self.set ( x , v , mid + 1 , R , node * 2 + 2 )
    def get ( self , l , r , L , R , node ) :
        if r < L or R < l :
            return 1000000000
        if L <= r <= r :
            return self.tree [ node ]
        mid = ( L + R ) // 2
        return min ( self.get ( l , r , L , mid , node * 2 + 1 ) , self.get ( l , r , mid + 1 , R , node * 2 + 2 ) )
class Segment ( object ) :
    def __init__ ( self ) :
        self.c = self.c
        self.a = a
        self.b = b
    def __lt__ ( self , o ) :
        return self.b - o.b
class Solution ( object ) :
    def __init__ ( self ) :
        self.a = 1
        self.b = 2
        self.c = 1
        self.a = 2
        self.b = 2
        self.c = 3
        self.a = 3
        self.b = 4
        self.a = 3
        self.b = 4
        self.c = 5
        self.a = 3
        self.a = 4
return Solution