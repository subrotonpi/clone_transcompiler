def import _readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import time
import sys
class Main ( object ) :
    def __init__ ( self , name , args ) :
        sc = readline
        n = sc.readline ( )
        a = [ ]
        for i in range ( n ) :
            a.append ( sc.readline ( ) )
        start = end = 0
        v = 0
        s = 0
        ans = 0
        f = True
        while end < n :
            if f :
                s += a [ end ]
                v ^= a [ end ]
            if s == v :
                f = True
                end += 1
            else :
                f = False
                s = end - start
                ans += s
                s -= a [ start ]
                v ^= a [ start ]
                start += 1
        if f :
            s = ( end - start )
            ans += ( s * ( s - 1 ) ) / 2
            ans += s
        print ( ans )
    def readline ( self ) :
        s = None
        while not s or not s :
            s = s.strip ( )
        return s
    def readline ( self ) :
        while not s or not s :
            s = s.strip ( )
        return s
    def readline ( self ) :
        while s :
            s = s.strip ( )
        return readline ( self )
    def readline ( self ) :
        while s or not s :
            s = s.strip ( )
        return s
    def readline ( self ) :
        while s :
            s = s.strip ( )
        return readline
