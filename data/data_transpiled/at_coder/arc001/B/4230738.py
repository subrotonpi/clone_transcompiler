def import myfile
import sys
import string
import getopt
class MyScanner ( object ) :
    def __init__ ( self ) :
        sc = myfile
        n = sc.__next__ ( )
        s = sc.next ( )
        a = [ 0 ] * 4
        for i in range ( n ) :
            if s [ i ] == ord ( '1' ) :
                a [ 0 ] += 1
            elif s [ i ] == ord ( '2' ) :
                a [ 1 ] += 1
            elif s [ i ] == ord ( '3' ) :
                a [ 2 ] += 1
            elif s [ i ] == ord ( '4' ) :
                a [ 3 ] += 1
        a [ 3 ] = 1
        print ( a [ 3 ] , a [ 0 ] )
    def l_min ( a ) :
        a.sort ( )
        return a [ 0 ]
    def l_max ( a ) :
        l = len ( a )
        a.sort ( )
        return a [ l - 1 ]
class MyScanner ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
    def readline ( self ) :
        while not self.stdin.readline ( ) or not self.stdin.readline ( ) :
            try :
                self.stdin.readline ( )
            except EOFError :
                pass
        return self.stdin.readline ( )
    def randint ( self ) :
        return int ( self.stdin.readline ( ) )
    def long ( self ) :
        return long ( self.stdin.readline ( ) )
    def uniform ( self ) :
        return uniform ( )
    def readline ( self ) :
        data = ''
        try :
            data = open ( self.stdin.fileno ( ) , 'r' )
        except IOError :
            pass
        return data
