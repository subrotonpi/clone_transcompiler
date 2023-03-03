def import _readline
import readline
import sys
import readline
import sys
class Main ( readline ) :
    def __init__ ( self ) :
        self.__debug__ = False
        self.file_name = 'input.txt'
        if self.__debug__ :
            self.__fileName = 'input.txt'
        else :
            self.__fileName = 'input.txt'
    def solve ( ) :
        n = self.__input ( )
        min = sys.maxint
        for i in range ( 1 , n + 1 ) :
            h = i
            w = n / h
            m = n - h * w
            min = min ( min , abs ( h - w ) + m )
        print ( min )
    def readline ( self ) :
        S = time.time ( )
        self.__sc = ( sys.stdin , sys.__stdout__ ) if self.__debug__ else sys.__stdout__
        solve ( )
        G = time.time ( )
        if self.__debug__ :
            print ( '---Debug---' )
            print ( '%7d ms' % ( G - S ) )
class FastScanner ( readline ) :
    def __init__ ( self ) :
        self.__sc = ( sys.stdin , sys.__stdout__ ) if self.__debug__ else sys.__sc
        self.__solve = solve
    def readline ( self ) :
        if not self.__sc :
            raise StopIteration
    def readline ( self ) :
        return self.__sc
    def readline ( self ) :
        return sys.stdin.readline ( )
    def has_next_byte ( self ) :
        if self.__ptr < self.__buflen :
            return True
        else :
            self.__ptr = 0
            try :
                self.__buf = self.__buf [ self.__ptr ]
            except IndexError :
                pass
            if self.__buf.length <= 0 :
                return False
        return True
    def readline ( self ) :
        return sys.stdin.readline ( )
