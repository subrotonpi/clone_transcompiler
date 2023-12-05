def import import readline
import sys
import os
import getopt
class Main ( object ) :
    def __init__ ( self ) :
        self.stdin = open ( 'input.txt' , 'r' )
        self.stdout = open ( 'output.txt' , 'w' )
        self.write ( '%s\n' % self.stdout )
    def readword ( self ) :
        c = self.stdin.read ( 1 )
        while c >= 0 and c < '' : c = self.stdin.read ( 1 )
        if not c : return ''
        yield '%s: ' % ( self.stdin.readline ( ) )
        self.stdout.write ( '%s\n' % self.stdout )
    def solve ( self ) :
        n = int ( self.stdin.readline ( ) )
        a = [ ]
        A , B , C , D , x0 , y0 , M = [ int ( x ) for x in self.stdin.readline ( ).split ( '\n' ) ]
        for i in range ( n ) :
            a [ int ( x0 ) % 3 ] [ int ( y0 ) % 3 ] += 1
            x0 = ( A * x0 + B ) % M
            y0 = ( C * y0 + D ) % M
        result = 0
        for i in range ( 9 ) :
            for j in range ( i ) :
                for k in range ( j ) :
                    if ( i % 3 + j % 3 + k % 3 ) % 3 != 0 : continue
                    if ( i / 3 + j / 3 + k / 3 ) % 3 != 0 : continue
                    if i == j and j == k :
                        cc = a [ i % 3 ] [ i / 3 ]
                        result += cc * ( cc - 1 ) * ( cc - 2 ) / 6
                    else :
                        if i == j :
                            cc1 = a [ j % 3 ] [ j / 3 ]
                            cc2 = a [ k % 3 ] [ k / 3 ]
                            result += cc1 * ( cc1 - 1 ) / 2 * cc2
                        else :
                            if i == j :
                                cc1 = a [ j % 3 ] [ i / 3 ]
                                cc2 = a [ k % 3 ] [ k / 3 ]
                                result += cc1 * cc2
                        