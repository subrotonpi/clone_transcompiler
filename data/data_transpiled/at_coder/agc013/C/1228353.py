def import io , StringIO
import sys
class MyInputStream ( io.InputStream ) :
    def read ( self ) :
        while ( 1 ) :
            i = io.read ( 1 )
            if not i :
                return - 1
            temp = 0
            while i > 47 :
                temp = temp * 10 + i - 48
                i = io.read ( 1 )
            return temp
    class Main ( io.InputStream ) :
        def __init__ ( self ) :
            self.N = 100005
            self.inf = 0x3f3f3f3f
            self.eps = 1e-6
            self.a = [ ]
        def read ( self ) :
            cin = MyInputStream ( )
            self.n , self.l , self.t = cin.read ( )
            self.tmp , cnt , d = 0 , 0 , 0
            for i in range ( self.n ) :
                self.a.append ( cin.read ( ) )
                d = cin.read ( )
                if d == 1 :
                    self.tmp = self.a [ i ] + t
                    self.a [ i ] = self.tmp % l
                    cnt += self.tmp // l
                else :
                    self.tmp = self.a [ i ] - t
                    self.a [ i ] = self.tmp % l
                    cnt += self.tmp // l
                    if self.a [ i ] < 0 :
                        self.a [ i ] += l
                        cnt -= 1
            self.a.sort ( )
            cnt %= self.n
            if cnt < 0 :
                cnt += self.n
            cnt %= self.n
            ans = [ '' ]
            for i in range ( cnt , cnt + self.n ) :
                j = i % self.n
                print ( j )
    return Main ( )
