def import _readline
import sys
import readline
import readline
import math
import sys
class Main ( object ) :
    def __init__ ( self ) :
        try :
            self.stdin = readline ( )
        except EOFError :
            self.stdin = open ( os.path.join ( os.path.dirname ( __file__ ) , 'data.in' ) )
            self.stdout = open ( os.path.join ( os.path.dirname ( __file__ ) , 'data.out' ) , 'w' )
    def readline ( self ) :
        return int ( self.stdin.readline ( ) )
    def readline ( self ) :
        return open ( os.path.join ( os.path.dirname ( __file__ ) , 'data.out' ) , 'w' )
    def readline ( self ) :
        return readline ( )
    def readline ( self ) :
        return readline ( )
    def readline ( self ) :
        return readline ( )
    def close ( self ) :
        return close ( self )
class Solver ( ) :
    def solve ( self , cin , cout ) :
        try :
            n = cin.__next__ ( )
            x = cin.__next__ ( )
            dis = [ ]
            for i in range ( 1 , n + 1 ) :
                dis.append ( cin.__next__ ( ) )
            for i in range ( 2 , n + 1 ) :
                dis [ i ] += dis [ i - 1 ]
            result = float ( 0 )
            for k in range ( 1 , ( n // 2 + 1 ) + 1 ) :
                tmp = 0
                for i in range ( 1 , ( n // k ) + 1 ) :
                    para = 0
                    if i == 1 :
                        para = 5
                    else :
                        para = ( 2 * i + 1 )
                    upper = n - ( i - 1 ) * k
                    lower = n - i * k
                    if lower < 0 :
                        lower = 0
                        tmp += ( dis [ upper ] - dis [ lower ] ) * para
                        break
                    else :
                        tmp += ( dis [ upper ] - dis [ lower ] ) * para
                    if tmp < 0 :
                        tmp = int ( k * x )
                        break
            return tmp