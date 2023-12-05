def _import ( ) : return { }
import collections
import os
class OneNodeList ( list ) :
    def __init__ ( self ) :
        self.list = [ ]
        self.dict = { }
        def push ( self ) : self.list.append ( self.list [ 0 ] )
    def peek ( self ) :
        a = self.list.pop ( )
        return a
    def empty ( self ) : return self.list
    def put ( self , a , b ) :
        self.dict [ a ] = b
    def get ( self , a ) : return self.dict [ a ]
class Main ( object ) :
    def __init__ ( self ) :
        self.length = [ ]
        self.rin = [ ]
        self.v = [ ]
    def run ( self , args ) :
        with open ( self.input , 'r' ) as f :
            N = f.readline ( ).strip ( )
            a = [ ]
            b = [ ]
            c = [ ]
            for i in range ( N - 1 ) :
                a.append ( f.readline ( ) )
                b.append ( f.readline ( ) )
                c.append ( f.readline ( ) )
            Q = f.readline ( ).strip ( )
            K = f.readline ( ).strip ( )
            x = [ ]
            y = [ ]
            for i in range ( Q ) :
                x.append ( f.readline ( ) )
                y.append ( f.readline ( ) )
            self.rin = [ OneNodeList ( ) ]
            for i in range ( 1 , N + 1 ) :
                self.rin.append ( OneNodeList ( ) )
            v = [ 1 ]
            for i in range ( N - 1 ) :
                haji1 = a [ i ]
                haji2 = b [ i ]
                self.rin [ haji1 ].push ( haji2 )
                self.rin [ haji1 ] [ haji2 ] = c [ i ]
            v.append ( v [ i ] )
