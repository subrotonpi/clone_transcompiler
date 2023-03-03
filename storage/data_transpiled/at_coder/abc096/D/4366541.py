def import readline
import readline
import readline
import sys
class Main ( readline ) :
    def __init__ ( self ) :
        self.__debug__ = False
        self.fname = 'input.txt'
        self.__fast__ = True
        self.MOD = int ( 1e9 ) + 7
        self.INF = sys.maxsize / 2
        def solve ( ) :
            N = self.__mem ( )
            is_not_prime = [ ]
            for i in range ( 2 , 55555 , N ) :
                if not is_not_prime [ i ] :
                    if i % 5 == 2 :
                        print ( i + ( ( N == 1 ) and "\n" ) , end = ' ' )
                        N -= 1
                    for j in range ( i + i , 55555 + i ) :
                        is_not_prime.append ( True )
            return readline ( )
        def solve ( ) :
            N = self.__mem ( )
            if N < 0 or N > sys.maxsize :
                raise ValueError ( )
            return readline ( )
        def solve ( ) :
            S = time.time ( )
            self.__mem = ( sys.maxsize / 2 )
            self.__mem = sys.maxsize / 2
            self.__mem = sys.maxsize / 2
            self.__mem = sys.maxsize / 2
            self.__mem = sys.maxsize / 2
        def solve ( ) :
            G = time.time ( )
            if self.__debug__ :
                print ( '---Debug---' )
                print ( '%8d ms' % ( G - S ) )
    class FastScanner ( readline ) :
        def __init__ ( self ) :
            self.__mem = sys.maxsize / 2
            self.__mem = sys.maxsize / 2
            self.__mem = sys.maxsize / 2
        def __iter__ ( self ) :
            while self.__mem :
                self.__mem = self.__mem
