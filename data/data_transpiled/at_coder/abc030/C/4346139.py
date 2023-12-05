def import import sys
import time
import time
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.maxint
        self.m = sys.maxint
        self.x = sys.maxint
        self.y = sys.maxint
        self.a = [ ]
        self.b = [ ]
        for i in range ( self.n ) :
            self.a.append ( sys.stdin.read ( ) )
        for i in range ( self.m ) :
            self.b.append ( sys.stdin.read ( ) )
        self.count = 1
        now = 1
        time = self.a [ 0 ] + x
        while True :
            if now == 0 :
                if time > self.a [ self.n - 1 ] :
                    break
                ng = - 1
                ok = self.n - 1
                while ok - ng > 1 :
                    mid = ( ok + ng ) // 2
                    if self.a [ mid ] >= time :
                        ok = mid
                    else :
                        ng = mid
                now = 1
                time = self.a [ ok ] + x
                self.count += 1
            else :
                if time > self.b [ self.m - 1 ] :
                    break
                ng = - 1
                ok = self.m - 1
                while ok - ng > 1 :
                    mid = ( ok + ng ) // 2
                    if self.b [ mid ] >= time :
                        ok = mid
                    else :
                        ng = mid
                now = 0
                time = self.b [ ok ] + y
                self.count += 1
        print ( self.count / 2 )
