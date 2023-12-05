def import import sys , StringIO
import string
class MyScanner ( Scanner ) :
    def __init__ ( self ) :
        stream = sys.stdin
    def __next__ ( self ) :
        ret = 0
        try :
            while True :
                readed = stream.read ( 1 )
                if readed < '0' or readed > '9' :
                    break
                ret = ret * 10 + ( readed - '0' )
        except EOFError :
            pass
        finally :
            return ret
class MyScanner ( Scanner ) :
    def __init__ ( self , n , t = [ ] ) :
        Scanner.__init__ ( self )
        self.n = n
        self.t = [ ]
        self.sum = 0
        for i in range ( n ) :
            self.t.append ( self.t [ i ] )
            self.sum += self.t [ i ]
        m = len ( self.t )
        for i in range ( m ) :
            p , x = self.t [ i ] - 1 , self.x
            print ( self.sum - self.t [ p ] + x )
