def _import ( ) : return sys.stdin.read ( )
import readline
import readline
import readline
import readline
import readline
import time
import sys
class Main ( readline ) :
    def __init__ ( self ) :
        self.w , h , n = readline.readline ( )
    def readline ( self ) :
        try :
            s = readline.strip ( )
        except EOFError :
            pass
        return s
    def readline ( self ) :
        return int ( readline.readline ( ) )
    def readline ( self ) :
        return float ( readline.readline ( ) )
    def readline ( self ) :
        try :
            data = readline ( )
        except EOFError :
            pass
        return data
    def solve ( ) :
        d = { }
        print ( dfs ( ( 0 , 0 , w , h ) ) )
    def dfs ( key ) :
        if key in d :
            return d [ key ]
        res = 0
        for i in range ( n ) :
            if key.lx <= xs [ i ] < key.rx and key.ly <= ys [ i ] < key.ry :
                ld , lu , rd , ru = dfs ( ( key.lx , key.ly , xs [ i ] , ys [ i ] ) )
                res = max ( res , ld + lu + rd + ru + key.rx - key.lx + key.ry - key.ly - 1 )
        d [ key ] = res
        return res
    def __eq__ ( self , other ) :
        if not isinstance ( other , readline ) :
            return other
        if isinstance ( other , ( readline , str ) ) or other.__class__ != Key :
            return other.__class__ != Key
        return other.__eq__
